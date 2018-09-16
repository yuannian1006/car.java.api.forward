package com.jsxsdqc.controller;

import com.jsxsdqc.utils.HttpUtil;
import com.jsxsdqc.utils.JsonUtil;
import com.jsxsdqc.vo.PpOrderDetailXVo;
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
 * @author: YuanNian
 * @Date: 2018/9/16 19:32.
 */
@RestController
public class PpOrderDetailController {

    private static final String TOKEN_KEY = "authorization";

    @Value("${api.prefix}")
    private String prefixUrl;


    /**
     * <p>分页查询</p>
     *
     * @param xvo
     * @param request
     * @return
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    @PostMapping(value = "queryXXL")
    public String querylistByPage(@RequestBody PpOrderDetailXVo xvo, HttpServletRequest request) {
        String url = prefixUrl + "/system/ppOrderDetail/queryXXL";
        Map<String, String> map = new HashMap<String, String>(2);

        Enumeration<String> headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()) {

            if (TOKEN_KEY.equals(headerNames.nextElement())) {
                map.put(TOKEN_KEY, request.getHeader(TOKEN_KEY));
            }
        }

        return HttpUtil.postJsonwithheader(url, JsonUtil.beanToJson(xvo), map.get(TOKEN_KEY));
    }

}
