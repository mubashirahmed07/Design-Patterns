/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

/**
 *
 * @author MUBASHIR AHMED
 */


public class ConcreteColleague2 extends BaseComponent {
    public void doOperationC() {
        System.out.println("Colleague 2 performed operation C.");
    }

    public void doOperationD() {
        System.out.println("Colleague 2 performed operation D.");
        mediator.operationD();
    }
}
