<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<h2>Listagem de Veiculos</h2>

<form method="get" action="/veiculos">
    <table>
        <tr>
            <td>marca</td>
            <td>modelo</td>
        </tr>

        <c:forEach items="${veiculo}" var="veiculo">
            <tr>
                <td>${veiculo.marca}</td>
                <td>${veiculo.modelo}</td>
            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>