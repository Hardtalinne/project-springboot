<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container">
    <div>
        <a type="button" class="btn btn-primary btn-md" href="/veiculo/cadastrar">Cadastrar Veiculo</a>
    </div>
    <br>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>Listar Veiculos</h3>
        </div>
        <div class="panel-body">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th width="10%">Codigo</th>
                    <th width="20%">Modelo</th>
                    <th width="20%">Marca</th>
                    <th width="30%">Placa</th>
                    <th width="40%">Cor</th>
                    <th width="40%">Ano</th>
                    <th width="40%">Status</th>
                    <th width="20%"></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${veiculo}" var="veiculo">
                    <tr>
                        <td>${veiculo.id}</td>
                        <td>${veiculo.modelo}</td>
                        <td>${veiculo.marca}</td>
                        <td>${veiculo.placa}</td>
                        <td>${veiculo.cor}</td>
                        <td>${veiculo.ano}</td>
                        <td>${veiculo.disponibilidade ? "Disponivel" : "Indisponivel"}</td>
                        <td><a type="button" class="btn btn-success"
                               href="/veiculo/editar?id=${veiculo.id}">Atualizar</a>
                            <a type="button" class="btn btn-secundary"
                               href="/veiculo/deletar?id=${veiculo.id}">Deletar</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>
<%@ include file="common/footer.jspf" %>