<%--
  Created by IntelliJ IDEA.
  User: vashishta
  Date: 10/14/15
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>


<html>
<head>
    <title></title>
    <link href="<spring:url value="/static/bootstrap/bootstrap.min.css"/>" rel="stylesheet"/>

    <link href="<spring:url value="/static/datatable/css/dataTables.bootstrap.min.css"/>" rel="stylesheet"/>
    <script src="<spring:url value="/static/jquery/jquery.js"/>"></script>
    <script src="<spring:url value="/static/datatable/js/jquery.dataTables.min.js"/>"></script>

    <meta name="_csrf" content="${_csrf.token}"/>
    <meta name="_csrf_header" content="${_csrf.headerName}"/>

    <script>
        $(function() {
            var token = $("meta[name='_csrf']").attr("content");
            var header = $("meta[name='_csrf_header']").attr("content");
            $(document).ajaxSend(function (e, xhr, options) {
                xhr.setRequestHeader(header, token);
            });
        })
    </script>
</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-md-2">
            <tiles:insertAttribute name="menu"/>
        </div>
        <div class="col-md-10">
            <tiles:insertAttribute name="body"/>
        </div>
    </div>
</div>

</body>
<tiles:insertAttribute name="footer"/>
</html>