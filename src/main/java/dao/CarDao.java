package dao;

import Utils.HibernateSessionFactoryUtil;
import domain.Car;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CarDao  {

    public Car findById(Long id) {
        Car car=new Car();
        Session session = HibernateSessionFactoryUtil.getSession();
        try {
            car= session.get(Car.class, id);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return car;
    }

    public void save(Car car) {
        Session session = HibernateSessionFactoryUtil.getSession();
        Transaction tx1 = session.beginTransaction();
        session.save(car);
        tx1.commit();
        session.close();
    }

    public void update(Car car) {
        Session session = HibernateSessionFactoryUtil.getSession();
        Transaction tx1 = session.beginTransaction();
        session.update(car);
        tx1.commit();
        session.close();
    }

    public void delete(Car car) {
        Session session = HibernateSessionFactoryUtil.getSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(car);
        tx1.commit();
        session.close();
    }

    public List<Car> findAll() {
        Session session=HibernateSessionFactoryUtil.getSession();
        List<Car> cars = (List<Car>)  session.createQuery("from Car").list();
        session.close();
        return cars;
    }
}
