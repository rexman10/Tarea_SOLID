/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author FxFF
 */
public interface Pagable {
        public void realizarCobro();
        public void calcularImpuestosFactura();
        public void generarFactura();
    
}
