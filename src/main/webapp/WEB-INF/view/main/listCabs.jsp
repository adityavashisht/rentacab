<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<table id="listCabTable" class="table table-bordered table-striped table-hover">
    <thead>
    <tr>
        <th>ID</th>

        <th>Make</th>
    </tr>
    </thead>
    <tbody>

    </tbody>
</table>
<script>

    $(function () {

        $('#listCabTable').DataTable( {
            "processing": true,
            "serverSide": true,

            "ajax": {
                "url": "<spring:url value='/app/list/ajax'/>",
                "type": "POST",
                "contentType": 'application/json',
                "dataType": "json",
                "data": function (d) {

                    d.entityState = "ACT";
                    return JSON.stringify(d);
                }

            }


        } );

    });
</script>
