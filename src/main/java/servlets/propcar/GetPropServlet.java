package servlets.propcar;

import domain.PropCar;
import service.PropCarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/prpt")
public class GetPropServlet extends HttpServlet {

    private PropCarService propCarService=new PropCarService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<PropCar> propCars =propCarService.findAllPr();
        req.setAttribute("propCars",propCars);
        req.getRequestDispatcher("/prpt.ftl").forward(req,resp);
    }

}
