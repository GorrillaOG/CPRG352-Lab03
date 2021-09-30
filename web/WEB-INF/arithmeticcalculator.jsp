
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <label>First:</label>
            <input type="text" name="1st" value="${one}">
            <br>
               <label>Second:</label>
            <input type="text" name="2nd" value="${two}">
            <br>
         
         
              <br><br>
              <input type="submit" name="submit1" value="${plus}+">
              <input type="submit" name="submit1" value="${minus}-">
              <input type="submit" name="submit1" value="${multi}*">
              <input type="submit" name="submit1" value="${rem}%">
        </form>
            <p>${Result}</p>
        
             <a href="/Calculator/age">Age Calculator</a> 
    </body>
</html>