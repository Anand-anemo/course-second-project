<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>DATA STORE</h1>
<form action ="handleadmin"  method = "post">

<label for="class">Class Name</label>
<input type="text" id = class  name = "classes" placeholder="enter class name here"><br><br>
<label for="student">Student name</label>
<input type="text" id =student  name = "student" placeholder="enter student name here"><br><br>
<label for="subject">Subject Name</label>
<input type="text" id =subject  name = "subject" placeholder="enter subject name here"><br><br>
<label for="teacher">Teacher name</label>
<input type="text" id = teacher  name = "teacher" placeholder="enter teacher name here"><br><br>

<div class ="container text-center">

<a href="${pageContext.request.contextPath }/"
class="btn btn-outline-danger">Back</a>
<button type = "submit" class= " btn btn-primary">Add</button>

</div>



</form>

${error }


</body>
</html>