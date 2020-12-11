<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 2020/6/28
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl</title>
</head>
<body>

<%--

c:if
1. 属性：
    test 必须属性, 接收boolean表达式
        如果表达式为true, 则显示if标签体内容, 如果为false, 则不显示标签体内容
        一般情况下, test属性会结合EL表达式一起使用
        注意: c:if标签没有else情况
--%>
<c:if test="true">
    <h1>我是真......</h1>
</c:if>
<br>
<%
    List list = new ArrayList();
    list.add("aaa");
    request.setAttribute("list",list);
    
    request.setAttribute("number", 3);
%>
<c:if test="${not empty list}">
    遍历集合
    
</c:if>
<br>
<c:if test="${number%2!=0}">
    ${number}为奇数
</c:if>

<c:if test="${number%2==0}">
    ${number}为偶数
</c:if>

</body>
</html>
