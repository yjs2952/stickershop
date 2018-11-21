<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>

    <!-- 부트 스트랩 -->
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.3/dist/css/bootstrap.min.css">
</head>
<body>

<div class="content">
    <div class="container">
        <div>
            <form class="form-signin" action="/members/login" method="post" style="max-width: 420px;">
                <div class="form-group">
                    <label for="id">아이디</label>
                    <input type="text" class="form-control" id="id" name="id">
                </div>
                <div class="form-group">
                    <label for="password">비밀번호</label>
                    <input type="text" class="form-control" id="password" name="password">
                </div>
                <button type="submit" class="btn btn-primary">Sign in</button>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            </form>
        </div>
    </div>
</div>

<!-- Jquery & bootstrap -->
<script src="/webjars/jquery/3.2.1/dist/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>
