package service;

import dao.CarDao;
import domain.Car;

import java.util.List;

public class CarService {
    private CarDao carDao = new CarDao();

    public CarService() { }

    public Car findCar(Long id) {
        return carDao.findById(id);
    }

    public void saveCar(Car car) {
        carDao.save(car);
    }

    public void deleteCar(Car car) {
        carDao.delete(car);
    }

    public void updateCar(Car car) {
        carDao.update(car);
    }

    public List<Car> findAllCar() {
        return carDao.findAll();
    }

}
