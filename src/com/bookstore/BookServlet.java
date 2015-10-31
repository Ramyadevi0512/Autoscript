package com.bookstore;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double price = 0;
		String user = request.getParameter("uname");
		String books[] = request.getParameterValues("book");
		for(int i=0;i<books.length;i++){
			if(books[i].equals("java"))
				price = price+250;
			if(books[i].equals("selenium"))
				price = price+200;
			if(books[i].equals("oracle"))
				price = price+150;
			if(books[i].equals("obiee"))
				price = price+100;
		}
		PrintWriter pw = response.getWriter();
		pw.println("<center>");
		pw.println("<font color='red' size=5>");
		pw.println("User name: "+user);
		pw.println("<br>");
		pw.println("Selected Books: ");
		for(int i=0;i<books.length;i++){
			pw.println(books[i]+" ");
			pw.println("<br>");
			pw.println("Total Price: "+price);
			pw.println("<br>");
			pw.println("Thank you..Bye...</font>");
			pw.close();
		}
		pw.println("</center>");
		}
	}
