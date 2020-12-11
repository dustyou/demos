package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/requestdemo05")
public class RequestDemo05 extends HttpServlet {
    
    boolean flag = true;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求消息体--请求参数
        
        //1. 获取字符流
        BufferedReader reader = req.getReader();
        //2. 读取数据
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            System.out.println(flag);
            flag = !flag;
        }
    
    
    }
}
