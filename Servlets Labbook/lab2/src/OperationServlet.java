

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OperServlet")
public class OperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int op1=Integer.parseInt(request.getParameter("op1"));
		int op2=Integer.parseInt(request.getParameter("op2"));
		
		String addt=request.getParameter("add");
		String subt=request.getParameter("sub");
		String mult=request.getParameter("mul");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("ShowResultServlet");
	
		request.setAttribute("arg1", op1);
		request.setAttribute("arg2", op2);
		
		request.setAttribute("arg3", addt);
		request.setAttribute("arg4", subt);
		request.setAttribute("arg5", mult);
		dispatcher.forward(request,response);
	}

}
