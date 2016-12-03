<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kontakty</title>
    <link rel="stylesheet" href="/resources/css/style.css" type="text/css">
</head>
<body>
<div id="page">
    <%@ include file="header.jsp"%>
    <div id="body" class="contact">
        <div>
            <h1>KONTAKTY</h1>
            <img src="/resources/images/map.png" alt="">
            <h2>ADRESA</h2>
            <p>Pepík Hnátek<br>
            Slavoj Houslice 15<br>
            128 58</p>
            <h2>TELEFON</h2>
            <a href="#">737 018 682</a>
            <h2>E-MAIL</h2>
            <a href="#">pepik.hnat@gmail.com</a>
            <h4>NAPIŠTE NÁM</h4>
            <form action="#">
                <input type="text" name="name" value="Jméno" onblur="this.value=!this.value?'Jméno':this.value;" onfocus="this.select()" onclick="this.value='';">
                <input type="text" name="Telefon" value="Telefon" onblur="this.value=!this.value?'Telefon':this.value;" onfocus="this.select()" onclick="this.value='';">
                <input type="text" name="Email" value="E-mail" onblur="this.value=!this.value?'E-mail':this.value;" onfocus="this.select()" onclick="this.value='';">
                <textarea name="meassage" cols="50" rows="7" placeholder="Zpráva"></textarea>
                <input type="submit" value="Poslat" id="submit">
            </form>
        </div>
    </div>
    <%@ include file="footer.jsp"%>
</div>
</body>
</html>
