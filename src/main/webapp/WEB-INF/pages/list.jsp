<%--
  Created by IntelliJ IDEA.
  User: Mr . Xu's  PC
  Date: 2019/8/10
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>成功来到List.jsp页面</h2><br/>
<c:forEach items="${list}" var="list">
    ${list.name} ${list.money}<br/>
</c:forEach>
</body>
</html>
