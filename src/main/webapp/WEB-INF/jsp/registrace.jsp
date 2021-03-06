<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrace</title>
    <link rel="stylesheet" href="/resources/css/style.css" type="text/css">
</head>
<body>
<div id="page">
    <%@ include file="header.jsp"%>
    <div id="body" class="home">
        <div class="header">
            <div>
                <h1>REGISTRACE</h1>
                <div id="main-form">
                    <form action="registrace.jsp" method="post">
                        <table>
                        <tr><td style="text-align: right">Jméno:</td><td style="text-align: left"><input type="text" name="jmeno" class="longer"></td></tr>
                            <tr><td style="text-align: right">Příjmení:</td><td style="text-align: left"><input type="text" name="prijmeni" class="longer"></td></tr>
                            <tr><td style="text-align: right">E-mail:</td><td style="text-align: left"><input type="mail" name="email" class="longer"></td></tr>
                            <tr><td style="text-align: right">Telefon:</td><td style="text-align: left"><input type="text" name="telefon" class="longer"></td></tr>
                            <tr><td style="text-align: right">Login:</td><td style="text-align: left"><input type="text" name="login" class="longer"></td></tr>
                            <tr><td style="text-align: right">Heslo:</td><td style="text-align: left"><input type="text" name="heslo" class="longer"></td></tr>
                            <tr><td style="text-align: right">Ověření hesla:</td><td style="text-align: left"><input type="text" name="heslo2" class="longer"></td></tr>
                            <tr><td colspan="2"><span id="registrace">Přeji si odebírat novinky na mail </span><input type="checkbox" name="novinky" value="1"></td></tr>
                            <tr><td colspan="2"><span id="registrace">Souhlasím s podmínami užívání </span><input type="checkbox" name="podminky" value="1"></td></tr>
                            <tr><td colspan="2"><input type="submit" value="Registrovat" class="tlacitko"></td></tr>
                        </table>
                    </form>
                </div>
            </div>
        </div>
        <div class="body">
            <div>
                <h1>SLEVA</h1>
                <p>Máte jedinečnou možnost ušetřit až 40% na zpátečních letenkách!</p>
                <a href="#" class="more">Mám zájem</a>
            </div>
        </div>
    </div>
    <%@ include file="footer.jsp"%>
</div>
</body>
</html>