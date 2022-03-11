
package p2proyecto_pamelaramirez;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class Cliente {
    protected String id, ticket;
    protected int edad, posicion, espera;
    protected boolean preferencial;
    protected Date fechaCreada;
    protected ArrayList <Transaccion> transacciones = new ArrayList();
    protected SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Cliente(String id, boolean preferencial,
                    Date fechaCreada, ArrayList<Transaccion> transacciones) {
        this.id = id;
        this.preferencial = preferencial;
        setEdad(id);
        this.fechaCreada = fechaCreada;
        this.transacciones = transacciones;
        setTicket();
    }

    public Cliente(String id, int posicion, int espera, boolean preferencial,
            Date fechaCreada, ArrayList<Transaccion> transacciones) {
        this.id = id;
        this.preferencial = preferencial;
        setEdad(id);
        this.posicion = posicion;
        this.espera = espera;
        this.fechaCreada = fechaCreada;
        this.transacciones = transacciones;
        setTicket();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket() {
        this.ticket = "Identidad: " + id + "\nEdad: " + edad;
        if (preferencial) {
            this.ticket += "\n*Cliente preferencial";
        }
        this.ticket += "\nFecha registro: " + sdf.format(fechaCreada) + "\nTiempo de espera estimado: " + espera + " minutos"
                + "\nPosición en la fila: " + posicion + "\nTransacciones a realizar: ";
        int cont = 1;
        for (Transaccion tran : transacciones) {
            this.ticket += "\n" + cont + ". " + tran;
            cont++;
        }
    }
    
    public void setTicket(Local local, Area area) {
        this.ticket = "Identidad: " + id;
        if (preferencial) {
            this.ticket += "\n * Cliente preferencial";
        }
        this.ticket += "\nLocal: " + local + "\nArea: " + area + "\nFecha registro: " + sdf.format(fechaCreada)
                + "\nTiempo de espera estimado: " + espera + " minutos"
                + "\nPosición en la fila: " + posicion + "\nTransacciones a realizar: ";
        int cont = 1;
        for (Transaccion tran : transacciones) {
            this.ticket += "\n" + cont + ". " + tran;
            cont++;
        }
    }

    public Date getFechaCreada() {
        return fechaCreada;
    }

    public void setFechaCreada(Date fechaCreada) {
        this.fechaCreada = fechaCreada;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
    
    
}
