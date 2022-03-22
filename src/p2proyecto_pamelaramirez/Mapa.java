

package p2proyecto_pamelaramirez;

import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Mapa {
    // Latitud -90 a 90
    // Longitud -180 a 180
    
    public static void coordenadas(String latitud, String longitud, String local) {
        Engine engine = Engine.newInstance(
        EngineOptions.newBuilder(HARDWARE_ACCELERATED)
                .licenseKey("6P830J66YBJTILINDYTPJQC6PJ3YF3UK1AFIVUWED3OD37VP3YPFAS6S3D9M818BVU46")
                .build());
        Browser browser = engine.newBrowser();

        SwingUtilities.invokeLater(() -> {
            BrowserView view = BrowserView.newInstance(browser);
            // Creating and displaying Swing app frame.
            JFrame frame = new JFrame("Ubicacion del local (" + local + ")");
            // Close Engine and onClose app window
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    engine.close();
                }
            });
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            // JTextField addressBar = new JTextField("https://maps.google.com/?q=" + latitud + "," + longitud);
            // addressBar.addActionListener(e ->
                    // browser.navigation().loadUrl(addressBar.getText()));
            // frame.add(addressBar, BorderLayout.NORTH);
            frame.add(view, BorderLayout.CENTER);
            frame.setSize(900, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            browser.navigation().loadUrl("https://maps.google.com/?q=" + latitud + "," + longitud);
            
        });
    }
}
