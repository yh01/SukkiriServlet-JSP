package serv1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex62serv
 */
@WebServlet("/Ex62serv")
public class Ex62serv extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex62serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int ram = (int)(Math.random() * 9);
		if(ram / 2 == 0){
			RequestDispatcher dispatcher = request.getRequestDispatcher("/forwarded.jsp");
			dispatcher.forward(request, response);
		}else{
			response.sendRedirect("redirect.jsp");
		}
	}

}
