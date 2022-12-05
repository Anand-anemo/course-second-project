<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> </title>
</head>
<style>
table, th, td {
  border:1px solid black;
}
</style>
<body>
<h1>REPORT</h1>

 <table style="width:50%">
  <tr>
    <th>id</th>
    <th>classes</th>
    <th>student</th>
     <th>subject</th>
      <th>teacher</th>
  </tr>
  <tbody>
  
  
  
    <c:forEach   items = "${admins }"  var="a">
       <tr>
       <th scope="row"><c:out value =" ${a.id }"></c:out></th>
       <td><c:out value ="${a.classes }"></c:out></td>
       <td><c:out value ="${a.student }"></c:out></td>
       <td><c:out value ="${a.subject }"></c:out></td>
       <td><c:out value ="${a.teacher }"></c:out></td>
       </tr>
     </c:forEach>
     </tbody>
     

  
  
</table>

<div class ="container text-center">
<a href="admin" class="btn btn-outline-success">BACK</a>
<a href="${pageContext.request.contextPath }/"
class="btn btn-outline-danger">Exit</a>

</div>



 


 
</body>
</html>