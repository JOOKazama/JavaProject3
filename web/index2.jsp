<%@ page import="Tables.User" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head> <title>Information</title> </head>

<style>

    div.l1
    {
        height: 100px;
        background-color:#012e5e;
    }

    div.l2
    {
        height: 1300px;
        background-color:papayawhip;
        padding-top: 10px;
    }

    div.l3
    {
        height: 150px;
        background-color:#012e5e;
    }

    input.l4
    {
        color:#012e5e;
        border-radius: 4px;
        border-style: none;
    }

    img.l5
    {
        margin: 20px 20px 40px 150px;
        float: left;
        display: inline-block;
    }

    h3.l6 { color:purple; }

    h3.l7
    {
        color:purple;
        text-align: left;
    }

    div.l9
    {
        margin-left: 130px;
        background-color: white;
        width: 970px;
        height: 300px;
        padding: 50px;
        border-radius: 25px;
    }

    div.l10
    {
        margin-left: 130px;
        background-color: white;
        width: 970px;
        height: 150px;
        padding: 50px;
        border-radius: 25px;
    }

    input.l13
    {
        font-family: Andalus, cursive;
        margin-top: 30px;
        margin-left: 5px;
        background-color: orange;
        border: none;
        color: black;
        padding: 10px 10px;
        text-align: center;
        font-size: 15px;
        border-radius: 4px;
    }

    label.l14
    {
        color: #012e5e;
        font-size: 17px;
        font-family: Andalus, cursive;
    }

    input.l15
    {
        color:#012e5e;
        border-radius: 4px;
        border-width: 1px;
        border-color: #012e5e;
    }

    input.l16
    {
        font-family: Andalus, cursive;
        margin-left: 150px;
        background-color: #012e5e;
        border: none; color: white;
        padding: 10px 10px;
        text-align: center;
        font-size: 15px;
        border-radius: 4px;
    }

    input.slider
    {
        -webkit-appearance: none;
        width: 100%;
        height: 15px;
        border-radius: 5px;
        background: #d3d3d3;
        outline: none;
        opacity: 0.7;
        -webkit-transition: .2s;
        transition: opacity .2s;
    }

    input.slider::-webkit-slider-thumb
    {
        -webkit-appearance: none;
        appearance: none;
        width: 25px;
        height: 25px;
        border-radius: 50%;
        background: #4CAF50;
        cursor: pointer;
    }

    input.slider::-moz-range-thumb
    {
        width: 25px;
        height: 25px;
        border-radius: 50%;
        background: #4CAF50;
        cursor: pointer;
    }

</style>

<script> function updated() { alert("Updated!"); } </script>

<body>

<form action="ShowUser" method="POST">

    <% User user=(User)request.getSession().getAttribute("user"); %>

<div class="l1">
    <input type="submit" class="l13" value="Регистрация" name="reg">
    <input type="submit" class="l13" value="Потребители" name="list">
    <input type="submit" class="l13" value="Изход" name="exit">
</div>

<div class="l2">

    <input type="submit" class="l16" id="first" name="first" value="Запази" style="display:block;" onclick="updated()">

    <img src="data:image/jpeg;base64,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" class="l5" alt="My man.">
    <div style="display:inline-block">
        <h3 class="l6">Профилна информация</h3>
        <label class="l14" for="name">Име: </label><br> <input type="text" class="l4" id="name" name="name" value="<%=user.getName()%>"><br>
        <label class="l14" for="job">Работа: </label><br> <input type="text" class="l4" id="job" name="job" value="<%=user.getJob()%>"><br>
        <label class="l14" for="area">Описание: </label><br> <textarea id="area" rows="3" cols="50" name="area"><%=user.getDescription()%>
        </textarea>
    </div>

    <input type="submit" class="l16" id="second" name="second" value="Запази" style="display:block; margin-top: 50px;" onclick="updated()">

    <h3 class="l6" style="text-align: center; margin-top: 10px; display:block;">Умения</h3>

    <div class="l9">
        <div style="float: left;">
            <h3 class="l7">Професионални</h3>

            <label class="l14" for="java">Java</label><br>
            <input type="range" id="java" name="java" class="slider" min="0" max="10" value="<%=user.getJava()%>"><br>

            <label class="l14" for="html">HTML</label><br>
            <input type="range" id="html" name="html" class="slider" min="0" max="10"  value="<%=user.getHtml()%>"><br>

            <label class="l14" for="css">CSS</label><br>
            <input type="range" id="css" name="css" class="slider" min="0" max="10" value="<%=user.getCss()%>"><br>

            <label class="l14" for="js">JavaScript</label><br>
            <input type="range" id="js" name="js" class="slider" min="0" max="10" value="<%=user.getJs()%>"><br>

        </div>

        <div style="margin-left: 500px; padding-right: 295px;">
            <h3 class="l7">Лични</h3>

            <label class="l14" for="com">Комуникативност</label><br>
            <input type="range" id="com" name="com" class="slider" min="0" max="10" value="<%=user.getCom()%>"><br>

            <label class="l14" for="team">Екипна работа</label><br>
            <input type="range" id="team" name="team" class="slider" min="0" max="10" value="<%=user.getTeam()%>"><br>

            <label class="l14" for="cre">Креативност</label><br>
            <input type="range" id="cre" name="cre" class="slider" min="0" max="10" value="<%=user.getCre()%>"><br>
        </div>
    </div>

    <input type="submit" class="l16" id="third" name="third" value="Запази" style="display:block; margin-top: 50px;" onclick="updated()">

    <div class="l10" style="margin-top: 20px; display:inline-block">

        <div style="float: left; margin-left: 70px; margin-right: 330px;">
            <label class="l14" for="email">Имейл: </label><br> <input type="text" class="l15" id="email" name="email"  value="<%=user.getEmail()%>"><br>
        </div>

        <div> <label class="l14" for="city">Град: </label><br> <input type="text" class="l15" id="city" name="city"  value="<%=user.getCity()%>"><br> </div>

        <div style="float: left; margin-left: 70px; margin-right: 330px;">
            <label class="l14" for="tel">Телефон: </label><br> <input type="text" class="l15" id="tel" name="tel"  value="<%=user.getTel()%>"><br>
        </div>

        <div style="padding-top: 5px;">
            <label class="l14" for="street">Улица: </label><br> <input type="text" class="l15" id="street" name="street"  value="<%=user.getStreet()%>"><br>
        </div>

    </div>

</div>

<div class="l3"></div>

</form>

</body>

</html>