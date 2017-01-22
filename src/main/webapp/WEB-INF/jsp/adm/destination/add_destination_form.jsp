<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Přidat destinaci</title>
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
                <h1>Přidat destinaci</h1>
                <form:form method="post" action="add_destination_form" modelAttribute="destination">
                    <table>
                        <tr>
                            <td>Název letiště : </td>
                            <td><form:input path="airportName" name="airportName" type="text" /></td>
                            <td><form:errors path="airportName"/></td>

                        </tr>
                        <tr>
                            <td>Město : </td>
                            <td><form:input path="city" type="text" /></td>
                            <td><form:errors path="city"/></td>
                        </tr>
                        <tr>
                            <td>Stát : </td>
                            <td><form:input path="country" type="text" /></td>
                            <td><form:errors path="country"/></td>
                        </tr>
                        <tr>
                            <td>Kód státu : </td>
                            <td><form:input path="countryCode" type="text" /></td>
                            <td><form:errors path="countryCode" /></td>
                        </tr>
                        <tr>
                            <td colspan="2"><input type="submit" value="Uložit" /></td>
                        </tr>
                    </table>
                </form:form>
            </div>
        </div>
        <div class="big_bottom">
        </div>
    </div>
</body>
</html>