
package p2proyecto_pamelaramirez;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class Cliente {
    protected String nombre, correo, identidad, ticket, telefono, fechaRegistro;
    protected int edad, posicion, espera;
    protected boolean preferencial, notis;
    protected ArrayList <Transaccion> transacciones = new ArrayList();
    protected SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Cliente(String identidad, String nombre, int notis,
            String correo, String telefono, Local local, Area area, 
            String ticket, int posicion, int espera, Date fechaRegistro,
            int preferencial, ArrayList <Transaccion> transacciones) {
        this.nombre = nombre;
        this.correo = correo;
        this.identidad = identidad;
        this.ticket = ticket;
        this.espera = espera;
        this.transacciones = transacciones;
        // Setters validados
        setNotis(notis);
        if (this.notis) {
            this.telefono = telefono;
            this.posicion = posicion;
        }
        setPreferencial(preferencial);
        setFechaRegistro(fechaRegistro);
        setEdad(identidad);
        setTicket(local, area);
    }
    
    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(String id) {
        try {
            String[] identidad = id.split("-");
            this.edad = LocalDateTime.now().getYear() - Integer.parseInt(identidad[1]);
            if (edad > 60) {
                preferencial = true;
            }
        } catch (Exception e) {
            
        }
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getEspera() {
        return espera;
    }

    public void setEspera(int espera) {
        this.espera = espera;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(int preferencial) {
        if (preferencial == 1) {
            this.preferencial = true;
        }
        else {
            this.preferencial = false;
        }
    }

    public String getTicket() {
        return ticket;
    }
    
    public void setTicket(Local local, Area area) {
        this.ticket = "Identidad: " + identidad;
        if (preferencial) {
            this.ticket += "\n * Cliente preferencial";
        }
        this.ticket += "\nLocal: " + local
                + "\nArea: " + area
                + "\nFecha registro: " + fechaRegistro
                + "\nTiempo de espera estimado: "+ espera + " minutos"
                + "\nPosición en la fila: " + posicion
                + "\nTransacciones a realizar: ";
        int cont = 1;
        for (Transaccion tran : transacciones) {
            this.ticket += "\n" + cont + ". " + tran;
            cont++;
        }
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = sdf.format(fechaRegistro);
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isNotis() {
        return notis;
    }

    public void setNotis(int notis) {
        if (notis == 1) {
            this.notis = true;
        }
        else {
            this.notis = false;
        }
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }
    
    
}
