

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Add extends HttpServlet {

  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String FristNumber=request.getParameter("FirstNumber");
		String SecondNumber=request.getParameter("SecondNumber");
		System.out.println(FristNumber);
		System.out.println(SecondNumber);
		int firstnum1=Integer.parseInt(FristNumber);
		int secondnum1=Integer.parseInt(SecondNumber);
		int result=firstnum1+secondnum1;
		PrintWriter out=response.getWriter();
		out.println("the  addition result of two numbers"+result);
		
		
	}



}
