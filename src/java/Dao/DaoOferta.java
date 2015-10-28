/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import HibernateUtil.HibernateUtil;
import Interfaces.InterfaceOferta;
import Pojos.Oferta;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Cilop002
 */
public class DaoOferta implements InterfaceOferta{
    private Session se;
    @Override
    public boolean insert(Oferta ofer) throws Exception {
        se=HibernateUtil.getSessionFactory().openSession();
        Transaction tx = se.beginTransaction();
        se.save(ofer);
        tx.commit();
        se.close();
        return true;
    }

    @Override
    public List<Oferta> mostrar() throws Exception {
         se=HibernateUtil.getSessionFactory().openSession();
         Transaction tx = se.beginTransaction();
         Query q = se.createQuery("From Oferta");
         List<Oferta> listaOferta = (List<Oferta>)q.list();
         tx.commit();
         se.close();
         return listaOferta;
    }

    @Override
    public Oferta modificar(String cod) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Oferta ofer) throws Exception {
        /*se=HibernateUtil.getSessionFactory().openSession();
        Transaction tx = se.beginTransaction();
        se.delete(ofer);
        tx.commit();
        se.close();
        return true;*/
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
