<html>
<head>

<style>

input[type=submit]{

background-color: green;
border:none;
color: white;
padding: 10px 20px;
margin: 6px 3px;

}

.form{

background-color:#f2f2f2;
border-radius: 5px;
width:50%;
margin: 50px auto;

}

.input{
margin: auto;
}

.inputText{
border:1px solid black;
}
.submit{

}

</style>
</head>
<body>

<div class="form">
<form action="userapp" method="post">

<div class="input">
<div> First Name: </div>
<div> <input class="inputText" type="text" name="firstName"/> <br> </div>
</div>

<div>
<div> Last Name: </div>
<div> <input type="text" name="lastName"/> <br> </div>
</div>

<div>
<div> Email: </div>
<div> <input type="email" name="email"/> <br> </div>
</div>

<div>
<div> Phone Number: </div>
<div> <input type="numbers" name="phoneNumber"/> <br> </div>
</div>

<div class="submit">
<input type="submit" value="submit"/>
</div>

</form>
<a href="getAllUsers"><input type="submit" value="View All"</a>
</div>
</body>
</html>
