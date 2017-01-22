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
        <h1>Nabídka letů</h1>
        <div id="main-form">
            <div class="flight">
                <h2>Název letu</h2>
                <table>
                    <tr>
                        <td><strong>Aerolinka:</strong></td>
                        <td>ČSA</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td><strong>Datum odletu:</strong></td>
                        <td>11.2.2017</td>
                        <td>13:00</td>
                    </tr>
                    <tr>
                        <td><strong>Místo odletu</strong></td>
                        <td>Česká republika</td>
                        <td>Praha</td>
                    </tr>
                    <tr>
                        <td><strong>Místo příletu:</strong></td>
                        <td>Slovensko</td>
                        <td>Bratislava</td>
                    </tr>
                    <tr>
                        <td><strong>Číslo letu:</strong></td>
                        <td>1</td>
                    </tr>
                    <tr>
                        <td><strong>Cena:</strong></td>
                        <td>3999 Kč</td>
                        <td><a href="/objednani"><input type="submit" value="Rezervovat" /></a></td>
                    </tr>
                </table>
            </div>

            <div class="flight">
                <h2>Název letu</h2>
                <table>
                    <tr>
                        <td><strong>Aerolinka:</strong></td>
                        <td>ČSA</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td><strong>Datum odletu:</strong></td>
                        <td>11.2.2017</td>
                        <td>13:00</td>
                    </tr>
                    <tr>
                        <td><strong>Místo odletu</strong></td>
                        <td>Česká republika</td>
                        <td>Praha</td>
                    </tr>
                    <tr>
                        <td><strong>Místo příletu:</strong></td>
                        <td>Slovensko</td>
                        <td>Bratislava</td>
                    </tr>
                    <tr>
                        <td><strong>Číslo letu:</strong></td>
                        <td>2</td>
                    </tr>
                    <tr>
                        <td><strong>Cena:</strong></td>
                        <td>3999 Kč</td>
                        <td><a href="/objednani"><input type="submit" value="Rezervovat" /></a></td>
                    </tr>
                </table>
            </div>

            <div class="flight">
                <h2>Název letu</h2>
                <table>
                    <tr>
                        <td><strong>Aerolinka:</strong></td>
                        <td>ČSA</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td><strong>Datum odletu:</strong></td>
                        <td>11.2.2017</td>
                        <td>13:00</td>
                    </tr>
                    <tr>
                        <td><strong>Místo odletu</strong></td>
                        <td>Česká republika</td>
                        <td>Praha</td>
                    </tr>
                    <tr>
                        <td><strong>Místo příletu:</strong></td>
                        <td>Slovensko</td>
                        <td>Bratislava</td>
                    </tr>
                    <tr>
                        <td><strong>Číslo letu:</strong></td>
                        <td>3</td>
                    </tr>
                    <tr>
                        <td><strong>Cena:</strong></td>
                        <td>3999 Kč</td>
                        <td><a href="/objednani"><input type="submit" value="Rezervovat" /></a></td>
                    </tr>
                </table>
            </div>
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