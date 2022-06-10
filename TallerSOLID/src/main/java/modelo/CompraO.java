
package modelo;

import java.util.List;

public class CompraO {
    private PagoO pago;
    private PagoPaypalO pagoPaypal;
    private List articulos;
    
    public CompraO(PagoO pago){
        this.pago = pago;
    }
    
    
    public CompraO(PagoPaypalO pagoPaypal){
        this.pagoPaypal = pagoPaypal;
    }
    
    
    public void agregarArticulo(ArticuloO articulo){
        //agg articulo a la compra
    }
    
    public void removerArticulo(ArticuloO articulo){
        //remover articulo de la compra
    }
    
    
}
