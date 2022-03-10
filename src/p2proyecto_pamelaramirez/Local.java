
package p2proyecto_pamelaramirez;

import java.util.*;


public class Local {
    private String nombre;
    private double latitud, longitud;
    private Gerente gerente;
    private ArrayList <Area> areas = new ArrayList();
    
    public Local(String nombre, double latitud, double longitud) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud= longitud;
    }
    
    public Local(String nombre, double latitud, double longitud, Gerente gerente) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud= longitud;
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
        this.latitud = Double.parseDouble(latitud);
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = Double.parseDouble(longitud);
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<Area> areas) {
        this.areas = areas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
