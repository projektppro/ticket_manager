<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Reserve ticket</title>
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
                <h1>Přidat letadlo</h1>
                <form:form method="post" action="add_airplane" modelAttribute="airplane">
                    <table>
                        <tr>
                            <td>Označení letadla : </td>
                            <td><form:input path="name" type="text" /></td>
                            <td><form:errors path="name"/></td>

                        </tr>
                        <tr>
                            <td>Název Aerolinky : </td>
                            <td><form:input path="name" type="text" /></td>
                            <td><form:errors path="name"/></td>
                        </tr>
                        <tr>
                            <td>Max počet míst : </td>
                            <td><form:input path="name" type="text" /></td>
                            <td><form:errors path="name"/></td>
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
