import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        UserService.populateUsers();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            if (req.getParameter("button1") != null) {
                String richestUser = UserService.getRichestUser();
                req.setAttribute("richestuser", richestUser);
                req.getRequestDispatcher("views/richestuser.jsp").forward(req, resp);
            } else {
                if (req.getParameter("button2") != null) {
                    int sum = UserService.getAccountsSum();
                    req.setAttribute("accountssum", sum);
                    req.getRequestDispatcher("views/accountssum.jsp").forward(req, resp);
                }
            }
   }
}





