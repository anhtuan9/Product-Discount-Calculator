import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "discount_servlet", urlPatterns = "/display_discount")
public class discount_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a = request.getParameter("Discount_Percent");
        double b = Double.parseDouble(request.getParameter("ListPrice"));
        double c = Double.parseDouble(request.getParameter("DiscountPercent"));
        double Discount_Amount = b * c * 0.1;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println(Discount_Amount);
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
