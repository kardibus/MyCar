package servlets.car;

import domain.Car;
import service.CarService;
import service.PropCarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/update")
public class UpdateCarServlet extends HttpServlet {
    private CarService carService=new CarService();
    private PropCarService propCarService=new PropCarService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id=Long.valueOf(req.getParameter("id"));
        String marka=req.getParameter("marka");
        Long ptrpid=Long.valueOf(req.getParameter("prpt"));
        Car car=new Car();
        car.setId(id);
        car.setMarka(marka);
        car.setPrptscar(propCarService.findPr(ptrpid));
        carService.updateCar(car);
        resp.sendRedirect("/");
    }
}
