package Pojos;
// Generated 10-25-2015 09:33:01 PM by Hibernate Tools 4.3.1



/**
 * Administrador generated by hbm2java
 */
public class Administrador  implements java.io.Serializable {


     private String idAdmin;
     private String nombre;
     private String apellido;
     private String correo;

    public Administrador() {
    }

	
    public Administrador(String idAdmin) {
        this.idAdmin = idAdmin;
    }
    public Administrador(String idAdmin, String nombre, String apellido, String correo) {
       this.idAdmin = idAdmin;
       this.nombre = nombre;
       this.apellido = apellido;
       this.correo = correo;
    }
   
    public String getIdAdmin() {
        return this.idAdmin;
    }
    
    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }




}


