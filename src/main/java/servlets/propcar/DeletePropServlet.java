package servlets.propcar;


import domain.PropCar;
import service.PropCarService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/prpt/delete")
public class DeletePropServlet extends HttpServlet {

    private PropCarService propCarService=new PropCarService();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id=Long.valueOf(req.getParameter("id"));
        PropCar propCar=propCarService.findPr(id);
        propCarService.deletePr(propCar);
        resp.sendRedirect("/prpt");

    }
}
