package com.jsxsdqc.controller;

import javax.servlet.http.HttpServletRequest;

import com.jsxsdqc.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsxsdqc.utils.HttpUtil;
import com.jsxsdqc.vo.UserInfoVo;

/**
 * @author NianYuan
 * @date 2018/7/8.
 *
 * 用户登录接口
 */

@RestController
public class SysUserController {

    @Value("${api.prefix}")
    private String prefixUrl;

    /**
     * <p>用户登录</p>
     *
     * @param user
     * @param servletRequest
     * @return
     */
    @PostMapping(value = "login")
    public String helloWorld(@RequestBody UserInfoVo user, HttpServletRequest servletRequest) {

        String url = prefixUrl + "/system/user/login";
        System.out.println("请求过来了 " + user);

        return HttpUtil.postJson(url, JsonUtil.beanToJson(user));
    }

}
