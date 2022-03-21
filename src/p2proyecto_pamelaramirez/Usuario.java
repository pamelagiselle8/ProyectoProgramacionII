package p2proyecto_pamelaramirez;

public class Usuario {

    protected int id;
    protected String nombre, identidad, nombreUsuario, pass;

    public Usuario(int id, String identidad, String nombre, String nombreUsuario, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.identidad = identidad;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombreUsuario;
    }

}
