/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

/**
 *
 * @author MUBASHIR AHMED
 */
public class ConcreteColleague3 extends BaseComponent {
    public ConcreteColleague3(Mediator mediator) {
        this.mediator = mediator;
        mediator.addColleague(this);
    }

    public void doOperationAll() {
        System.out.println("Colleague 3 performed operations A and D.");
        mediator.operationA();
        mediator.operationD();
    }
}