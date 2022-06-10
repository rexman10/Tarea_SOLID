
package modelo;

public interface Pago {
    //Metodo para realizar el cobro
    public void realizarCobro(double monto);
    public void calcularImpuestosFactura();
    public void generarFactura();
    //Este metodo debera ser implementado por las clases que implementen esta interfaz
    //cada una como le sea conveniente
    
}
