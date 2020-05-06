<%@ page import="by.gvu.jd2.bean.UserForm" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Авторизация</title>
    <jsp:include page="/WEB-INF/jsp/library.jsp"/>
</head>
<body>
<%
    UserForm userForm = null;
    if (request.getAttribute("LoginFormError")!=null)
        userForm = (UserForm)request.getAttribute("LoginFormError");

    UserForm userFormValues = null;
    if (request.getAttribute("LoginForm")!=null)
        userFormValues = (UserForm)request.getAttribute("LoginForm");
%>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="card">
                <div class="card-header">Авторизация</div>
                <div class="card-body">

                    <form class="form-horizontal" method="post" action="Controller">

                        <div class="form-group">
                            <label for="login" class="cols-sm-2 control-label">Login</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control <%=(userForm==null?"":(userForm.getLogin()==null?"":"border border-danger"))%>" name="login" id="login" placeholder="Введите Login" value="<%=userFormValues==null?"":userFormValues.getLogin() %>" />
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="password" class="cols-sm-2 control-label">Пароль</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                    <input type="password" class="form-control <%=(userForm==null?"":(userForm.getPassword()==null?"":"border border-danger"))%>" name="password" id="password" placeholder="Введите пароль" value="<%=userFormValues==null?"":userFormValues.getPassword() %>" />
                                </div>
                            </div>
                        </div>
                        <div class="form-group ">
                            <button type="submit" class="btn btn-primary btn-lg btn-block login-button">Войти</button>
                        </div>
                        <div class="form-group ">
                            <a type="button" class="btn btn-primary btn-dark btn-block login-button" href="/gvuShop">Назад</a>
                        </div>

                        <input type="hidden" name="command" value="login"/>
                    </form>
                </div>

            </div>
        </div>
    </div>
</div>

</body>
</html>
