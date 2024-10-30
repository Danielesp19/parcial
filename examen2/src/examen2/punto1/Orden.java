/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2.punto1;

/**
 *
 * @author Usuario
 */
public class Orden {
    private static double IMPUESTO=0.1;
    private int descuento=0;
    
    public double calcularTotal(int precio, int descuento){
        double compra= precio-descuento;
        double total= compra+compra*IMPUESTO;
        
        return total;
    }
}
