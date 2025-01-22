 <%taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%taglib uri="http://www.springframework.org/tags/forms" prefix="form"%>
 
 <c:if test="${message ne null}">
	<c:out value= "${message}"/>
	</c:if>
	<hr>
	
	<form:form action "save" method="post" modelAttribute="custBean">
		<table>
			<tr>
				<td>FirstName</td> <td><form:input path="firstName"/></td> <td style="color:red;"><form:errors path="firstName"/></td>
			</tr>	
			<tr>
			   <td>LastName</td> <td><form:input path="lastName"/></td> <td style="color:red;"><form:errors path="lastName"/></td>
			</tr>	
			<tr>
			  <td>Email</td> <td><form:input path="email"/></td> <td style="color:red;"><form:errors path="email"/></td>
			</tr>
			
			<tr>
			   <td>Password</td> <td><form:input path="password"/></td> <td style="color:red;"><form:errors path="password"/></td>
			</tr>	
			<tr>
			 <td>Gender</td> <td><form:input path="gender"/></td> <td style="color:red;"><form:errors path="gender"/></td>
			</tr>	
			<tr>
			 <td>Age</td> <td><form:input path="age"/></td> <td style="color:red;"><form:errors path="age"/></td>
			</tr>
			
			<tr>
			<td>DateOfBirth</td> <td><form:input path="dateOfBirth"/></td> <td style="color:red;"><form:errors path="dateOfBirth"/></td>
			</tr>	
			<tr>
			  <td>ContactNumber</td> <td><form:input path="contactNumber"/></td> <td style="color:red;"><form:errors path="contactNumber"/></td>
			</tr>	
			<tr>
			 <td>Country</td> <td><form:input path="country"/></td> <td style="color:red;"><form:errors path="country"/></td>
			</tr>
			