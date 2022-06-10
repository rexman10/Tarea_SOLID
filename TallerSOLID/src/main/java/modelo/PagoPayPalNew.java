
package modelo;

public class PagoPayPalNew implements Pago{
    private boolean loggedIn;   //Conexion a cuenta PayPal
    
    @Override
    public void realizarCobro(double monto){
        if(!loggedIn)
            return;
        
        //Carga el monto de la compra al medio de pago
    }

    @Override
    public void calcularImpuestosFactura() {
        //Metodo que calcula el impuesto a pagar
    }

    @Override
    public void generarFactura() {
        //Metodo que genera una factura
    }
}
