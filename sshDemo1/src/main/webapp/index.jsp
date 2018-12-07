<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<table >
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>存款</td>
    </tr>

        <c:forEach var="u" items="${ubList}">
            <tr>
                <td>${u.userId}</td>
                <td>${u.userName}</td>
                <td>${u.userMoney}</td>
            </tr>
        </c:forEach>
</table>
</body>
</html>
