import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.Locale;

public class Catalog extends HttpServlet  {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        String lng = request.getParameter("lang");
        Locale locale = new Locale("ru", "");
        if(lng != null){
            locale = new Locale(lng, "");
        }
        ResourceBundle bundle = ResourceBundle.getBundle("local", locale);

        getServletContext().getRequestDispatcher("/catalog.jsp").forward(request, response);
    }
}
