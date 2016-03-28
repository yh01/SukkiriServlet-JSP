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
@WebServlet("/testenq")
public class testenq extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String qType = request.getParameter("qType");
		String content = request.getParameter("content");

		String err = "";
		if(name == null || name.length() == 0){
			err += "名前が入力されていない<br>";
		}

		if(content == null || content.length() == 0){
			err += "内容が入力されていない<br>";
		}

		if(qType == null || qType.length() == 0){
			err += "お問い合わせ種別が選択されていない<br>";
		}else{
			if(qType.equals("1")){qType = "会社について";}
			else if(qType.equals("2")){qType = "製品について";}
			else if(qType.equals("3")){qType = "アフターサポートについて";}
		}

		String msg = name + "さん<br>" + "お問い合わせ種別：" + qType + "<br>" + "内容：" + content;
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
