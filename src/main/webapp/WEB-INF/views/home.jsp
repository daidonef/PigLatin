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
<script>
	function validation() {

		var english = document.forms["pigLatin"]["english"].value;
	
		if (english.trim().length === 0) {
			alert("You need to type in something before we can translate to Pig Latin!");
			return false;
		}
	}
</script>
</body>
</html>
