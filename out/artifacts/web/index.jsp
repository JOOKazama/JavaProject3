<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head> <title>Create</title> </head>

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
        width:830px; height:481px;
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

<h1 style="color:purple" class="l">Създаване на профил</h1>

<form style="background-color:orange" class="l2" action="Main" method="POST">

    <label for="name" style="color:purple" class="l4">Име:</label><br>
    <input type="text" id="name" placeholder="Въведете име за контакт" style="color:dimgray" class="l1" size="120" name="name"><br>

    <label for="username" style="color:purple" class="l3">Потребителско име:</label><br>
    <input type="text" id="username" placeholder="Въведете имейл и адрес" style="color:dimgray" class="l1" size="120" name="username"><br>

    <label for="password" style="color:purple" class="l3">Парола:</label><br>
    <input type="password" id="password" placeholder="Въведете парола поне с 8 символа" style="color:dimgray" class="l1" size="120" name="password"><br>

    <label for="password1" style="color:purple" class="l3">Повторете паролата:</label><br>
    <input type="password" id="password1" placeholder="Въведете парола поне с 8 символа" style="color:dimgray" class="l1" size="120" name="password1"><br>

    <input type="submit" class="l5" value="Вход" name="sub">

</form>

</body>

</html>