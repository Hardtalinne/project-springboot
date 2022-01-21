<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container">
    <div>
        <a type="button" class="btn btn-primary btn-md" href="/aluguel/cadastrar">Cadastrar Aluguel de Veiculo</a>
    </div>
    <br>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>Listar Alugados</h3>
        </div>
        <div class="panel-body">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th width="5%">Codigo</th>
                    <th width="20%">Veiculo</th>
                    <th width="10%">Cliente</th>
                    <th width="30%">Funcionario</th>
                    <th width="30%">Data de aluguel</th>
                    <th width="30%">Data de devolução</th>
                    <th width="20%">valor</th>
                    <th width="20%"></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${aluguel}" var="aluguel">
                    <tr>
                        <td>${aluguel.id}</td>
                        <td>${aluguel.veiculo.marca} / Placa: ${aluguel.veiculo.placa}</td>
                        <td>${aluguel.cliente.nome}</td>
                        <td>${aluguel.funcionario.nome} / Cargo: ${aluguel.funcionario.cargo}</td>
                        <td>${aluguel.dataAluguel}</td>
                        <td>${aluguel.dataDevolucao}</td>
                        <td>${aluguel.valorAluguel}</td>
                        <td><a type="button" class="btn btn-success"
                               href="/aluguel/editar?id=${aluguel.id}">Atualizar</a>
                            <a type="button" class="btn btn-secundary"
                               href="/aluguel/deletar?id=${aluguel.id}">Deletar</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>
<%@ include file="common/footer.jspf" %>