
package p2proyecto_pamelaramirez;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class HiloCola extends Thread {
    private JProgressBar pb;
    private DatosSistema ds = new DatosSistema();
    private boolean ventanilla, atendiendo;

    public HiloCola(JProgressBar pb, Area area) {
        this.pb = pb;
        // this.pb.setValue();
    }
    
    public void metodo() {
        
    }

    @Override
    public void run() {
        while (ventanilla) {
            if (atendiendo) {
                if (pb.getValue() < pb.getMaximum()) {
                    pb.setValue(pb.getValue() + 1);
                }
                else {
                    atendiendo = false;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
