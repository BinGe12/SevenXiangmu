package com.jk.controller;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mr.wangbin on 2017/11/14.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public void test(HttpServletResponse response, HttpServletRequest request){

        try {

            response.setContentType("text/plain");
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0);
            Map<String,String> map = new HashMap<String,String>();
            map.put("result", "content");
            PrintWriter out = response.getWriter();
           // JSONObject resultJSON = JSONObject.fromObject(map); //根据需要拼装json
           // String jsonpCallback = request.getParameter("jsonpCallback");//客户端请求参数
           // out.println("asdf");//返回jsonp格式数据
            JSONObject resultJSON = JSONObject.fromObject(map); //根据需要拼装json
            String jsonpCallback = request.getParameter("jsonpCallback");//客户端请求参数
            out.println(jsonpCallback+"(2123123)");//返回jsonp格式数据
            out.flush();
            out.close();


            //response.getWriter().write("11");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
