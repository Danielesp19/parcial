/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PUNTO2;

/**
 *
 * @author Usuario
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Notificador n = new Notificador();
        INotificable notificacion= new NotificarWhatsaap();
        INotificable notificacion2= new NotificadorSms();
        n.enviarNotificacion(notificacion);
        n.enviarNotificacion(notificacion2);
        
        GestorBaseDeDatos g=new GestorBaseDeDatos();
        g.insertarTarea();
        g.leerTarea();
    }
    
}
