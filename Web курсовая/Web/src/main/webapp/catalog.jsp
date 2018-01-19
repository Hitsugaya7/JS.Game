<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ResourceBundle" %>
<%@ page import="java.util.Locale" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="FirstServlet" %>
<html>
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
    <title>my design</title>
</head>
<body>

<jsp:include page="Header.jsp"/>
<div id='container' class="center for-line">

    <%
        String img;
        for(int i = 1; i < 5; i++){
            img = "./items/" + Integer.toString(i) + ".jpg";
    %>
    <jsp:setProperty name="ringBean" property="id" value="<%= i%>"/>
    <jsp:setProperty name="ringBean" property="imageUrl" value="<%=img%>"/>
    <jsp:include page="item.jsp"/>
    <%
        }
    %>
</div>
<%--<jsp:include page="Footer.jsp"/>--%>
</body>
</html>
