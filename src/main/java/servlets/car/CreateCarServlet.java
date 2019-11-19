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

@WebServlet(urlPatterns = "/create")
public class CreateCarServlet  extends HttpServlet {

    private CarService carService =new CarService();
    private PropCarService propCarService=new PropCarService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            String marka = request.getParameter("marka");
            Long property = Long.valueOf(request.getParameter("property"));
            PropCar propCar = propCarService.findPr(property);
            Car car = new Car(null,marka, propCar);
            carService.saveCar(car);

            response.sendRedirect("/");
    }
}
