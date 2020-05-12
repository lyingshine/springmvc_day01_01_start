package com.lyingshine.controller;

import com.lyingshine.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.DispatcherServlet;


/**
 * RequestMapping
 * 1.path  设置映射路径
 * 2.method  设置请求方法
 * 3.header 设置请求头
 * 4.params 设置请求参数
 * 5.请求参数绑定
 * RequesetParam
 * 前端与后端命名不一致的解决方案
 * RequestBody
 * 将指定参数设置为请求体容器
 * PathVariable
 *  Restful风格自定义参数占位符  只有携带该参数格式的请求才能调用被其修饰的方法
 * RequestHeader
 * 将指定参数设置为请求头容器
 * CookieValue
 * 将指定参数设置为Cookie容器
 * ModelAttribute
 * 一次请求的临时容器
 * SessionAttributes
 * 一次会话的临时容器
 *
 * */

@Controller
public class HelloController {
    @RequestMapping(path = "/hello")
    public String sayHello(User user){
        System.out.println(user);
        return "success";

    }
}
