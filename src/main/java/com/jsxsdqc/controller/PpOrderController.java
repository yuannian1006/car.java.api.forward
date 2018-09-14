package com.jsxsdqc.controller;

import com.jsxsdqc.utils.HttpUtil;
import com.jsxsdqc.utils.JsonUtil;
import com.jsxsdqc.vo.PpOrderAddVo;
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
 * 用户下单接口
 */

@RestController
public class PpOrderController {

    private static final String TOKEN_KEY = "authorization";

    @Value("${api.prefix}")
    private String prefixUrl;

    /**
     * <p>新增订单信息表</p>
     *
     * @param
     * @param servletRequest
     * @return
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    @PostMapping(value = "add")
    public String add(@RequestBody PpOrderAddVo ppOrderAddVo, HttpServletRequest servletRequest)
            throws IllegalAccessException, InvocationTargetException {

        String url = prefixUrl + "/system/ppOrder/add";
        Map<String, String> map = new HashMap<String, String>(2);

        Enumeration<String> headerNames = servletRequest.getHeaderNames();

        while (headerNames.hasMoreElements()) {

            if (TOKEN_KEY.equals(headerNames.nextElement())) {
                map.put(TOKEN_KEY, servletRequest.getHeader(TOKEN_KEY));
            }
        }

        return HttpUtil.postJsonwithheader(url, JsonUtil.beanToJson(ppOrderAddVo), map.get("TOKEN_KEY"));
    }
}
