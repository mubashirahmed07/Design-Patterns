/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

/**
 *
 * @author MUBASHIR AHMED
 */


public class BaseComponent {
    protected Mediator mediator;

    public void setMediator(Mediator objMediator) {
        this.mediator = objMediator;
    }
}