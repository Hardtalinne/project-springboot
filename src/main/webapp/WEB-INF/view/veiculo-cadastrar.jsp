<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<div class="container">
    <div class="panel-heading">Cadastrar Veiculo</div>
    <form:form method="post" modelAttribute="veiculo">
        <form:hidden path="id"/>
        <div class="form-group">
            <form:label path="marca">Marca:</form:label>
            <form:input path="marca" type="text" class="form-control"
                        required="required"/>
            <form:errors path="marca" cssClass="text-warning"/>

            <form:label path="modelo">Modelo:</form:label>
            <form:input path="modelo" type="text" class="form-control"
                        required="required"/>
            <form:errors path="modelo" cssClass="text-warning"/>

            <form:label path="placa">Placa:</form:label>
            <form:input path="placa" type="text" class="form-control"
                        required="required"/>
            <form:errors path="placa" cssClass="text-warning"/>
        </div>
        <div class="form-group">
            <form:label path="cor">Cor:</form:label>
            <form:input path="cor" type="text" class="form-control"
                        required="required"/>
            <form:errors path="cor" cssClass="text-warning"/>
            <form:label path="ano">Ano:</form:label>
            <form:input path="ano" type="text" class="form-control"
                        required="required"/>
            <form:errors path="ano" cssClass="text-warning"/>
            Disponibilidade:
            <select name="disponibilidade">
                <option value="true">Sim</option>
                <option value="false">Não</option>
            </select><br>
            <form:errors path="disponibilidade" cssClass="text-warning"/>
        </div>

        <button type="submit" class="btn btn-success">Salvar</button>
    </form:form>
</div>
<%@ include file="common/footer.jspf" %>