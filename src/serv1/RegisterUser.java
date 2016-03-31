package serv1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String forwardPath = null;
		String action = request.getParameter("action");
		if(action == null){
			forwardPath = "registerForm.jsp";
		}else if(action.equals("done")){
			HttpSession session = request.getSession();
			User registerUser = (User)session.getAttribute("registerUser");
			RegisterUserLogic logic = new RegisterUserLogic();
			logic.execute(registerUser);
			session.removeAttribute("registerUser");
			forwardPath = "registerDone.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");

		User registerUser = new User(id,name,pass);
		HttpSession session = request.getSession();
		session.setAttribute("registerUser", registerUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("registerConfirm.jsp");
		dispatcher.forward(request, response);
	}

}
