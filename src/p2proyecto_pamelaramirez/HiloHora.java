
package p2proyecto_pamelaramirez;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;


public class HiloHora extends Thread {
    private JLabel lblHora;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss"); // El formato es HH:mm:ss
    private String hora = formato.format(LocalDateTime.now());

    public HiloHora(JLabel lblHora) {
        this.lblHora = lblHora;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                lblHora.setText("Hora: " + formato.format(LocalDateTime.now()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
