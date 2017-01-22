<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Objednání</title>
    <link rel="stylesheet" href="/resources/css/style.css" type="text/css">
</head>
<body>
<div id="page">
    <%@ include file="header.jsp"%>
    <div id="body" class="home">
        <div class="header">
            <div>
                <h1>REZERVACE LETENEK</h1>
                <div id="main-form">
                    <form:form method="post" action="objednani" modelAttribute="objednani">
                        <table>
                            <tr>
                                <td>Vaše jméno : </td>
                                <td><form:input path="jmeno" type="text"/></td>
                                <td><form:errors path="jmeno"/></td>

                            </tr>
                            <tr>
                                <td>Vaše příjmení : </td>
                                <td><form:input path="prijmeni" type="text" /></td>
                                <td><form:errors path="prijmeni"/></td>
                            </tr>
                            <tr>
                                <td>Váš email: </td>
                                <td><form:input path="email" type="text" /></td>
                                <td><form:errors path="email"/></td>
                            </tr>
                            <tr>
                                <td>Id vašeho letu: </td>
                                <td><form:input path="idLetu" type="text" /></td>
                                <td><form:errors path="idLetu"/></td>
                            </tr>
                            <tr>
                                <td>Vaše telefoni cislo: </td>
                                <td><form:input path="telefoniCislo" type="text" /></td>
                                <td><form:errors path="telefoniCislo"/></td>
                            </tr>
                            <tr>
                                <td colspan="2"><input type="submit" value="Uložit" /></td>
                            </tr>
                        </table>
                    </form:form>
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