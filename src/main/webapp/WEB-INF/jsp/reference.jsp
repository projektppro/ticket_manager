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
    <title>Reference</title>
    <link rel="stylesheet" href="/resources/css/style.css" type="text/css">
</head>
<body>
<div id="page">
    <%@ include file="header.jsp" %>
    <div id="body">
        <div>
            <h1>REFERENCE ZÁKAZNÍKŮ</h1>
            <!-- TODO DOdělat načítání recenzí z DB -->
            <ul>
                <li>
                    <div class="crop">
                        <img src="/resources/images/logo.png" alt="">
                    </div>
                    <div>
                        <h1>Výborné služby!</h1>
                        <p>Our website templates are created with inspiration, checked for quality and originality and meticulously sliced and coded. What’s more, they’re absolutely free! You can do a lot with them. You can modify them...</p>
                        <a href="#" class="more">číst dále</a>
                    </div>
                </li>
                <li>
                    <div class="crop">
                        <img src="/resources/images/logo.png" alt="">
                    </div>
                    <div>
                        <h1>Super!</h1>
                        <p>Our website templates are created with inspiration, checked for quality and originality and meticulously sliced and coded. What’s more, they’re absolutely free! You can do a lot with them. You can modify them...</p>
                        <a href="#" class="more">číst dále</a>
                    </div>
                </li>
                <li>
                    <div class="crop">
                        <img src="/resources/images/logo.png" alt="">
                    </div>
                    <div>
                        <h1>Krásný web</h1>
                        <p>Our website templates are created with inspiration, checked for quality and originality and meticulously sliced and coded. What’s more, they’re absolutely free! You can do a lot with them. You can modify them...</p>
                        <a href="#" class="more">číst dále</a>
                    </div>
                </li>
                <li>
                    <div class="crop">
                        <img src="/resources/images/logo.png" alt="">
                    </div>
                    <div>
                        <h1>Výborné ceny</h1>
                        <p>Our website templates are created with inspiration, checked for quality and originality and meticulously sliced and coded. What’s more, they’re absolutely free! You can do a lot with them. You can modify them...</p>
                        <a href="#" class="more">číst dále</a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
    <%@ include file="footer.jsp" %>
</div>
</body>
</html>
