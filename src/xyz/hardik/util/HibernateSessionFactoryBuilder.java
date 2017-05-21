package xyz.hardik.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by HARDIK on 21-05-2017.
 */
public class HibernateSessionFactoryBuilder {

    private SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){

        Configuration configuration = new Configuration();
        configuration.configure().addAnnotatedClass(xyz.hardik.entity.Cobrands.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();

        return configuration.buildSessionFactory(serviceRegistry);
    }

    public static SessionFactory getSessionFactory(){
        return buildSessionFactory();
    }
}
