<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Corporation</title>
<!-- <meta http-equiv="refresh" content="0.0001; URL=home"> -->
</head>
<body>
    <form method="GET" action="corporations">
        <input type="submit" value="List Corporation" />
    </form>
	<form:form action="login" method="post">
   		Enter User Name:<input type="text" name="name">
		<br />
   		Enter Password :<input type="password" name="pwd" />
		<br />
		<input type="submit">
	</form:form>
</body>
</html>
