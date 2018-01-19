<%@ page import="java.util.ResourceBundle" %>
<%@ page import="java.util.Locale" %>
<%@ page import="Catalog" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" type="text/css" href="style.css">
<head>
    <%
        String lng = request.getParameter("lang");
        Locale locale = new Locale("ru", "");
        if(lng != null){
            locale = new Locale(lng, "");
        }
        ResourceBundle bundle = ResourceBundle.getBundle("local", locale);
    %>
    <jsp:useBean id="ringBean" class="Rings" scope="session"/>
</head>
<%
    int id = ringBean.getId();
%>

<div id="i<%= id%>" class="box">
    <div class="image">
        <img src="<jsp:getProperty name="ringBean" property="imageUrl"/>">
    </div>
    <div style="width: 890px">
        <h1><a href="./item?id=<%=Integer.toString(id)%>"><%=bundle.getString("ring"+id)%></a></h1>

        <%--<div class="cal"><%=bundle.getString("typeOfDiscr" + Integer.toString(id))%></div>--%>
        <form action="" method="get" name="basket">
            <input type="button" name="korzina" value="<%=bundle.getString("basket")%>">
        </form>
    </div>
</div>