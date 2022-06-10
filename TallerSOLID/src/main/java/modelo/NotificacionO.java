
package modelo;

public class NotificacionO {
    private int tipoNotificacion;
    public void notificar(PagoO pago){
        if(tipoNotificacion==1){
            //enviarEmail();
            
        }else{
            //enviarSMS();
        }
    }
    
}
