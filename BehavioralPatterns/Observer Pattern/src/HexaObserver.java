/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUBASHIR AHMED
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
