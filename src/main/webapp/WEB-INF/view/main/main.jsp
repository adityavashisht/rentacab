<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>


<security:authorize access="hasAnyRole('ROLE_SUPER_ADMIN', 'ROLE_ADMIN')">

    <div class="container">
        Main Page
    </div>

</security:authorize>


