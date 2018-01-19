<%@ page import="java.util.ResourceBundle" %>
<%@ page import="java.util.Locale" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String lng = request.getParameter("lang");
    Locale locale = new Locale("ru", "");
    if(lng != null){
        locale = new Locale(lng, "");
    }
    ResourceBundle bundle = ResourceBundle.getBundle("local", locale);
%>


<div id="ee">
    <ul>
        <li><a href=""><%=bundle.getString("main")%> </a></li>
        <li><a href=""><%=bundle.getString("list")%></a></li>
        <li><a href=""><%=bundle.getString("enter")%></a></li>
        <li><a href=""><%=bundle.getString("history")%></a></li>
        <li><a href=""><%=bundle.getString("cart")%></a></li>
        <li><a href=""><%=bundle.getString("basket")%></a></li>
    </ul>

    <form id="rr">
        <select class="select" name="lang" id="lan">
            <option value="ru"><%=bundle.getString("rus_lang")%></option>
            <option value="en"><%=bundle.getString("eng_lang")%></option>
            <option value="de"><%=bundle.getString("deu_lang")%></option>
        </select>
        <button type=\"submit\">"submit"</button>
    </form>
</div>


