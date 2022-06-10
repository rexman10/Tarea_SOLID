
package modelo;

public class PagoPaypalO implements Pagable{
    private boolean loggedIn;   //Conexion a cuenta PayPal
    
    public void realizarCobro(double monto){
        if(!loggedIn)
            return;
        
        //Carga el monto de la compra al medio de pago
    }

    @Override
    public void calcularImpuestosFactura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void generarFactura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void realizarCobro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
