<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<table id="usersTable" class="table table-bordered table-striped table-hover">
    <thead>
    <tr>
        <th>Id</th>
        <th>Username</th>
        <th>First Name</th>
    </tr>
    </thead>
    <tbody>

    </tbody>
</table>


<script>

    $(function () {


        $('#usersTable').DataTable({
            "processing": true,
            "serverSide": true,
            "lengthMenu": [[5, 10], [5, 10]],

            "ajax": {
                "url": "<spring:url value='/app/datatable/user'/>",
                "type": "POST",
                "contentType": 'application/json',
                "dataType": "json",

                "data": function (d) {

                    d.paramOne = "ACT";
                    d.enabled = true;
                    d.paramTwo = 2;
                    d.paramThree = "XYX";

                    return JSON.stringify(d);
                }

            },
            "order": [[1, "asc"]],

            "columns": [
                {
                    "data": "id"

                },
                {
                    "data": "username"

                },
                {
                    "data": "firstName"

                }

                ]


        });


    });
</script>
