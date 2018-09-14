package com.jsxsdqc.utils;


import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Created by NianYuan on 2018/7/8.
 */
public class JsonUtil {

    /**
     * 将一个对象转换成json字符串
     */
    @SuppressWarnings("rawtypes")
    public static String objectToJson(Object object) {
        StringBuilder json = new StringBuilder();
        if (object == null) {
            json.append("\"\"");
        } else if (object instanceof Integer || object instanceof Short) {
            json.append("\"").append(object).append("\"");
        } else if (object instanceof String) {
            String value = (String) object;
            // 处理特殊字符
            value = value.replaceAll("\r\n", "\\\\u000d\\\\u000a");
            value = value.replaceAll("\n", "\\\\u000d\\\\u000a");
            value = value.replaceAll("\"", "'");
            value = value.replaceAll("\'", "\\'");
            value = value.replaceAll("\\\\", "/");
            value = StringEscapeUtils.escapeHtml3(value);
            json.append("\"").append(value).append("\"");

        } else if (object instanceof Date) {
            json.append("\"").append(formateDate((Date) object)).append("\"");
        } else if (object instanceof Boolean) {
            json.append("\"").append(object).append("\"");
        } else if (object instanceof List) {
            json.append(listToJson((List) object));
        } else if (object instanceof Map) {
            json.append(MaptoJson((Map) object));
        } else {
            json.append(beanToJson(object));
        }
        return json.toString();
    }

    /**
     * 将一个bean对象转换成json字符串
     */
    public static String beanToJson(Object bean) {
        StringBuilder json = new StringBuilder();
        json.append("{");
        PropertyDescriptor[] props = null;
        try {
            props = Introspector.getBeanInfo(bean.getClass(), Object.class).getPropertyDescriptors();
        } catch (IntrospectionException e) {
        }
        if (props != null) {
            for (int i = 0; i < props.length; i++) {
                try {
                    String name = objectToJson(props[i].getName());
                    String value = objectToJson(props[i].getReadMethod().invoke(bean));
                    json.append(name);
                    json.append(":");
                    json.append(value);
                    json.append(",");
                } catch (Exception e) {
                }
            }
            json.setCharAt(json.length() - 1, '}');
        } else {
            json.append("}");
        }
        return json.toString();
    }

    /**
     * 将一个集合转换成json字符串
     */
    public static String listToJson(List<?> list) {
        StringBuilder json = new StringBuilder();
        json.append("[");
        if (list != null && list.size() > 0) {
            for (Object obj : list) {
                json.append(objectToJson(obj));
                json.append(",");
            }
            json.setCharAt(json.length() - 1, ']');
        } else {
            json.append("]");
        }
        return json.toString();
    }

    /**
     * 将一个map转换成json字符串
     */
    public static String MaptoJson(Map<?, ?> map) {
        Set<?> keys = map.keySet();
        Object key = null;
        Object value = null;
        StringBuffer jsonBuffer = new StringBuffer();
        jsonBuffer.append("{");
        for (Iterator<?> it = keys.iterator(); it.hasNext(); ) {
            key = it.next();
            value = map.get(key);
            if (key == null && value == null) {
                continue;
            }
            jsonBuffer.append("\"" + key.toString() + "\":" + objectToJson(value));
            if (it.hasNext()) {
                jsonBuffer.append(",");
            }

        }
        jsonBuffer.append("}");
        return jsonBuffer.toString();
    }

    public static String replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }

    /**
     * 格式化时间
     */
    private static String formateDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        if (date != null) {
            return formatter.format(date);
        }
        return "";
    }

    /**
     * json特殊字符串处理
     *
     * @param strjson
     * @return
     */
    public static String ToJson(String strjson) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strjson.length(); i++) {
            char c = strjson.toCharArray()[i]; // strjosn转换为字节数组
            switch (c) {
                case '\"':
                    sb.append("\\\"");
                    break;
                case '\\':
                    sb.append("\\\\");
                    break;
                // case '/': sb.append("\\/"); break;
                case '\b':
                    sb.append("\\b");
                    break;
                case '\f':
                    sb.append("\\f");
                    break;
                case '\n':
                    sb.append("\\n");
                    break;
                case '\r':
                    sb.append("\\r");
                    break;
                case '\t':
                    sb.append("\\t");
                    break;
                default:
                    sb.append(c);
                    break;
            }
        }
        return sb.toString();
    }

}
