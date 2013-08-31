<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h1>HELLO!</h1>
<c:forEach begin="1" end="5">
    <c:out value="<h1>Herp Derp</h1>" escapeXml="false"/>
</c:forEach>
</body>
</html>
