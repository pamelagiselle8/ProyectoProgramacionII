package p2proyecto_pamelaramirez;

import java.util.ArrayList;
import java.util.Date;

public class Cola {

    private ArrayList<Cliente> cola = new ArrayList();
    private ArrayList<Cliente> normal = new ArrayList();
    private ArrayList<Cliente> preferencial = new ArrayList();
    private ArrayList<Cita> citasEnCola = new ArrayList();

    public Cola() {

    }

    // Metodos de administracion
    public void actualizarCola() {
        cola = new ArrayList();
        if (!citasEnCola.isEmpty()) {
            for (Cita cita : citasEnCola) {
                cola.add(cita);
            }
        }
        if (!preferencial.isEmpty()) {
            for (Cliente cliente : preferencial) {
                cola.add(cliente);
            }
        }
        if (!normal.isEmpty()) {
            for (Cliente cliente : normal) {
                cola.add(cliente);
            }
        }
    }

    public void addNormal(Cliente cliente) {
        normal.add(cliente);
        actualizarCola();
    }

    public void addPreferencial(Cliente cliente) {
        preferencial.add(cliente);
        actualizarCola();
    }

    public void addCita(Cita cita) {
        citasEnCola.add(cita);
        actualizarCola();
    }

    // Getters y setters
    public ArrayList<Cliente> getCola() {
        return cola;
    }

    public void setCola(ArrayList<Cliente> cola) {
        this.cola = cola;
    }

    public ArrayList<Cliente> getNormal() {
        return normal;
    }

    public void setNormal(ArrayList<Cliente> normal) {
        this.normal = normal;
    }

    public ArrayList<Cliente> getPreferencial() {
        return preferencial;
    }

    public void setPreferencial(ArrayList<Cliente> preferencial) {
        this.preferencial = preferencial;
    }

}
