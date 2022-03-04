
package p2proyecto_pamelaramirez;


public class Excepcion extends Exception {

    public Excepcion(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
    
}
