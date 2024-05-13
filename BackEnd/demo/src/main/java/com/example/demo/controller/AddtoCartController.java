package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddtoCartController {
    @RequestMapping("/getBookAddedtoCartInfo")
    public String getBookAddedtoCartInfo(HttpServletRequest request) {
        String id = request.getParameter("id");
        System.out.println(id);
        if(id != null) return "请求确认";
        else return "空数据！";
    }
}
