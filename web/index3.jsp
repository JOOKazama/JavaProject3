<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head> <title>Login</title> </head>

<style>

    h1.l
    {
        margin-top: 20px;
        margin-bottom: 20px;
        text-align:center;
    }

    input.l1
    {
        border-radius: 5px;
        border: 2px solid white;
        padding-top:10px;
        padding-bottom:10px;
        padding-left:25px;
    }

    form.l2
    {
        width:830px; height:300px;
        text-align: center;
        margin: 0 auto;
    }

    label.l3
    {
        display:inline-block;
        margin-top: 20px;
        margin-bottom: 10px;
        font-size: 15px;
        font-weight: 700;
    }

    label.l4
    {
        display:inline-block;
        margin-top: 40px;
        margin-bottom: 10px;
        font-size: 15px;
        font-weight: 700;
    }

    input.l5
    {
        margin-top: 20px;
        margin-bottom: 20px;
        border-radius: 5px;
        border: 2px solid purple;
        background-color: purple;
        padding: 11px 170px;
        color: white;
        font-size: 17px;
    }

</style>

<body>

<h1 style="color:purple" class="l">Влезте в системата</h1>

<form style="background-color:orange" class="l2" action="Login" method="POST">

    <label for="username" style="color:purple" class="l4">Потребителско име:</label><br>
    <input type="text" id="username" placeholder="Въведете имейл адрес: " style="color:dimgray" class="l1" size="120" name="username"><br>

    <label for="password" style="color:purple" class="l3">Парола:</label><br>
    <input type="password" id="password" placeholder="Въведете парола: " style="color:dimgray" class="l1" size="120" name="password"><br>

    <input type="submit" class="l5" value="Вход" name="enter">

</form>

</body>

</html>