
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
        //calcula losimpuestos asociados a la compra
    }

    @Override
    public void generarFactura() {
        //genera una nueva factura
    }  
}
