
package p2proyecto_pamelaramirez;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Ventanilla extends Thread {
    private boolean ciclo, abierta;
    private CNormal cliente;
    
    @Override
    public void run(){
        while(ciclo){
            if(abierta){
                for (Transaccion tran : cliente.getTransacciones()) {
                    try {
                        Thread.sleep(tran.getTiempo() * 1000);
                    } catch (InterruptedException ex) {
                        
                    }
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
    }
}
