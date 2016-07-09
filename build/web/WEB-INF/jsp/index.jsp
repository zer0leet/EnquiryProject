<%@include file="header.jsp"  %>
<ul>
    <c:forEach var="c" items="${courses}">
    <li><a href="${SITE_URL}/courses/details/${c.id}">${c.name}</a></li>   
</c:forEach>
</ul>
<%@include file="footer.jsp"  %>
