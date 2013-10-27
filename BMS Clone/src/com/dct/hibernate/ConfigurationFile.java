/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dct.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Subayan
 */
public class ConfigurationFile {
    private static Session session;

    /**
     * @return the session
     */
    public static Session getSession() {
        return session;
    }

    public ConfigurationFile() {
    
        Configuration cfg = new Configuration();
        cfg = cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        session = sf.openSession();
        
    }
       
    
}
