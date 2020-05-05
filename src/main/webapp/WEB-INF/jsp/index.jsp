<%@ page import="java.io.File" %>
<%@ page import="java.io.IOException" %>
<%@ page import="by.gvu.jd2.bean.UserToken" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>IShop</title>
    <jsp:include page="/WEB-INF/jsp/library.jsp"/>
</head>
<body>
    <div class="main-frame">
        <div class="main-header"><jsp:include page="/WEB-INF/jsp/header.jsp"/></div>
        <div class="main-menu"><jsp:include page="/WEB-INF/jsp/menu.jsp"/></div>
        <div class="main-content"><jsp:include page="/WEB-INF/jsp/content.jsp"/></div>
        <div class="main-footer"><jsp:include page="/WEB-INF/jsp/footer.jsp"/></div>
    </div>
</body>
</html>
