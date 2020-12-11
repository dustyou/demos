package cn.itcast.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决中文乱码
        response.setContentType("text/html;charset=utf-8");
        //设置响应的数据格式为json
        response.setContentType("application/json;charset=utf-8");
        //1. 获取用户名
        String username = request.getParameter("username");
        //2. 调用service层判断用户名是否存在
    
        //期望服务器响应会的数据格式: {"userExist": true, "msg": "此用户名太受欢迎, 请更换一个"}
        //                      {"userExist": false, "msg": "用户名可用"}
        Map<String, Object> map = new HashMap<>();
        
        if ("tom".equals(username)) {
            //存在
            map.put("userExist", true);
            map.put("msg", "此用户名太受欢迎, 请更换一个");
        } else {
            //不存在
            map.put("userExist", false);
            map.put("msg", "用户名可用");
        }
        //将map转为json, 并且传递给客户端
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getWriter(), map);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
