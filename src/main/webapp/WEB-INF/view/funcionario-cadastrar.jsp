<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading">Cadastrar Funcionario</div>
                <div class="panel-body">
                    <form:form method="post" modelAttribute="funcionario">
                        <form:hidden path="id"/>
                        <div class="form-group">
                            <form:label path="nome">Nome</form:label>
                            <form:input path="nome" type="text" class="form-control"
                                        required="required"/>
                            <form:errors path="nome" cssClass="text-warning"/>
                            <form:label path="cpf">CPF</form:label>
                            <form:input path="cpf" type="text" class="form-control"
                                        required="required"/>
                            <form:errors path="cpf" cssClass="text-warning"/>
                            <form:label path="cargo">CPF</form:label>
                            <form:input path="cargo" type="text" class="form-control"
                                        required="required"/>
                            <form:errors path="cargo" cssClass="text-warning"/>
                        </div>
                        <div class="form-group">
                            <form:label path="login">Login</form:label>
                            <form:input path="login" type="text" class="form-control"
                                        required="required"/>
                            <form:errors path="login" cssClass="text-warning"/>
                            <form:label path="senha">Senha</form:label>
                            <form:input path="senha" type="text" class="form-control"
                                        required="required"/>
                            <form:errors path="senha" cssClass="text-warning"/>
                        </div>

                        <button type="submit" class="btn btn-success">Salvar</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="common/footer.jspf" %>