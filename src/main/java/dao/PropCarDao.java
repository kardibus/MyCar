package dao;

import Utils.HibernateSessionFactoryUtil;
import domain.PropCar;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PropCarDao {

    public PropCar findById(Long id) {
        PropCar propCar=new PropCar();
        Session session = HibernateSessionFactoryUtil.getSession();
        try {
        propCar= session.get(PropCar.class, id);
        session.getTransaction().commit();
        } catch (Exception e) {
        session.getTransaction().rollback();
        e.printStackTrace();
        } finally {
        session.close();
        }
        return propCar;
    }

    public void save(PropCar propCar) {
        Session session = HibernateSessionFactoryUtil.getSession();
        Transaction tx1 = session.beginTransaction();
        session.save(propCar);
        tx1.commit();
        session.close();
    }

    public void update(PropCar propCar) {
        Session session = HibernateSessionFactoryUtil.getSession();
        Transaction tx1 = session.beginTransaction();
        session.update(propCar);
        tx1.commit();
        session.close();
    }

    public void delete(PropCar propCar) {
        Session session = HibernateSessionFactoryUtil.getSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(propCar);
        tx1.commit();
        session.close();
    }

    public List<PropCar> findAll() {
        Session session=HibernateSessionFactoryUtil.getSession();
        List<PropCar> cars =   session.createQuery("from PropCar").list();
        session.close();
        return cars;
    }
}
