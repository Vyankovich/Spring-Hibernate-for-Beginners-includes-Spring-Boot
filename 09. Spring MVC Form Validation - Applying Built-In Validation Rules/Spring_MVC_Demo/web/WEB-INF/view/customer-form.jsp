<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Customer Registration Form</title>
</head>
<body>

Fill out the form. (*) - required fields.

    <form:form action="processForm" modelAttribute="customer">

        First name: <form:input path="firstName" />
        <br><br>

        Last name (*): <form:input path="lastName" />
        <form:errors path="lastName" cssClass="ui-state-error"/>
        <br><br>
        <input type="submit" value="Submit" />

    </form:form>

</body>
</html>
