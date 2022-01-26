package ServletExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/recruiter")
public class Recruiter extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String email = getServletConfig().getInitParameter("Email");
		String website = getServletContext().getInitParameter("Website-Name");
		
		PrintWriter out = res.getWriter();
		out.println("<center><h1>" + website + "</h1></center><br><p> Contact Us:" + email + "</p>");
	}
}
