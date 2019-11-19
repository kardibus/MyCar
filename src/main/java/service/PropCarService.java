package service;

import dao.CarDao;
import dao.PropCarDao;
import domain.Car;
import domain.PropCar;

import java.util.List;

public class PropCarService {
    private PropCarDao propCarDao = new PropCarDao();

    public PropCarService() { }

    public PropCar findPr(Long id) {
        return propCarDao.findById(id);
    }

    public void savePr(PropCar propCar) {
        propCarDao.save(propCar);
    }

    public void deletePr(PropCar propCar) {
        propCarDao.delete(propCar);
    }

    public void updatePr(PropCar propCar) {
        propCarDao.update(propCar);
    }

    public List<PropCar> findAllPr() {
        return propCarDao.findAll();
    }
}
