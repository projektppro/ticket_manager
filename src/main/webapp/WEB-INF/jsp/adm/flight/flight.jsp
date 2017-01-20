<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lety</title>
    <link rel="stylesheet" href="/resources/css/style_adm.css" type="text/css">
</head>
<body>
    <div class="big">
        <div class="big_top">
        </div>
        <div class="big_middle">
            <div class="menu_left">
                <img src="/resources/images/logo.png" alt="Letenky kormorán" />
                <%@ include file="../menu.jsp" %>
            </div>
            <div class="content">
                <h1>Lety</h1>
                <a href="/adm/flight/add_flight_form">
                    <input type="submit" value="Vytvořit nový let" />
                </a>
                <table>
                    <tr>
                        <th>
                            Název letu
                        </th>
                        <th>
                            Datum odletu
                        </th>
                        <th>
                            Čas odletu
                        </th>
                        <th>
                            Místo odletu
                        </th>
                        <th>
                            Místo příletu
                        </th>
                        <th>
                            Počet volných míst
                        </th>
                        <th>
                            Cena letenky
                        <th>
                    </tr>
                </table>
            </div>
        </div>
        <div class="big_bottom">
        </div>
    </div>
</body>
</html>