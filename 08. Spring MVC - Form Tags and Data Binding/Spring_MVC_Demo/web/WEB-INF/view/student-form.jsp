<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
    <title>Student Registration Form</title>
</head>

<body>

    <form:form action="processForm" modelAttribute="student">

        First name: <form:input path="firstName" />
        <br><br>

        Last name: <form:input path="lastName" />
        <br><br>

        Country:
        <form:select path="country"> <!-- student.setCountry() -->
            <form:options items="${theCountryOptions}"/>
<%--             <form:options items="${student.countryOptions}" /> <%-- student.getCountryOptions()--%>
<%--            <form:option value="Brasil" label="Brasil" />
            <form:option value="France" label="France" />
            <form:option value="Germany" label="Germany" />
            <form:option value="Poland" label="Poland" />--%>
        </form:select>
        <br><br>

        Favorite programming language:

<%--        Java <form:radiobutton path="programmingLanguage" value="Java" />--%>
<%--        C# <form:radiobutton path="programmingLanguage" value="C#" />--%>
<%--        PHP <form:radiobutton path="programmingLanguage" value="PHP" />--%>
<%--        Ruby <form:radiobutton path="programmingLanguage" value="Ruby" />--%>
        <form:radiobuttons path="programmingLanguage" items="${theProgrammingLanguage}"/>
        <br><br>

        Operating Systems:

        Linux <form:checkbox path="operatingSystems" value="Linux" />
        Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
        MS Windows <form:checkbox path="operatingSystems" value="MS Window" />
        <br><br>

        <input type="submit" value="Submit" />

    </form:form>


</body>

</html>