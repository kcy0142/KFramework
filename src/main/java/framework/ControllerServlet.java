package framework;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends  HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		process(req,resp);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		process(req,resp);
	}
	
	public void process(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		out.println("Hello Controller Servlet");
}
	

}
