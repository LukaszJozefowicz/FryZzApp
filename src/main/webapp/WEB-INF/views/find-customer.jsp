<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FryZzApp - Znajdź Klienta</title>
    <jsp:include page="elements/header.jsp"/>
</head>
<body>
jsp:include page="elements/menu.jsp"/>
<form method="post">
    Imię:<br>
    <input type="text" name="firstName"><br>
    Nazwisko:<br>
    <input type="text" name="lastName"><br>
    Numer telefonu:<br>
    <input type="text" name="telephone_number"><br>
    <br><br>
    <input type="submit" value="wyszukaj">
</form>
</body>
</html>