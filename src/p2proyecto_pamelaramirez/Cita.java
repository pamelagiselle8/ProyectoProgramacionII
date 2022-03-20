
package p2proyecto_pamelaramirez;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Cita extends Cliente {
    private String fechaAgendada, hora;

    public Cita(Date fechaAgendada, String hora, String identidad,
            String nombre, int notis, String correo, String telefono,
            Local local, Area area, String ticket, int posicion, int espera,
            Date fechaRegistro, int preferencial, ArrayList<Transaccion> transacciones) {
        super(identidad, nombre, notis, correo, telefono, local, area, ticket, posicion,
                espera, fechaRegistro, preferencial, transacciones);
        this.hora = hora;
        // Setter validado
        setFechaAgendada(fechaAgendada);
    }

    public String getFechaAgendada() {
        return fechaAgendada;
    }

    public void setFechaAgendada(Date fechaAgendada) {
        this.fechaAgendada = sdf.format(fechaAgendada);
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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
                + "\nFecha agendada: " + fechaAgendada
                + "\nHora: " + hora
                + "\nTransacciones a realizar: ";
        int cont = 1;
        for (Transaccion tran : transacciones) {
            this.ticket += "\n" + cont + ". " + tran;
            cont++;
        }
    }
    
}
