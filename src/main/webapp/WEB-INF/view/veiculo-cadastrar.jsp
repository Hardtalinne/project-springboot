<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading">Cadastrar Veiculo</div>
                <div class="panel-body">
                    <form:form method="post" modelAttribute="veiculo">
                        <form:hidden path="id"/>
                        <fieldset class="form-group">
                            <form:label path="marca">Marca</form:label>
                            <form:input path="marca" type="text" class="form-control"
                                        required="required"/>
                            <form:errors path="marca" cssClass="text-warning"/>

                            <form:label path="modelo">Modelo</form:label>
                            <form:input path="modelo" type="text" class="form-control"
                                        required="required"/>
                            <form:errors path="modelo" cssClass="text-warning"/>

                            <form:label path="placa">PLACA</form:label>
                            <form:input path="placa" type="text" class="form-control"
                                        required="required"/>
                            <form:errors path="placa" cssClass="text-warning"/>
                        </fieldset>
                        <fieldset class="form-group">
                            <form:label path="cor">Cor</form:label>
                            <form:input path="cor" type="text" class="form-control"
                                        required="required"/>
                            <form:errors path="cor" cssClass="text-warning"/>
                            <form:label path="disponibilidade">Disponibilidade</form:label>
                            <form:input path="disponibilidade" type="boolean" class="form-control"
                                        required="required"/>
                            <form:errors path="disponibilidade" cssClass="text-warning"/>
                        </fieldset>

                        <button type="submit" class="btn btn-success">Salvar</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="common/footer.jspf" %>