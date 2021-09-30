<%-- 
    Document   : agecalculator
    Created on : Sep 27, 2021, 11:35:17 AM
    Author     : 504785
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <label>Enter your age:</label>
            <input type="text" name="Age" value="${Age}">
            <br>
         
              <br><br>
              <input type="submit" value="Age next birthday">
        </form>
            <p>${message1}</p>
        <p>${message}</p>
        <!-- <p>${age1}</p>-->
             <a href="/Calculator/arithmetic">Arithmetic Calculator</a> 
    </body>
</html>