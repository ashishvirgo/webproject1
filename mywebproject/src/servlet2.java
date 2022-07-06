import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class servlet2 extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		res.setContentType("text/html");
		String ip=req.getLocalAddr();
		String uname=req.getParameter("uname");
		String p=req.getParameter("pass");
		PrintWriter out=res.getWriter();
		if(p.equals("manager")){
RequestDispatcher rd=req.getRequestDispatcher("hello");
          rd.forward(req,res);
		}
		else{
			out.println("username or password is incorrect");
RequestDispatcher rd=req.getRequestDispatcher("/login.html");
          rd.include(req,res);			
		}
			
		                
	
		out.close();
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		doGet(req,res);
	}
}