
package p2proyecto_pamelaramirez;


public class Transaccion {
    private String tipo;
    private int tiempo;

    public Transaccion(String tipo, int tiempo) {
        this.tipo = tipo;
        this.tiempo = tiempo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return tipo;
    }
    
    
}
