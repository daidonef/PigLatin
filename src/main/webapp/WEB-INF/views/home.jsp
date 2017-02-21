<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="resources/stylepage.css">
</head>
<body>
<h1>
	Pig Latin Translator
</h1>
<div>
	<form name="pigLatin" onsubmit="return validation()" 
		action="http://localhost:8080/piglatin/" method="get">

		<br>English to Pig Latin <br>
		<textarea rows="4" cols="50" class="inside" name="english"> </textarea>
		<br><br>
		<input type="submit" class="inside" value="Translate">
	</form>
</div>
<div>
	${translate}<br><br>
	<c:forEach items="${pigLatin}" var="words">
		${words.replace('-', '')}
	</c:forEach>
</div>
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
