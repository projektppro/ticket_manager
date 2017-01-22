<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Přihlášení do administrace</title>
    <link rel="stylesheet" href="/resources/css/style_adm.css" type="text/css">
    <%--<link href="<c:url value='/WEB-INF/static/css/bootstrap.css' />"  rel="stylesheet"></link>--%>
    <%--<link href="<c:url value='/WEB-INF/static/css/app.css' />" rel="stylesheet"></link>--%>
    <%--<link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />--%>
</head>
<body>
<div class="big">
    <div class="big_top">
    </div>
    <div class="big_middle">
        <div class="menu_left">
            <img src="/resources/images/logo.png" alt="Letenky kormorán" />
        </div>
        <div class="content">
            <h1>Přihlášení do administračního rozhraní</h1>
            <div class="login-container">
                <div class="login-card">
                    <div class="login-form">
                        <c:url var="loginUrl" value="/login" />
                        <form action="${loginUrl}" method="post" class="form-horizontal">
                            <div class="input-group input-sm">
                                <label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>
                                <input type="text" class="form-control" id="username" name="ssoId" placeholder="Jméno" required>
                            </div>
                            <div class="input-group input-sm">
                                <label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label>
                                <input type="password" class="form-control" id="password" name="password" placeholder="Heslo" required>
                            </div>
                            <input type="hidden" name="${_csrf.parameterName}"   value="${_csrf.token}" />

                            <div class="form-actions">
                                <input type="submit"
                                       class="btn btn-block btn-primary btn-default" value="Přihlásit">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="big_bottom">
    </div>
</div>
</body>
</html>