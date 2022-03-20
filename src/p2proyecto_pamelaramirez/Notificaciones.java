
package p2proyecto_pamelaramirez;

import com.twilio.Twilio;
import com.twilio.exception.ApiException;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import com.twilio.exception.AuthenticationException;

public class Notificaciones {
    private static final String ACCOUNT_SID = "AC9104250939a20e878ab613bb2fc09472";
    private static final String AUTH_TOKEN = "e6f72f57ad6ae7e1cffc34fcd2ec43a0";
    
    public void enviarNotificacion(String mensaje, String numero) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        try {
            Message message = Message.creator(new PhoneNumber("+504" + numero),
                    new PhoneNumber("+13257503571"),
                    mensaje).create();
            System.out.println(message.getSid());
        } catch (ApiException e) {
            
        }
    }
}
