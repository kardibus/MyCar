package servlets.car;

import domain.Car;
import domain.PropCar;
import service.CarService;
import service.PropCarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/")
public class GetCarServlet extends HttpServlet {

    private CarService carService = new CarService();
    private PropCarService propCarService = new PropCarService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Car> car = carService.findAllCar();
        List<PropCar> propCars = propCarService.findAllPr();
        request.setAttribute("propCars", propCars);
        request.setAttribute("car", car);
        request.getRequestDispatcher("/index.ftl").forward(request, response);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id=Long.valueOf(req.getParameter("id"));
        resp.sendRedirect("/");
    }
}
