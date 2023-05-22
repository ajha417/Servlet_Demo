<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/jdbc" user="root" password=""/>
	<sql:query var="rs" dataSource="${db}">select * from users</sql:query>
	
	<c:forEach items="${rs.rows}" var="user">
	
		<c:out value="${user.id}"></c:out> : <c:out value="${user.name}"></c:out> : <c:out value="${user.address}"></c:out> <br>
	</c:forEach>
	
	<c:set var="str" value="Amit Kumar Jha is placed in Asite solutions as Java intern"/>
	
	<br>Length of string is : ${fn:length(str)}
	<br>
	
	<c:forEach items="${fn:split(str,' ') }" var="s">
		${s} <br>
	</c:forEach>
	
	<br>
	Index: ${fn:indexOf(str,"is")}
	
	<br>
	<c:if test="${fn:contains(str,'Java')}">
	  Java is there
	</c:if>
	
	
	
</body>
</html>