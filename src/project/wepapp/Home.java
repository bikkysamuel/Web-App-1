package project.wepapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet 
{	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		HtmlLoginPage htmlLoginPage = new HtmlLoginPage();
		String str = "PROJECT : WEB APP <br/> DATE :: "  +  new Date();
		
		response.setContentType("text/html");
		//response.setIntHeader("Refresh", 1);
		PrintWriter out = response.getWriter();
		out.println(str + htmlLoginPage.code);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

class HtmlLoginPage
{
	String code;

	HtmlLoginPage()
	{
		this.code = "<form action = \"checkLogin\" method = \"GET\"> <br/><br/>Username : <input type = \"text\" id = \"username\" required/>"
		+ "<br/>Password : <input type = \"password\" id = \"password\" required/> </form>";
	}
}
