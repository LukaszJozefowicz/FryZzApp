<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FryZzApp - Umówione Wizyty</title>
    <link rel="stylesheet" href="sources/css/customer.css">
    <script src="sources/js/customer-filter.js"></script>
    <jsp:include page="elements/header.jsp"/>
</head>
<body>
<jsp:include page="elements/menu.jsp"/><BR>

<div class="container">

    <div class="card  text-center bg-dark">
        <div class="card-header">
            Umuwione wiyty
        </div>

        <div class="input-group form-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><i class="fas fa-user"></i></span>
            </div>
            <input type="text" id="myInput" class="form-control" placeholder="Wyszukaj klienta...">
        </div>

        <table class="table table-striped table-dark">
            <thead>
            <tr>

                <th>
                    <i class="fas fa-user"></i>
                    Imię
                </th>
                <th>
                    <i class="fas fa-user"></i>
                    Nazwisko
                </th>
                <th>
                    <i class="fas fa-calendar-alt"></i>
                    Data
                </th>
                <th>
                    <i class="fas fa-clock"></i>
                    Godzina
                </th>
                <th>
                    <i class="fas fa-edit"></i>
                    Akcje</th>
            </tr>
            </thead>

            <tbody id="myTable">
            <c:forEach items="${customersList}" var="customer">

                <tr>
                    <td>${customer.firstName}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.visitDate}</td>
                    <td>${customer.visitTime}</td>
                    <td> Zmień termin | Odwołaj | Pokaż</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

        <script>
            $(document).ready(function(){
                $("#myInput").on("keyup", function() {
                    var value = $(this).val().toLowerCase();
                    $("#myTable tr").filter(function() {
                        $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
                    });
                });
            });
        </script>
    </div>
</div>
</body>
</html>
</body>
</html>
