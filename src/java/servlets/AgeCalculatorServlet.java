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
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //load up JPS
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        //stop the code call after loading JSP
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NumberFormatException {

        //capture the parameters coming in from the POST request
        String ag = request.getParameter("Age");

        //set some attributes in the request object.
        //the request objext will be passed through to the jsp by the forward()method.
        request.setAttribute("age1", ag);
        Integer i = 0;

        try {
            
            if (ag==null||ag.equals("")) {

                //set up a helpful message for the user
                request.setAttribute("message", "You must give your current age");
                //display form again
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                return;
            }
            i = Integer.parseInt(ag.trim());
        } catch (NumberFormatException e) {

            //set up a helpful message for the user
            request.setAttribute("message1", "You must input number");
            //display form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }

        //valdiation if the parameters dont exist or empty, show the first page again.
        request.setAttribute("message", "Your age next birthday is " + (i + 1));
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;

        //  String agee = request.getParameter("Age");
//System.out.println("EmailListServlet email: " + email);
    }

}