<%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 01.12.2016
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Přihlášení</title>
    <link rel="stylesheet" href="/resources/css/style.css" type="text/css">
</head>
<body>
<div id="page">
    <%@ include file="header.jsp"%>
    <div id="body" class="home">
        <div class="header">
            <div>
                <h1>PŘIHLÁŠENÍ</h1>
                <div id="main-form">
                    <form action="prihlaseni.jsp" method="post">
                        <table>
                            <tr><td style="text-align: right">Login:</td><td style="text-align: left"><input type="text" name="login" class="longer"></td></tr>
                            <tr><td style="text-align: right">Heslo:</td><td style="text-align: left"><input type="text" name="heslo" class="longer"></td></tr>
                            <tr><td colspan="2"><a href="registrace.jsp" id="registrace">Registujte se zde.</a></td></tr>
                            <tr><td colspan="2"><input type="submit" value="Přihlásit" class="tlacitko"></td></tr>
                        </table>
                    </form>
                </div>
            </div>
        </div>
        <div class="body">
            <div>
                <h1>SLEVA</h1>
                <p>Máte jedinečnou možnost ušetřit až 40% na zpátečních letenkách!</p>
                <a href="blog.html" class="more">Mám zájem</a>
            </div>
        </div>
    </div>
    <%@ include file="footer.jsp"%>
</div>
</body>
</html>
