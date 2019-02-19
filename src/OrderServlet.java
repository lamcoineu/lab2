import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.Writer;

@WebServlet (urlPatterns = {"/order"})
public class OrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        resp.setContentType("text/html;charset = UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Đặt Hàng</title></head>");
        writer.println("<body><h1>Đặt Hàng</h1>");
        writer.println("<form method = 'post'>");
        writer.println("<table>");
        writer.println("<tr>");
        writer.println("<td>Họ Tên:</td>");
        writer.println("<td><input name = 'name'></td>");
        writer.println("</tr>");

        writer.println("<tr>");
        writer.println("<td>Địa Chỉ:</td>");
        writer.println("<td><textarea name = 'address' clos = '40' rows = '5'></textarea></td>");
        writer.println("</tr>");

        writer.println("<tr>");
        writer.println("<td>Thành Phố:</td>");
        writer.println("<td><select name = 'city'>");
        writer.println("<option>Hà Nội</option>");
        writer.println("<option>Thành Phố Hồ Chí Minh</option>");
        writer.println("</select></td>");
        writer.println("</tr>");

        writer.println("<tr>");
        writer.println("<td>Vận Chuyển:</td>");
        writer.println("<td><input type = 'radio' name = 'deliveryMethod' value = 'HanoiPost'/>Hà Nội Post>");
        writer.println("<input type = 'radio' name = 'deliveryMethod' value = 'GiaoHangTietKiemPost'/>Giao Hàng Tiết Kiệm");
        writer.println("</tr>");

        writer.println("<tr>");
        writer.println("<td>Ghi Chú:</td>");
        writer.println("<td><textarea name = 'note' clos = '40' rows = '5'></textarea></td>");
        writer.println("</tr>");

        writer.println("<tr>");
        writer.println("<td>Đăng Kí Nhận Bản Tin:</td>");
        writer.println("<td><input type = 'checkbox' name = 'catalogRequest'/></td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>&nbsp;</td>");
        writer.println("<td><input type = 'reset' value = 'nhập lại'><input type = 'submit' value = 'xác nhận'/></td>");
        writer.println("</tr>");

        writer.println("</table>");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Đơn hàng</title></head>");
        writer.println("</head>");
        writer.println("<body><h1>Đơn hàng</h1>");
        writer.println("<table>");
        writer.println("<tr>");
        writer.println("<td>Họ tên:</td>");
        writer.println("<td>" + req.getParameter("name") + "</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Địa chỉ:</td>");
        writer.println("<td>" + req.getParameter("address") + "</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Thành phố:</td>");
        writer.println("<td>" + req.getParameter("city") + "</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Ghi chú:</td>");
        writer.println("<td>" + req.getParameter("note") + "</td>");
        writer.println("</td>");
        writer.println("</tr>");
        writer.println("<tr>");
    }
}