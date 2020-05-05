<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="by.gvu.jd2.bean.UserToken" %>
<div class="main align-middle text-center">
<%
    UserToken user = null;
    if (request.getAttribute("USERTOKEN")!=null)
        user = (UserToken)request.getAttribute("USERTOKEN");

    if (user!=null){
%>
    <%=user.getnName() %><button type="button" class="btn btn-outline-danger">Выход</button>
<%
    } else {
%>
    <a class="btn btn-primary" href="Registration">Регистрация</a>
    <a class="btn btn-success" href="Login">Вход</a>
<%
    }
%>
</div>