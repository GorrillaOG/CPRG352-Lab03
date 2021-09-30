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
        request.setAttribute("Result", " ----" );
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        //stop the code call after loading JSP
        
        return;
         
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NumberFormatException {

        //capture the parameters coming in from the POST request
        String One = request.getParameter("1st");
 
        String Two = request.getParameter("2nd");
       
        //set some attributes in the request object.
        //the request objext will be passed through to the jsp by the forward()method.
        request.setAttribute("one",One );
           request.setAttribute("two", Two);

            Integer i = 0;
            Integer k =0;
            
            Integer c=0;

        try {
            
            if (One==null ||One.equals("") || Two==null||Two.equals("")) {

                //set up a helpful message for the user
                request.setAttribute("Result", "Invalid");
                //display form again
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
             
            }
            i = Integer.parseInt(One.trim());
             k = Integer.parseInt(Two.trim());
             
        } catch (NumberFormatException e) {

            //set up a helpful message for the user
            request.setAttribute("Result", "Invalid");
            //display form again
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
            
          
           
        }
        
         String sub1 = request.getParameter("submit1");//request.setAttribute("plus",sub1 );
          if(sub1.equals("+"))
		{
		c= i+k;
		}
     String sub2 = request.getParameter("submit1");//request.setAttribute("minus", sub2);
     if(sub2.equals("-"))
		{
		 c=i-k;	
		}
       String sub3 = request.getParameter("submit1");//request.setAttribute("multi",sub3 );
       if(sub3.equals("*"))
		{
		  c=i*k;	
		}
        String sub4 = request.getParameter("submit1");//request.setAttribute("rem", sub4);
       if(sub4.equals("%"))
		{
			c=i%k;
		}
		
        
            //   
          // 
           
          //  
          // 
         
		
		
		

        //valdiation if the parameters dont exist or empty, show the first page again.
        request.setAttribute("Result", c);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;

        //  String agee = request.getParameter("Age");
//System.out.println("EmailListServlet email: " + email);
    }

}