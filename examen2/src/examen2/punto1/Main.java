/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2.punto1;

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
        Orden or= new Orden();
        System.out.println("total con sin  "+or.calcularTotal(1100, 0));
        System.out.println("total con secuento  "+or.calcularTotal(1100, 500));
        
        
        System.out.println("-----------------");
        Libreria libreria= new Libreria();
        libreria.añadir("el principito", "cualquiera", "2024", 1000);
        libreria.buscarAutor("cualquiera");
        libreria.buscarAutor("lfddfofdl");
        
        libreria.buscarnombre("el principito");
        libreria.buscarnombre("asdasdsa");
        
        libreria.buscarprecio(2, 10000);
    }
    
}
