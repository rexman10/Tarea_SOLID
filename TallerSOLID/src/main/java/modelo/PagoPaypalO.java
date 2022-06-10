
package modelo;

public class PagoPaypalO extends PagoO{
    private boolean loggedIn;   //Conexion a cuenta PayPal
    
    @Override
    public void realizarCobro(double monto){
        if(!loggedIn)
            return;
        
        //Carga el monto de la compra al medio de pago
    }

    
    
}
