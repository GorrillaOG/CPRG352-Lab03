
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="age">
            <label>First:</label>
            <input type="text" name="1st" value="${one}">
            <br>
               <label>Second:</label>
            <input type="text" name="2nd" value="${two}">
            <br>
         
         
              <br><br>
              <input type="submit" value="+">
              <input type="submit" value="-">
              <input type="submit" value="*">
              <input type="submit" value="%">
        </form>
            <p>${message1}</p>
        <p>${message}</p>
        <!-- <p>${age1}</p>-->
             <a href="/age">Arithmetic Calculator</a> 
    </body>
</html>