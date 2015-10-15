<jsp:include page="WEB-INF/view/template/header.jsp"/>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<body>

<div class="container well">

    <form name="loginForm" action="<spring:url value="/authenticate"/>" method="post">
        <security:csrfInput/>

        <div class="row">
            <div class="col-md-4">
                <input type="text" class="form-control" name="j_username"/>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4">
                <input type="password" class="form-control" name="j_password"/>
            </div>
        </div>


        <input type="submit" class="btn btn-success" value="Login"/>


    </form>
</div>


<script type="text/javascript">

</script>

</body>

<jsp:include page="WEB-INF/view/template/footer.jsp"/>


