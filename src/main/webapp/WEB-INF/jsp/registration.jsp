<%@ page import="by.gvu.jd2.bean.UserForm" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Регистрация</title>
    <jsp:include page="/WEB-INF/jsp/library.jsp"/>
</head>
<body>
<%
    UserForm userForm = null;
    if (request.getAttribute("RegistrationFormError")!=null)
        userForm = (UserForm)request.getAttribute("RegistrationFormError");

    UserForm userFormValues = null;
    if (request.getAttribute("RegistrationForm")!=null)
        userFormValues = (UserForm)request.getAttribute("RegistrationForm");
%>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="card">
                <div class="card-header">Регистрация</div>
                <div class="card-body">

                    <form class="form-horizontal" method="post" action="Controller">

                        <div class="form-group">
                            <label for="login" class="cols-sm-2 control-label">Login</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control <%=(userForm==null?"":(userForm.getLogin()==null?"":"border border-danger"))%>" name="login" id="login" placeholder="Введите Login" value="<%=userFormValues==null?"":userFormValues.getLogin() %>"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="password" class="cols-sm-2 control-label">Пароль</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                    <input type="password" class="form-control <%=(userForm==null?"":(userForm.getPassword()==null?"":"border border-danger"))%>" name="password" id="password" placeholder="Введите пароль" value="<%=userFormValues==null?"":userFormValues.getPassword() %>"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="passwordConfirm" class="cols-sm-2 control-label">Подтверждение пароля</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                    <input type="password" class="form-control <%=(userForm==null?"":(userForm.getPasswordConfirm()==null?"":"border border-danger"))%>" name="passwordConfirm" id="passwordConfirm" placeholder="Повторите пароль" value="<%=userFormValues==null?"":userFormValues.getPasswordConfirm() %>" />
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="email" class="cols-sm-2 control-label">Email</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control <%=(userForm==null?"":(userForm.getEmail()==null?"":"border border-danger"))%>" name="email" id="email" placeholder="Введите Email" value="<%=userFormValues==null?"":userFormValues.getEmail() %>" />
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="fname" class="cols-sm-2 control-label">Имя</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-usersMySql fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control <%=(userForm==null?"":(userForm.getfName()==null?"":"border border-danger"))%>" name="fname" id="fname" placeholder="Имя" value="<%=userFormValues==null?"":userFormValues.getfName() %>" />
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="sname" class="cols-sm-2 control-label">Фамилия</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-usersMySql fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control <%=(userForm==null?"":(userForm.getsName()==null?"":"border border-danger"))%>" name="sname" id="sname" placeholder="Фамилия" value="<%=userFormValues==null?"":userFormValues.getsName() %>" />
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="nname" class="cols-sm-2 control-label">Псевдоним</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-usersMySql fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control <%=(userForm==null?"":(userForm.getnName()==null?"":"border border-danger"))%>" name="nname" id="nname" placeholder="Псевдоним" value="<%=userFormValues==null?"":userFormValues.getnName() %>" />
                                </div>
                            </div>
                        </div>
                        <div class="form-group ">
                            <button type="submit" class="btn btn-primary btn-lg btn-block login-button">Register</button>
                        </div>
                        <div class="form-group ">
                            <a type="button" class="btn btn-primary btn-dark btn-block login-button" href="/gvuShop">Назад</a>
                        </div>

                        <input type="hidden" name="command" value="registration"/>
                    </form>
                </div>

            </div>
        </div>
    </div>
</div>

</body>
</html>
