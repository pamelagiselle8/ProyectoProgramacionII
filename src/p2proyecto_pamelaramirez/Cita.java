
package p2proyecto_pamelaramirez;

import java.util.ArrayList;
import java.util.Date;


public class Cita extends Cliente {
    private Date fechaAgendada;
    private String hora;

    public Cita(Date fechaAgendada, String hora, String id,
            boolean preferencial, Date fechaCreada, ArrayList<Transaccion> transacciones) {
        super(id, preferencial, fechaCreada, transacciones);
        this.fechaAgendada = fechaAgendada;
        this.hora = hora;
    }

    public Date getFechaAgendada() {
        return fechaAgendada;
    }

    public void setFechaAgendada(Date fechaAgendada) {
        this.fechaAgendada = fechaAgendada;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        ticket = "Identidad: " + id;
        if (preferencial) {
            ticket += "\n*Cliente preferencial";
        }
        ticket += "\nFecha registro: " + sdf.format(fechaCreada)
                + "\nFecha programada: " + fechaAgendada + "\nHora: " + hora
                + "\nTransacciones a realizar: ";
        int cont = 1;
        for (Transaccion tran : transacciones) {
            ticket += "\n" + cont + ". " + tran;
            cont++;
        }
        return ticket;
    }
    
}
