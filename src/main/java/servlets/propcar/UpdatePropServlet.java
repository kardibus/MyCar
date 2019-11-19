package servlets.propcar;

import domain.PropCar;
import service.PropCarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/prpt/update")
public class UpdatePropServlet extends HttpServlet {

    private PropCarService propCarService=new PropCarService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id=Long.valueOf(req.getParameter("id"));
        String prpt=req.getParameter("prpt");
        PropCar propCar=new PropCar();
        propCar.setId(id);
        propCar.setPrpt(prpt);
        propCarService.updatePr(propCar);

        resp.sendRedirect("/prpt");

    }
}

