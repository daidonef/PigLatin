<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Home  
</h1>
<p>
	<form name="pigLatin" onsubmit="return validation()" 
		action="http://localhost:8080/piglatin/" method="get">

		<br>English to Pig Latin <br>
		<input type="text" name="english"> 
		<br><br>
		<input type="submit" value="Translate">
	</form>
</p>
<p>
	${translate}<br>
	<c:forEach items="${pigLatin}" var="words">
		${words.replace('-', '')}
	</c:forEach>
</p>
</body>
</html>
