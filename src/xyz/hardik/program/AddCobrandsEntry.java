package xyz.hardik.program;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import xyz.hardik.entity.Cobrands;
import xyz.hardik.util.HibernateSessionFactoryBuilder;

/**
 * Created by HARDIK on 21-05-2017.
 */
public class AddCobrandsEntry {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateSessionFactoryBuilder.getSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        Cobrands cobrands = new Cobrands();
        cobrands.setCobrandName("BOfA2");
        cobrands.setCobrandsId("100004");

        session.save(cobrands);

        tx.commit();

        session.close();

    }
}
