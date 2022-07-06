import javax.servlet.*;
import java.io.*;
public class servlet1 extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		res.setContentType("text/html");
		String ip=req.getLocalAddr();
		String uname=req.getParameter("uname");
		String p=req.getParameter("pass");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println("<h1>Hello"+uname+"</h1>");
		out.println("<h1>Server IP:"+ip+"</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}