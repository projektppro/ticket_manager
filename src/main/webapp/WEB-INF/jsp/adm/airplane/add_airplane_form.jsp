<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Reserve ticket</title>
</head>

<body>
<form:form method="post" action="adm/add_airplane" modelAttribute="airplane">
    <table>
        <tr>
            <td>Airplane name : </td>
            <td><form:input path="name" /></td>
            <td><form:errors path="name"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Save" /></td>
        </tr>
    </table>
</form:form>
</body>
</html>
