<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

Usuário logado no momento:
<c:out value="${sessionScope.usuarioLogado}"/>

<br><br>

<a href="/logout">Logout</a>

</body>
</html>