<%@ page import="Tables.User" %>
<%@ page import="java.util.List" %>
<%@ page import="Tables.UserCRUD" %>
<%@ page import="WebApp.UserServlet" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<html>
<head> <title>List</title> </head>

<style>

    div.l1
    {
        height: 100px;
        background-color:#012e5e;
    }

    a.button
    {
        font-family: Algerian, cursive;
        margin-top: 30px;
        margin-left: 5px;
        background-color: orange;
        border: none;
        color: black;
        padding: 10px 10px;
        text-align: center;
        display: inline-block;
        font-size: 15px;
        border-radius: 4px;
    }

    th.l2
    {
        text-align: left;
        font-size: 15px;
        background-color: orange;
        padding: 10px 10px;
        font-family: Algerian, cursive;
        border: 2px solid gray;
    }

    td.l3
    {
        text-align: left;
        font-size: 14px;
        background-color: papayawhip;
        padding: 10px 10px;
        font-family: Calibri, fantasy;
        border: 2px solid gray;
    }

    table.l4
    {
        border-collapse: collapse;
        border: 2px solid gray;
        margin-left: 20px;
        margin-top: 20px;
        margin-bottom: 20px;
    }
</style>

<% List<User>list=UserCRUD.getAll(); %>

<body>

<div style="background-color: papayawhip">

<form>

    <div class="l1">
    <a href="Login" class="button">Вход</a>
    <a href="Main" class="button">Регистрация</a>
    <a href="ShowUser" class="button">Потребител</a>
    </div>

    <table class="l4">

        <thead>
            <tr>
                <th class="l2">Потребител</th>
                <th class="l2">Работа</th>
                <th class="l2">Информация</th>
            </tr>
        </thead>

        <tbody>
        <% for(User user:list)
        {
            if(UserServlet.current_user.getUsername().equals(user.getUsername()))
            {
        %>

        <tr>
            <td class="l3"> <a href="${pageContext.request.contextPath}/ShowUser"> <%=user.getName()%> </a></td>
            <td class="l3"> <%=user.getJob()%> </td>
            <td class="l3"> <%=user.getDescription()%> </td>
        </tr>

        <%  } else { %>
            <tr>
                <td class="l3"> <a href="${pageContext.request.contextPath}/CheckUser?export=<%=user.getUsername()%>">
                <%=user.getName()%> </a></td>
                <td class="l3"> <%=user.getJob()%> </td>
                <td class="l3"> <%=user.getDescription()%> </td>

            </tr>

        <% } }; %>
        </tbody>

    </table>

</form>

</div>

</body>

</html>