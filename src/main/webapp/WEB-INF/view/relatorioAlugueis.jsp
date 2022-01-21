<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<div class="container">
    <h3>Relatório de Veiculos Alugados</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th width="10%">Codigo</th>
            <th width="25%">Veiculo</th>
            <th width="10%">Cliente</th>
            <th width="40%">Funcionario</th>
            <th width="30%">Data de aluguel</th>
            <th width="30%">Data de devolucao</th>
            <th width="10%">valor</th>
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
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a type="button" class="btn btn-success"
       href="/">Imprimir</a>
</div>
<%@ include file="common/footer.jspf" %>