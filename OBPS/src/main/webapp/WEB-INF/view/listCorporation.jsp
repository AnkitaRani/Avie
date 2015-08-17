<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
<head>
<title>List Corporation</title>

</head>
<h1>${message}</h1>
<body>
	<form method="GET" action="listCorporation">
        <input type="submit" value="List Corporation" />
    </form>
    <c:if test="${fn:length(corporations)>0}">
        <h1 style="color: #FF0000;">There are ${fn:length(corporations)} Corporations in Database.</h1>
         <table
            style="border-width: 1px; border-style: solid; border-color: black;">
            <tr
                style="border-width: 1px; border-style: solid; border-color: black;">
                <td
                    style="border-width: 1px; border-style: solid; border-color: black;">corpId</td>
                <td
                    style="border-width: 1px; border-style: solid; border-color: black;">corpName</td>
            </tr>
            <c:forEach items="${corporations}" var="corp">
                <tr
                    style="border-width: 1px; border-style: solid; border-color: black;">
                    <td
                        style="border-width: 1px; border-style: solid; border-color: black;">${corp.corporationId}</td>
                    <td
                        style="border-width: 1px; border-style: solid; border-color: black;">${corp.corporationName}</td>
                </tr>
            </c:forEach>
        </table>
        <br />

    </c:if>

</body>
</html>
