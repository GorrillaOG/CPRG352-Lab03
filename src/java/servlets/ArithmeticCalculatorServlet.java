package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 504785
 */
//@WebServlet(urlPatterns = {"/AgeCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //load up JPS
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        //stop the code call after loading JSP
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NumberFormatException {

        //capture the parameters coming in from the POST request
        String One = request.getParameter("one");
        String Two = request.getParameter("two");
        //set some attributes in the request object.
        //the request objext will be passed through to the jsp by the forward()method.
        request.setAttribute("num1",One );
           request.setAttribute("num2", Two);
       

        //valdiation if the parameters dont exist or empty, show the first page again.
        request.setAttribute("message", "Your age next birthday is " + (i + 1));
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;

        //  String agee = request.getParameter("Age");
//System.out.println("EmailListServlet email: " + email);
    }

}