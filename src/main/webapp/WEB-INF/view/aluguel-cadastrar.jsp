<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container">
        <div class="panel-heading">
            <h3>Cadastrar Aluguel de Veiculos</h3>
        </div>
            <form:form method="post" modelAttribute="aluguel">
                <form:hidden path="id"/>
                <div>
                    <label for="cliente.id">Selecione o Cliente:</label>
                    <select class="form-control" name="cliente.id" id="cliente.id" required>
                        <option value=""></option>
                        <c:forEach items="${cliente}" var="cliente">
                            <option value="${cliente.id }">${cliente.nome }</option>
                        </c:forEach>
                    </select>
                    <form:errors path="cliente" cssClass="text-warning"/>
                </div>
                <div>
                    <label for="veiculo.id">Selecione o Veiculo:</label>
                    <select class="form-control" name="veiculo.id" id="veiculo.id" required>
                        <option value=""></option>
                        <c:forEach items="${veiculo}" var="veiculo">
                            <option value="${veiculo.id }">${veiculo.modelo }</option>
                        </c:forEach>
                    </select>
                    <form:errors path="veiculo" cssClass="text-warning"/>
                </div>
                <div>
                    <label for="funcionario.id">Selecione o Funcionario:</label>
                    <select class="form-control" name="funcionario.id" id="funcionario.id" required>
                        <option value=""></option>
                        <c:forEach items="${funcionario}" var="funcionario">
                            <option value="${funcionario.id }">${funcionario.nome }</option>
                        </c:forEach>
                    </select>
                    <form:errors path="funcionario" cssClass="text-warning"/>
                </div>
                <div>
                    <form:label path="dataAluguel">Data Aluguel:</form:label>
                    <form:input path="dataAluguel" type="date" class="form-control"
                                required="required"/>
                    <form:errors path="dataAluguel" cssClass="text-warning"/>
                    <form:label path="dataDevolucao">Data Devolucao::</form:label>
                    <form:input path="dataDevolucao" type="date" class="form-control"
                                required="required"/>
                    <form:errors path="dataDevolucao" cssClass="text-warning"/>
                </div>

                <button type="submit" class="btn btn-success">Salvar</button>
            </form:form>
</div>
<%@ include file="common/footer.jspf" %>