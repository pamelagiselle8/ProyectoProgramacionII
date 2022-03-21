
package p2proyecto_pamelaramirez;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;


public class CNormal {
    private String nombre, correo, identidad, ticket, telefono,
            fechaRegistro;
    private int id, edad;
    private boolean notis;
    private ArrayList<Transaccion> transacciones = new ArrayList();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // BD Constructor basico 
    public CNormal(int id, int posicion, String identidad, String nombre, boolean notis,
            String fechaRegistro, Local local, Area area) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.fechaRegistro = fechaRegistro;
        this.id = id;
        this.notis = notis;
        setEdad();
        setTicket(local, area);
    }

    // BD Constructor info personal para notificaciones
    public CNormal(int id, int posicion, String identidad, String nombre, boolean notis,
            String correo, String telefono, String fechaRegistro, Local local, Area area) {
        this.nombre = nombre;
        this.correo = correo;
        this.identidad = identidad;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
        this.id = id;
        this.notis = notis;
        setEdad();
        setTicket(local, area);
    }

    // GUI Constructor basico
    public CNormal(int id, int posicion, String identidad, String nombre, boolean notis,
            Date fechaRegistro, ArrayList<Transaccion> transacciones, Local local, Area area) {
        this.nombre = nombre;
        this.correo = correo;
        this.identidad = identidad;
        this.telefono = telefono;
        setFechaRegistro(fechaRegistro);
        this.id = id;
        this.notis = notis;
        setEdad();
        setTicket(local, area);
    }

    // GUI Constructor info personal para notificaciones
    public CNormal(int id, int posicion, String identidad, String nombre, boolean notis,
            String correo, String telefono, Date fechaRegistro,
            ArrayList<Transaccion> transacciones, Local local, Area area) {
        this.nombre = nombre;
        this.correo = correo;
        this.identidad = identidad;
        this.telefono = telefono;
        setFechaRegistro(fechaRegistro);
        this.id = id;
        this.notis = notis;
        setEdad();
        setTicket(local, area);
    }

    // Setters validados
    public void setEdad() {
        try {
            String[] token = identidad.split("-");
            this.edad = LocalDateTime.now().getYear() - Integer.parseInt(token[1]);
        } catch (Exception e) {

        }
    }

    public void setTicket(Local local, Area area) {
        this.ticket = "Identidad: " + identidad 
                + "\nNombre: " + nombre
                + "\nEdad: " + edad
                + "\nLocal: " + local
                + "\nArea: " + area
                + "\nFecha registrado: " + fechaRegistro
                + "\nTransacciones a realizar: ";
        int cont = 1;
        for (Transaccion tran : transacciones) {
            this.ticket += "\n" + cont + ". " + tran;
            cont++;
        }
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = sdf.format(fechaRegistro);
    }

    // Getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getTicket() {
        return ticket;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isNotis() {
        return notis;
    }

    public void setNotis(boolean notis) {
        this.notis = notis;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
