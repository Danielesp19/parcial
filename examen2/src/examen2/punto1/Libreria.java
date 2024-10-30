/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2.punto1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Libreria {
    List<Libro> libros= new ArrayList();

    public Libreria() {
        libros.add(new Libro("libro1", "yo", "2024", 1.40));
        libros.add(new Libro("libro2", "yo", "2024", 2.40));
        libros.add(new Libro("libro3", "yo", "2024", 3.40));
    }
    
    public void añadir(String titulo,String autor,String fecha, double precio){
        Libro l=new Libro(titulo,autor,fecha,precio);
        libros.add(l);
    }
    
    public void buscarAutor(String autor){
        for(Libro l:libros ){
            if (l.getAutor().equals(autor))
                System.out.println("se encontro el libro del autor" + l.getAutor());
        }
    }
    public void buscarnombre(String nombre){
        for(Libro l:libros ){
            if (l.getTitulo().equals(nombre))
                System.out.println("se encontro el libro " + l.getTitulo());
        }
        
    }
    public void buscarprecio(double precioMin, double precioMax){
        System.out.println("libros disponibles: ");
        for(Libro l:libros ){
            if (l.getPrecio()>precioMin && l.getPrecio()<precioMax)
                System.out.println("libro "+ l.getTitulo()+"con un precio de " + l.getPrecio());
        }
    }
    
}
