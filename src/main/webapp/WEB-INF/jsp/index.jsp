<%--
  Created by IntelliJ IDEA.
  User: Arci
  Date: 22.11.2016
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Letenky kormorán</title>
  <link rel="stylesheet" href="/resources/css/style.css" type="text/css">
</head>
<body>
<div id="page">
<%@ include file="header.jsp"%>
  <div id="body" class="home">
    <div class="header">
      <div>
        <h1>POLEŤTE<br>S NÁMI<br>ZA SLUNCEM</h1>
        <!-- TODO -->
        <div id="main-form">
          <form:form method="post" action="nabidka_letu">
            <table>
              <tr><td style="text-align: right">Odkud:</td><td style="text-align: left"><input type="text" placeholder="Zadejte místo odletu" name="odkud" class="longer"></td></tr>
              <tr><td style="text-align: right">Kam:</td><td style="text-align: left"><input type="text" placeholder="Zadejte destinaci" name="kam" class="longer"></td></tr>
              <tr><td style="text-align: right">Odlet:</td><td style="text-align: left"><input type="text" placeholder="DD.MM.RRRR" name="odlet" class="shorter"></td></tr>
              <tr><td style="text-align: right"> Návrat:</td><td style="text-align: left"><input type="text" placeholder="DD.MM.RRRR" name="navrat" class="shorter"></td></tr>
              <tr><td style="text-align: right">Počet osob:</td><td style="text-align: left"><input type="text" placeholder="1" name="kolik" class="shortest"></td></tr>
              <tr><td colspan="2"><a href="/nabidka_letu"><input type="submit" value="Hledat" class="tlacitko"></a></td></tr>
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
