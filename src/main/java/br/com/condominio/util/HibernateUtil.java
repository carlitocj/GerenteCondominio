/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.condominio.util;

import br.com.condominio.model.Autorizacao;
import br.com.condominio.model.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author carlito
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration config = new Configuration();
            config.addAnnotatedClass(Autorizacao.class);
            config.addAnnotatedClass(Usuario.class);
            //descomentar para criar a base
            //SchemaExport se = new SchemaExport(config);
            //se.create(true, true);
            return config.configure().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
