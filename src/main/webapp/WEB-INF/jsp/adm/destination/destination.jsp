<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Destinace</title>
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
                <h1>Destinace</h1>
                <a href="/adm/destination/add_destination_form">
                    <input type="submit" value="Vytvořit novou destinaci" />
                </a>
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