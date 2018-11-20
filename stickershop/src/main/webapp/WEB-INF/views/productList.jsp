<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> %
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <ul>
        <c:forEach items="${productList.content}" var="product">
        <li>
            이름 : ${product.name}
        </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
