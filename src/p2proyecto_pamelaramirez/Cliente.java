
package p2proyecto_pamelaramirez;

import java.time.LocalDateTime;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class Cliente {
    private String id;
    private int edad, ticket, posicion, tiempo;
    private boolean preferencial;

    public Cliente(String id, int ticket, int posicion, int tiempo, boolean preferencial) {
        this.id = id;
        setEdad(id);
        this.ticket = ticket;
        this.posicion = posicion;
        this.tiempo = tiempo;
        this.preferencial = preferencial;
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
        // StringTokenizer token = new StringTokenizer(id, "-");
        // int anio = Integer.parseInt(identidad[1]);
        try {
            String[] identidad = id.split("-");
            this.edad = LocalDateTime.now().getYear() - Integer.parseInt(identidad[1]);
        } catch (Exception e) {
            
        }
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }
    
}
