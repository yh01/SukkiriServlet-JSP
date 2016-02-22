package practice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Practice
 */
@WebServlet("/Practice")
public class Practice extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Practice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//第3章
		/*
		String [] luckArray = {"超スッキリ","スッキリ","最悪"};
		int index = (int)(Math.random() * 3);
		String luck = luckArray[index];

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String today = sdf.format(date);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter aa = response.getWriter();
		aa.println("<html>");
		aa.println("<head>");
		aa.println("</head>");
			aa.println("<body>");

				aa.println("<p>" + today + "の運勢は" + luck + "です" + "</p>");

			aa.println("</body>");
		aa.println("</html>");
		*/


	}

}
