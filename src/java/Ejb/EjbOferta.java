/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;

import Dao.DaoOferta;
import Pojos.Oferta;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Cilop002
 */
@Stateless
public class EjbOferta {

    private Oferta ofer;
    private List<Oferta> lista;
    private final DaoOferta dao;

    public EjbOferta() {
        ofer = new Oferta();
        dao = new DaoOferta();
    }
    
    public boolean insert(){
        try {
            dao.insert(ofer);
            return true;
        } catch (Exception e) {
            out.println(e.getMessage());
            return false;
        }
    }
    /*public boolean delete(){
        try {
            dao.delete(ofer);
            return true;
        } catch (Exception e) {
            out.println(e.getMessage());
            return false;
        }
    }*/
    public boolean mostrar(){
        try {
            lista=dao.mostrar();
            return true;
        } catch (Exception e) {
            out.println(e.getMessage());
            return false;
        }
    } public Oferta getOfer() {
        return ofer;
    }

    public void setOfer(Oferta ofer) {
        this.ofer = ofer;
    }

    public List<Oferta> getLista() {
        return lista;
    }

    public void setLista(List<Oferta> lista) {
        this.lista = lista;
    }
    

   
    
}
