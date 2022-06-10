/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Det-Pc
 */
public class CompraNew {
    private Pago pago;
    private PagoPayPalNew pagoPaypal;
    private List articulos;
    
    public CompraNew(Pago pago){
        this.pago = pago;
    }
    
    
    public CompraNew(PagoPayPalNew pagoPaypal){
        this.pagoPaypal = pagoPaypal;
    }
    
    
    public void agregarArticulo(ArticuloO articulo){
        //agg articulo a la compra
    }
    
    public void removerArticulo(ArticuloO articulo){
        //remover articulo de la compra
    }   
}
