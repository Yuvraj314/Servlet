

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/saveData")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int empId=Integer.parseInt(request.getParameter("empId"));
		String empName=request.getParameter("empName");
		int empSal=Integer.parseInt(request.getParameter("empSal"));
		String address[]=request.getParameterValues("address");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("ShowDetailsServlet");
		request.setAttribute("arg1", empId);
		request.setAttribute("arg2", empName);
		request.setAttribute("arg3", empSal);
		request.setAttribute("arg4", address);
		
		dispatcher.forward(request,response);
		
		
	}

}
