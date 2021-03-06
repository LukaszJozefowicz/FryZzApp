<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FryZzApp - Edycja danych</title>
    <link rel="stylesheet" href="sources/css/customer.css">
    <link rel="stylesheet" href="sources/css/style.css">
    <script src="sources/js/customer-filter.js"></script>
    <jsp:include page="elements/header.jsp"/>
</head>
<body>
<jsp:include page="elements/menu.jsp"/><BR>
<form action="${pageContext.request.contextPath }/edit_customer" method="post">
<div class="container">


    <div class="card  text-center bg-dark">
        <div class="card-header">
            Edycja ${customer.firstName} ${customer.lastName}
        </div>
        <input type="hidden" name="id" value="${customer.id}">

        <div class="card-body">
        <div class="input-group form-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><i class="fas fa-user"></i></span>
            </div>
            <input type="text" name="firstName" class="form-control" value="${customer.firstName}" required placeholder="Imię (pole wymagane)">
        </div>

        <div class="input-group form-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><i class="fas fa-user"></i></span>
            </div>
            <input type="text" name="lastName" class="form-control" value="${customer.lastName}" required placeholder="Nazwisko (pole wymagane)">
        </div>

        <div class="input-group form-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><i class="fas fa-phone"></i></span>
            </div>
            <input type="tel" name="telephoneNumber" class="form-control" value="${customer.telephoneNumber}"  pattern="^[0-9]{9}$" required placeholder="XXX-XXX-XXX  Numer telefonu (9 cyfr - pole wymagane)">
        </div>

            <div class="input-group form-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"><i class="fas fa-calendar"></i></span>
                </div>
                <input type="date" name="visitDate" class="form-control" value="${customer.visitDate}">
            </div>

            <div class="input-group form-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"><i class="fas fa-clock"></i></span>
                </div>
                <input type="time" step="1" name="visitTime" class="form-control" value="${customer.visitTime}">
            </div>

            <div class="input-group form-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                </div>
                <input type="text" name="assignedHairdresser" class="form-control" value="${customer.assignedHairdresser}" placeholder="Kto strzyże (wpisz login fryzjera)">
            </div>

            <div class="input-group form-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"><i class="fas fa-exclamation-triangle"></i></span>
                </div>
                <input type="text" name="info" class="form-control" value="${customer.info}" placeholder="Ważne informacje">
            </div>

            <div class="input-group form-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"><i class="fas fa-comments"></i></span>
                </div>
                <input type="text" name="comments" class="form-control" value="${customer.comments}" placeholder="Komentarz własny na temat klienta">
            </div>
            <div class="form-group">
                <input type="button" name="btn" value="Anuluj" onclick="window.history.back()" class="btn btn-outline-danger float-lg-left login_btn">
                <input type="submit" name="btn" value="Zmień" class="btn btn-outline-danger float-lg-right login_btn">

            </div>
    </div>
    </div>
</div>
</form>
</body>
</html>




<%--<%@ page isELIgnored="false" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Edycja danych klienta</title>--%>

    <%--<jsp:include page="elements/header.jsp"/>--%>
<%--</head>--%>
<%--<body>--%>
<%--<jsp:include page="elements/menu.jsp"/><BR>--%>

            <%--<form action="${pageContext.request.contextPath }/edit_customer" method="post">--%>

                <%--<input type="hidden" name="id" value="${customer.id}">--%>
                <%--Imię--%>
                <%--<input type="text" name="firstName" value="${customer.firstName}">--%>
                <%--Nazwisko--%>
                <%--<input type="text" name="lastName" value="${customer.lastName}">--%>
                <%--Telefon--%>
                <%--<input type="text" name="telephoneNumber" value="${customer.telephoneNumber}">--%>
                <%--Data--%>
                <%--<input type="date" name="visitDate" value="${customer.visitDate}">--%>
                <%--Godzina--%>
                <%--<input type="time" step="30" name="visitTime" value="${customer.visitTime}">--%>
                <%--Kto strzyże--%>
                <%--<input type="text" name="assignedHairdresser" value="${customer.assignedHairdresser}">--%>
                <%--Info--%>
                <%--<input type="text" name="info" value="${customer.info}">--%>
                <%--Komentarz--%>
                <%--<input type="text" name="comments" value="${customer.comments}">--%>
                    <%--<input type="submit" name="btn" value="Zmień">--%>

            <%--</form>--%>
<%--</body>--%>
<%--</html>--%>