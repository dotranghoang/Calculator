import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCalculator" , urlPatterns = "/calculator")
public class ServletCalculator extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        float firstOperand = Float.parseFloat(request.getParameter("first-operand"));
        float secondOperand = Float.parseFloat(request.getParameter("second-operand"));
        String operator = request.getParameter("operator");
        float result = Calculator.caculate(firstOperand,secondOperand,operator);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Result: "+firstOperand+" "+operator+" "+secondOperand+" = "+result+"<h1>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
