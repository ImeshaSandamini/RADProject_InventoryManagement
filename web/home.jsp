<%-- 
    Document   : home
    Created on : Jan 24, 2020, 11:18:24 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <style>
          body{
background-image :linear-gradient(rgba(0,0,0,0.2),rgba(0,0,0,0.2)),url(oo.jpg);
}

      .topnav{
float:right;
list-style:none;
margin-top:30px;
}


.topnav li{
display:inline-block;
}

.topnav li a{
color:white;
text-decoration:none;
padding:5px 20px;
font-family:"Roboto",sans-serif;
font-size:15px;
}

.topnav li.active a{
border:2px solid white;
}

.topnav li a:hover{
border:2px solid white;
}  
.heading{
    
    color: white;
    font-size: 70px;
    top:80%;
	left:50%;       
}
.footer {
    position:absolute;
    bottom: 0;
    width: 100%;
    height :25px;
    text-align : center ;
    background-color: #20b2aa;

}
            
        </style>
    </head>
    <body>
        <div class="row">
<ul class="topnav">
  <li><a href="home.jsp">HOME</a></li>
  <lI><a href="Registration.html">REGISTRATION</a></li>
  <li><a href="about.html">ABOUT US</a></li>
  <li><a href="login.html">LOGIN</a></li>
  </ul>
</div>
        <br>
        <br>
        <br>
        <br><br><br><br>
        <div class="heading">
        INVENTORY MANAGEMENT<br> SYSTEM
        </div>
       
        <div class="footer  col-12">

            © Copyright 2020. All rights reserved.
        </div>          

    </body>
</html>
