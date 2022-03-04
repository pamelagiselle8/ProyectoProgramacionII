
package p2proyecto_pamelaramirez;

import java.util.*;


public class Local {
    private String nombre;
    private double latitud, longitud;
    private Gerente gerente;
    private ArrayList <Empleado> empleados = new ArrayList();
    private ArrayList <Area> areas = new ArrayList();

    public Local(String nombre, String latitud, String longitud, Gerente gerente) {
        this.nombre = nombre;
        setLatitud(latitud);
        setLongitud(longitud);
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        try{
            if (Integer.parseInt(latitud) > -90 && Integer.parseInt(latitud) < 90) {
                this.latitud = Integer.parseInt(latitud);
            }
            else{
                throw new Excepcion("Comprueba que el primer número de la coordenada de latitud sea un valor comprendido entre -90 y 90.");
            }
        }
        catch (Exception e) {
            new Excepcion("Error de parseo (1)");
        }
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        try{
            if (Integer.parseInt(longitud) > -180 && Integer.parseInt(longitud) < 180) {
                this.longitud = Integer.parseInt(longitud);
            }
            else{
                throw new Excepcion("Comprueba que el primer número de la coordenada de longitud sea un valor comprendido entre -180 y 180.");
            }
        }
        catch (Exception e) {
            new Excepcion("Error de parseo (2)");
        }
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Local{" + "nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + ", gerente=" + gerente + ", empleados=" + empleados + '}';
    }
    
}
