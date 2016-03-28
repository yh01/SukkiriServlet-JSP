package serv1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");

		String err = "";
		if(name == null || name.length() == 0){
			err += "名前が入力されていない<br>";
		}

		if(gender == null || gender.length() == 0){
			err += "性別が選択されていない<br>";
		}else{
			if(gender.equals("0")){gender = "男";}
			else if(gender.equals("1")){gender = "女";}
		}

		String msg = name + "さん("+ gender +")を登録しました";
		if(err.length() != 0){
			msg = "失敗しました";
		}

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+ msg +"</p>");
		out.println("</body>");
		out.println("</html>");
	}
}
