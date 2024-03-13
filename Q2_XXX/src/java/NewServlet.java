import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Vector;

@WebServlet(name = "execute", urlPatterns = {"/execute"})
public class NewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {
            String txtCode = request.getParameter("txtCode");
            String txtName = request.getParameter("txtName");
            String txtSchedule = request.getParameter("txtSchedule");

            if (txtCode != null && txtName != null && txtSchedule != null) {
                Vector<Data> listData;
                if (request.getSession().getAttribute("list") != null) {
                    listData = (Vector<Data>) request.getSession().getAttribute("list");
                } else {
                    listData = new Vector<Data>();
                }
                listData.add(new Data(txtCode, txtName, txtSchedule));
                request.getSession().setAttribute("list", listData);
            }

            request.getRequestDispatcher("MyExam.jsp").forward(request, response);
        } catch (Exception ex) {
            // Log the exception or display an error message
            ex.printStackTrace();
            request.getRequestDispatcher("MyExam.jsp").forward(request, response);
        }
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

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
