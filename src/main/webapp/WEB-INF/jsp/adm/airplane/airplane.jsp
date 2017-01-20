<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Letadla</title>
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
                <h1>Letadla</h1>
                <a href="/adm/airplane/add_airplane_form" >
                    <input type="submit" value="Vytvořit nové letadlo" />
                </a>
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
            </div>
        </div>
        <div class="big_bottom">
        </div>
    </div>
</body>
</html>