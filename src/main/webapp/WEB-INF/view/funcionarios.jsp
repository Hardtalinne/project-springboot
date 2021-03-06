<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container">
    <div>
        <a type="button" class="btn btn-primary btn-md" href="/funcionario/cadastrar">Cadastrar Funcionario</a>
    </div>
    <br>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>Listar Funcionarios</h3>
        </div>
        <div class="panel-body">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th width="10%">Codigo</th>
                    <th width="20%">Nome</th>
                    <th width="20%">CPF</th>
                    <th width="20%">Cargo</th>
                    <th width="20%"></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${funcionario}" var="funcionario">
                    <tr>
                        <td>${funcionario.id}</td>
                        <td>${funcionario.nome}</td>
                        <td>${funcionario.cpf}</td>
                        <td>${funcionario.cargo}</td>
                        <td><a type="button" class="btn btn-success"
                               href="/funcionario/editar?id=${funcionario.id}">Atualizar</a>
                            <a type="button" class="btn btn-secundary"
                               href="/funcionario/deletar?id=${funcionario.id}">Deletar</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>
<%@ include file="common/footer.jspf" %>