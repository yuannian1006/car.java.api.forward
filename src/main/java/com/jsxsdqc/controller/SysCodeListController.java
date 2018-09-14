package com.jsxsdqc.controller;

import com.jsxsdqc.common.Constant;
import com.jsxsdqc.utils.HttpUtil;
import com.jsxsdqc.utils.JsonUtil;
import com.jsxsdqc.vo.SysCodeListParamVo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NianYuan
 * @date 2018/7/8.
 *
 * 订单查询接口
 *

 */
@RestController
public class SysCodeListController {

    @Value("${api.prefix}")
    private String prefixUrl;

    /**
     * <p>分页查询编码值</p>
     * @param paramVo
     * @param servletRequest
     * @return
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    @PostMapping("/querylistByPage")
    public String querylistByPage(@RequestBody SysCodeListParamVo paramVo, HttpServletRequest servletRequest)
            throws IllegalAccessException, InvocationTargetException {

        String url = prefixUrl + "/system/ppOrder/querylistByPage";
        Map<String, String> map = new HashMap<String, String>(2);

        Enumeration<String> headerNames = servletRequest.getHeaderNames();

        while (headerNames.hasMoreElements()) {

            if (Constant.TOKEN_KEY.equals(headerNames.nextElement())) {
                map.put(Constant.TOKEN_KEY, servletRequest.getHeader(Constant.TOKEN_KEY));
            }
        }

        return HttpUtil.postJsonwithheader(url, JsonUtil.beanToJson(paramVo), map.get(Constant.TOKEN_KEY));
    }
}
