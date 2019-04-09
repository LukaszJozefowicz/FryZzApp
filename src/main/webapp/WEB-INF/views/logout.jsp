<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FryZzApp - Wylogowano</title>
    <link href="sources/css/bootstrap.css" rel="stylesheet" id="bootstrap-css">
    <link rel="stylesheet" href="sources/css/style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css">
</head>
<body>
<script src="sources/js/jquery.js"></script>
<script src="sources/js/bootstrap.js"></script>

<div class="container">
    <div class="card card-login mx-auto text-center bg-dark">
        <div class="card-header mx-auto bg-dark">
            <span> <img src="/sources/images/fryzapplogo.png" class="w-75" alt="Logo"> </span><br/>
            <span class="logo_title mt-5">
                <br/>Wylogowano poprawnie <br/> Za chwilę wrócisz na stronę główną
            </span>
        </div>
    </div>
</div>
<script>
    var timer = setTimeout(function() {
        window.location='/'
    }, 3000);
</script>
</body>
</html>