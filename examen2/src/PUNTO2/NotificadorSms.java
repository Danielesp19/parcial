/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PUNTO2;

/**
 *
 * @author Usuario
 */
public class NotificadorSms implements INotificable{

    @Override
    public void notificar() {
        System.out.println("sms: se modifico la base de datos");
    }
    
}
