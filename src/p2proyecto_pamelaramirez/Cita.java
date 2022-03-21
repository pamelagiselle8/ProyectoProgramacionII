package p2proyecto_pamelaramirez;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Cita {

    private String nombre, correo, identidad, ticket, telefono,
            fechaRegistro, fechaAgendada, hora;
    private int id, edad;
    private boolean notis, preferencial;
    private ArrayList<Transaccion> transacciones = new ArrayList();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // BD Constructor basico 
    public Cita(int id, String identidad, String nombre, boolean preferencial, boolean notis,
            String fechaRegistro, String fechaAgendada, String hora, Local local, Area area) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.fechaRegistro = fechaRegistro;
        this.fechaAgendada = fechaAgendada;
        this.hora = hora;
        this.id = id;
        this.notis = notis;
        this.preferencial = preferencial;
        setEdad();
        setTicket(local, area);
    }

    // BD Constructor info personal para notificaciones
    public Cita(int id, String identidad, String nombre, boolean preferencial, boolean notis,
            String correo, String telefono, String fechaRegistro, String fechaAgendada, String hora,
            Local local, Area area) {
        this.nombre = nombre;
        this.correo = correo;
        this.identidad = identidad;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
        this.fechaAgendada = fechaAgendada;
        this.hora = hora;
        this.id = id;
        this.notis = notis;
        this.preferencial = preferencial;
        setEdad();
        setTicket(local, area);
    }

    // GUI Constructor basico
    public Cita(int id, String identidad, String nombre, boolean preferencial, boolean notis,
            Date fechaRegistro, Date fechaAgendada, String hora,
            ArrayList<Transaccion> transacciones, Local local, Area area) {
        this.nombre = nombre;
        this.correo = correo;
        this.identidad = identidad;
        this.telefono = telefono;
        setFechaRegistro(fechaRegistro);
        setFechaAgendada(fechaAgendada);
        this.hora = hora;
        this.id = id;
        this.notis = notis;
        this.preferencial = preferencial;
        setEdad();
        setTicket(local, area);
    }

    // GUI Constructor info personal para notificaciones
    public Cita(int id, String identidad, String nombre, boolean preferencial, boolean notis,
            String correo, String telefono, Date fechaRegistro, Date fechaAgendada, String hora,
            ArrayList<Transaccion> transacciones, Local local, Area area) {
        this.nombre = nombre;
        this.correo = correo;
        this.identidad = identidad;
        this.telefono = telefono;
        setFechaRegistro(fechaRegistro);
        setFechaAgendada(fechaAgendada);
        this.hora = hora;
        this.id = id;
        this.notis = notis;
        this.preferencial = preferencial;
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
        this.ticket = "Identidad: " + identidad;
        if (preferencial) {
            this.ticket += "\n * Cliente preferencial";
        }
        this.ticket += "\nLocal: " + local
                + "\nArea: " + area
                + "\nFecha registro: " + fechaRegistro
                + "\nFecha agendada: " + fechaAgendada
                + "\nHora: " + hora
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

    public void setFechaAgendada(Date fechaAgendada) {
        this.fechaAgendada = sdf.format(fechaAgendada);
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

    public String getFechaAgendada() {
        return fechaAgendada;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
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
