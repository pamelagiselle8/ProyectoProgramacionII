
package p2proyecto_pamelaramirez;

import java.util.*;


public class Area {
    private int id;
    private String nombre;
    private ArrayList <Transaccion> transacciones = new ArrayList();
    private ArrayList <Empleado> empleados = new ArrayList();
    private ArrayList <Cita> citas = new ArrayList();
    private ArrayList<CNormal> normal = new ArrayList();
    private ArrayList<CPreferencial> preferencial = new ArrayList();

    public Area(int id, String nombre) {
        this.id = id;
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

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<CPreferencial> getPreferencial() {
        return preferencial;
    }

    public void setPreferencial(ArrayList<CPreferencial> preferencial) {
        this.preferencial = preferencial;
    }

    public ArrayList<CNormal> getNormal() {
        return normal;
    }

    public void setNormal(ArrayList<CNormal> normal) {
        this.normal = normal;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
