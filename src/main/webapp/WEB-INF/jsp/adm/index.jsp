<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Přehled</title>
    <link rel="stylesheet" href="/resources/css/style_adm.css" type="text/css">
</head>
<body>
    <div class="big">
        <div class="big_top">
        </div>
        <div class="big_middle">
            <div class="menu_left">
                <img src="/resources/images/logo.png" alt="Letenky kormorán" />
                <%@ include file="./menu.jsp" %>
            </div>
            <div class="content">
                <h1>Přehled</h1>
                <h2>Přehled letů</h2>
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
                <h2>Přehled letadel</h2>
                <table>
                    <tr>
                        <th>
                            Označení letadla
                        </th>
                        <th>
                            Název aerolinky
                        </th>
                        <th>
                            Max počet míst
                        </th>
                    </tr>
                </table>
                <h2>Přehled destinací</h2>
                <table>
                    <tr>
                        <th>
                            Název letiště
                        </th>
                        <th>
                            Město
                        </th>
                        <th>
                            Stát
                        </th>
                    </tr>
                </table>
            </div>
        </div>
        <div class="big_bottom">
        </div>
    </div>
</body>
</html>