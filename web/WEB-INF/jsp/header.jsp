<%-- 
    Document   : header
    Created on : Jul 9, 2016, 12:22:22 PM
    Author     : Deepika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <H1>WELCOME TO LEAPFROM ACADEMY</H1>
        <div>
            <ul>
                <li>
                    <a href="${SITE_URL}">Home</a>
                </li>
                <li>
                    <a href="${SITE_URL}/course">Course</a>
                </li>
                <li>
                    <a href="${SITE_URL}/about">About</a>
                </li>
                
            </ul>
        </div>
</html>
