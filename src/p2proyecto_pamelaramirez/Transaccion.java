package p2proyecto_pamelaramirez;

public class Transaccion {

    private String tipo;
    private int id, tiempo, idTran;

    public Transaccion(int id, String tipo, int tiempo) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTran() {
        return idTran;
    }

    public void setIdTran(int idTran) {
        this.idTran = idTran;
    }

    @Override
    public String toString() {
        return tipo;
    }

}
