
package p2proyecto_pamelaramirez;


public class Usuario {
    protected String nombre, id, nombreUsuario, pass;
    
    public Usuario(String nombre, String id, String nombreUsuario, String pass) {
        this.nombre = nombre;
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "Usuario{" + "nombre=" + nombre + ", id=" + id + '}';
    }
    
}
