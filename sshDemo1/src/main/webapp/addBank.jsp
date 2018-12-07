<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/Query/userAction_addBank" method="post">
        姓名:<input type="text" name="ub.userName"/><br/>
        存款:<input type="text" name="ub.userMoney"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>

</html>
