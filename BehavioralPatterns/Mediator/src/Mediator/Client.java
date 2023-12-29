/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

/**
 *
 * @author MUBASHIR AHMED
 */
public class Client {
    public static void main(String[] args) {
        ConcreteColleague2 objColleague2 = new ConcreteColleague2();
        ConcreteColleague3 objColleague3 = new ConcreteColleague3(new ConcreteMediator());

        Mediator objMediator = new ConcreteMediator();
        objMediator.addColleague(objColleague2);

        objMediator.operationA();
        objMediator.operationD();

        objColleague3.doOperationAll();
    }
}
