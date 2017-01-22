<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Přidat let</title>
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
                <h1>Přidat let</h1>
                <form:form method="post" action="adm/add_flight" modelAttribute="flight">
                    <table>
                        <tr>
                            <td>Název letu : </td>
                            <td><form:input path="flightName" type="text" /></td>
                            <td><form:errors path="flightName"/></td>
                        </tr>
                        <tr>
                            <td>Čas odletu : </td>
                            <td><form:input path="departureTime" type="text" /></td>
                            <td><form:errors path="departureTime"/></td>
                        </tr>
                        <tr>
                            <td>Místo odletu : </td>
                            <td>
                                <form:select path="departurePlace">
                                    <form:options items="${placeList}" />
                                </form:select>
                            </td>
                            <td><form:errors path="departurePlace"/></td>
                        </tr>
                        <tr>
                            <td>Místo příletu : </td>
                            <td>
                                <form:select path="arrivalPlace">
                                    <form:options value="" label="---Vyber---" />
                                    <form:options items="${placeList}" />
                                </form:select>
                            </td>
                            <td><form:errors path="arrivalPlace"/></td>
                        </tr>
                        <tr>
                            <td>Cena letenky : </td>
                            <td><form:input path="cost" type="text" /></td>
                            <td><form:errors path="cost"/></td>
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