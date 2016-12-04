<%--
  Created by IntelliJ IDEA.
  User: Arci
  Date: 22.11.2016
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Administrátoři</title>
    <link rel="stylesheet" href="/resources/css/style_adm.css" type="text/css">
</head>
<body>
    <div class="big">
        <div class="big_top">
        </div>
        <div class="big_middle">
            <div class="menu_left">
                <img src="/resources/images/logo.png" alt="Letenky kormorán" />
                <%@ include file="menu.jsp" %>
            </div>
            <div class="content">
                <h1>Administrátor</h1>
                <h2>${user}</h2>
            </div>
        </div>
        <div class="big_bottom">
        </div>
    </div>
</body>
</html>
