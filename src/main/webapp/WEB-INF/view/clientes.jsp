<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
    <div>
        <a type="button" class="btn btn-primary btn-md" href="/cliente/cadastrar">Cadastrar Cliente</a>
    </div>
    <br>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>Listar Clientes</h3>
        </div>
        <div class="panel-body">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th width="40%">Codigo</th>
                    <th width="40%">Nome</th>
                    <th width="40%">CPF</th>
                    <th width="20%"></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${cliente}" var="cliente">
                    <tr>
                        <td>${cliente.id}</td>
                        <td>${cliente.nome}</td>
                        <td>${cliente.cpf}</td>
                        <td><a type="button" class="btn btn-success"
                               href="/cliente/editar?id=${cliente.id}">Atualizar</a>
                            <a type="button" class="btn btn-warning"
                               href="/cliente/deletar?id=${cliente.id}">Deletar</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>
<%@ include file="common/footer.jspf" %>