package dminer.web;

import dminer.service.FizzBuzz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(asyncSupported = false, name = "FizzBuzzServlet", urlPatterns = {"/count"})
public class FizzBuzzServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String numberStr = request.getParameter("number");
        Integer number = Integer.parseInt(numberStr);

        FizzBuzz fizzBuzz = new FizzBuzz();

        out.println("<html><head><title>Hello FizzBuzz</title></head><body>");
        out.println(fizzBuzz.say(number) + "</body>");
        out.println("</html>");
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
