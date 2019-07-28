<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
    <title>Student Confirmation Form</title>
</head>

<body>

    The student is confirmed: ${student.firstName} ${student.lastName} from ${student.country}
<br><br>
    <!-- student.getCountry() -->
    Country: ${student.country}

<br><br>
    The student's favorite programming language is: ${student.programmingLanguage}

    <br><br>
    Operating Systems:
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
            <li>${temp}</li>
        </c:forEach>

    </ul>

</body>

</html>