
package p2proyecto_pamelaramirez;

import java.util.*;


public class Area {
    private String nombre;
    private ArrayList <Transaccion> transacciones = new ArrayList();
    private ArrayList <Empleado> empleados = new ArrayList();
    private ArrayList <Cita> citasAgendadas = new ArrayList();
    private Cola cola = new Cola();

    public Area(String nombre) {
        this.nombre = nombre;
    }
    
    public Area(String nombre, ArrayList <Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Cita> getCitasAgendadas() {
        return citasAgendadas;
    }

    public void setCitasAgendadas(ArrayList<Cita> citasAgendadas) {
        this.citasAgendadas = citasAgendadas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
