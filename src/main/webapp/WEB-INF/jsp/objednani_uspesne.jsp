<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Objednání úspěšné</title>
    <link rel="stylesheet" href="/resources/css/style.css" type="text/css">
</head>
<body>
<div id="page">
    <%@ include file="header.jsp"%>
    <div id="body" class="home">
        <div class="header">
            <div>
                <h1>ÚSPĚŠNÁ REZERVACE</h1>
                <div id="main-form">
                    <div class="objednani_uspesne">
                        Vaše letenky byly úspěšně zarezervovány. Potvrzení jsme Vám zaslali na Váš e-mail.<br />
                        Děkujeme za využití webu Letenky Kormorán.
                    </div>
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