/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto4;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculador c = new Calculador();
        ICalculable col= new ImpuestoColombiaImpl();
        ICalculable eeuu= new ImpuentoEeuuImpl();
        ICalculable fran= new ImpluestosFranciaImpl();
        
        c.calcularImpuesto(col);
        c.calcularImpuesto(eeuu);
        c.calcularImpuesto(fran);
    }
    
}
