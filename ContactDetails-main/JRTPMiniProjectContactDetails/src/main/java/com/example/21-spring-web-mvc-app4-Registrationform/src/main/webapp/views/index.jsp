<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="savee" modelAttribute="studentform" method="POST">

<table>
      <tr>
      		<td>Name :</td>
      		<td><form:input path="name" /></td>
      </tr>
      
       <tr>
      		<td>Email :</td>
      		<td><form:input path="email" /></td>
      </tr>
       <tr>
      		<td>Gender :</td>
      		<td>
      		<form:radiobutton path="gender" />Male
      		<form:radiobutton path="gender" />Female
      		</td>
      </tr>
       <tr>
      		<td>Cource :</td>
      		<td><><form:select path="cource">
	      		<form:option value="">-select-</form:option>
	      		<form:option value="C">C</form:option>
	      		<form:option value="java">java</form:option>
	      		<form:option value="python">python</form:option>
      		</form:select></td>
      </tr>
       <tr>
      		<td>Timings :</td>
      		<td>
      		<form:checkbox path="timings" value="morning" />morning
      		<form:checkbox path="timings" value="evening" />evening
      		
      		</td>
      </tr>
       <tr>
       		<td><input type="submit" value="registration"/></td>
       </tr>
</table>
</form:form>


</body>
</html>
