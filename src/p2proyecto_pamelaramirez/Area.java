
package p2proyecto_pamelaramirez;

import java.util.*;


public class Area {
    private String nombre;
    private ArrayList <Transaccion> transacciones = new ArrayList();
    private ArrayList <Empleado> empleados = new ArrayList();
    private ArrayList <Cliente> cola = new ArrayList();
    private ArrayList <Cita> citas = new ArrayList();
    
    public Area(String nombre, ArrayList <Transaccion> transacciones, ArrayList <Empleado> empleados) {
        this.nombre = nombre;
        this.transacciones = transacciones;
        this.empleados = empleados;
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

    public ArrayList<Cliente> getCola() {
        return cola;
    }

    public void setCola(ArrayList<Cliente> cola) {
        this.cola = cola;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
