
package p2proyecto_pamelaramirez;


public class Usuario {
    protected String nombre, identidad, nombreUsuario, pass;
    
    public Usuario(String id, String nombre, String nombreUsuario, String pass) {
        this.nombre = nombre;
        this.identidad = id;
        this.nombreUsuario = nombreUsuario;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return nombreUsuario;
    }
    
}
