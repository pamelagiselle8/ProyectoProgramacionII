
package p2proyecto_pamelaramirez;

import java.util.*;


public class Area {
    private String nombre;
    private ArrayList <Transaccion> transacciones = new ArrayList();
    private ArrayList <Empleado> empleados = new ArrayList();
    
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

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
