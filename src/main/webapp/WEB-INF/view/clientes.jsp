<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

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
                    <th width="7%">Codigo</th>
                    <th width="15%">Nome</th>
                    <th width="15%">CPF</th>
                    <th width="50%">Endereço</th>
                    <th width="20%"></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${cliente}" var="cliente">
                    <tr>
                        <td>${cliente.id}</td>
                        <td>${cliente.nome}</td>
                        <td>${cliente.cpf}</td>
                        <td>Logradouro: ${cliente.endereco.logradouro}, N°: ${cliente.endereco.numero}
                            / CEP: ${cliente.endereco.cep} - Cidade: ${cliente.endereco.cidade}  </td>
                        <td><a type="button" class="btn btn-success"
                               href="/cliente/editar?id=${cliente.id}">Atualizar</a>
                            <a type="button" class="btn btn-secundary"
                               href="/cliente/deletar?id=${cliente.id}">Deletar</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>
<%@ include file="common/footer.jspf" %>