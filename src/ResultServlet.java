import jdk.internal.org.objectweb.asm.util.Printer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet (urlPatterns = "/result")
public class ResultServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
//        int result = Integer.parseInt(req.getParameter("number1"))  + Integer.parseInt(req.getParameter("number2"));
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Cộng</title> ");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Cộng hai số</h1>");
        writer.println("<table style = width: 500px>");
        writer.println("<tr>");
        writer.println("<td><textarea name = 'number1' cols='10' rows='1'></textarea></td>");
        writer.println("<td>+</td>");
        writer.println("<td><textarea name='number2' cols='10' rows='1'></textarea></td>");

        writer.println("<td><input type='button' value='Cộng' ></td>");
        writer.println("</tr>");
        writer.println("</table>");
        writer.println("</body>");
        writer.println("</html>");
    }
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html;charset = UTF-8");
        PrintWriter writer = resp.getWriter();
        int result = Integer.parseInt(req.getParameter("number1"))  + Integer.parseInt(req.getParameter("number2"));
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title></title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Kết Quả</h1>");
        writer.println("<h1>"+ result +"</h1>");
        req.setAttribute("result",result);
        writer.println("</body>");
        writer.println("</html>");

    }
}
