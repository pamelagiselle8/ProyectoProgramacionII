
package p2proyecto_pamelaramirez;

import java.util.*;


public class Local {
    private int id;
    private String nombre, latitud, longitud;
    private Gerente gerente;
    private ArrayList <Area> areas = new ArrayList();
    
    public Local(int id, String nombre, String latitud, String longitud) {
        this.id = id;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }
    
    public Local(String nombre, Double latitud, Double longitud) {
        this.nombre = nombre;
        setLatitud(latitud);
        setLongitud(longitud);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = String.valueOf(latitud);
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = String.valueOf(longitud);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
