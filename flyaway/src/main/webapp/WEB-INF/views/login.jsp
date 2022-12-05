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

<h1> WELCOME ADMIN</h1>

 <form action = "next"  method="post">

Enter Name<input type ="text" name ="name"/>
Password <input type="password" name ="password"/>
<input type="submit" value = "submit"/>


</form>
<span style="color : red">
${errorMessage }
</span> 



</body>
</html>