package servlets.car;

import domain.Car;
import service.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class DeleteCarServlet extends HttpServlet {
    private CarService carService=new CarService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id=Long.valueOf(req.getParameter("id"));
        Car car=carService.findCar(id);
        carService.deleteCar(car);
        resp.sendRedirect("/");
    }
}
