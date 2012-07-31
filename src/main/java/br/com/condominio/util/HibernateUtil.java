/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.condominio.util;

import br.com.condominio.model.Autorizacao;
import br.com.condominio.model.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

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
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
            config.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
            config.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/gerentecondominio");
            config.setProperty("hibernate.connection.username", "postgres");
            config.setProperty("hibernate.connection.password", "postgres");
//          descomentar para criar a base
//          SchemaExport se = new SchemaExport(config);
//          se.create(false, true);
            return config.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void main(String[] args) {
        HibernateUtil.getSessionFactory();
    }
}
