<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FryZzApp - Dodaj nowego klienta</title>
    <link rel="stylesheet" href="sources/css/customer.css">
    <script src="sources/js/customer-filter.js"></script>
    <jsp:include page="elements/header.jsp"/>
</head>
<body>
<jsp:include page="elements/menu.jsp"/><BR>
<div class="container">

    <div class="card  text-center bg-dark">
        <div class="card-header">
            Dodaj nowego klienta
        </div>
        <div class="card-body">
            <form action="" method="post">
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fas fa-user"></i></span>
                    </div>
                    <input type="text" name="firstName" class="form-control" placeholder="Imię">
                </div>

                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fas fa-key"></i></span>
                    </div>
                    <input type="text" name="lastName" class="form-control" placeholder="Nazwisko">
                </div>

                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fas fa-key"></i></span>
                    </div>
                    <input type="text" name="telephoneNumber" class="form-control" placeholder="Numer Telefonu">
                </div>

                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fas fa-key"></i></span>
                    </div>
                    <input type="date" name="visitDate" class="form-control" placeholder="termin wizyty">

                </div>

                <%--<div class="input-group form-group">--%>
                    <%--<div class="input-group-prepend">--%>
                        <%--<span class="input-group-text"><i class="fas fa-key"></i></span>--%>
                    <%--</div>--%>
                    <%--<input type="password" name="password" class="form-control" placeholder="godzina">--%>
                <%--</div>--%>

                <%--<div class="input-group form-group">--%>
                    <%--<div class="input-group-prepend">--%>
                        <%--<span class="input-group-text"><i class="fas fa-key"></i></span>--%>
                    <%--</div>--%>
                    <%--<input type="password" name="password" class="form-control" placeholder="Dodatkowe informacje (uczulenia)">--%>
                <%--</div>--%>

                <%--<div class="input-group form-group">--%>
                    <%--<div class="input-group-prepend">--%>
                        <%--<span class="input-group-text"><i class="fas fa-key"></i></span>--%>
                    <%--</div>--%>
                    <%--<input type="password" name="password" class="form-control" placeholder="Dodatkowe informacje (uczulenia)">--%>
                <%--</div>--%>

                <div class="form-group">
                    <input type="submit" name="btn" value="Dodaj" class="btn btn-outline-danger float-right login_btn">
                </div>

            </form>
        </div>
    </div>
</div>
</body>
</html>