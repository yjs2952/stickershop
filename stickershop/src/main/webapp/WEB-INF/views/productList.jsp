<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <table>
        <thead>
            <tr>
                <th>#</th>
                <th>상품명</th>
                <th>가격</th>

            </tr>
        </thead>
        <c:forEach items="${productList.content}" var="product">
        <tbody>
            <tr>
                <td>
                    ${product.id}
                </td>
                <td>
                    ${product.name}
                </td>
                <td>
                    ${product.price}원
                </td>
            </tr>
        </tbody>
        </c:forEach>
    </table>
</div>
</body>
</html>
