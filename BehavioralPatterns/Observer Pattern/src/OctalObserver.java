/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUBASHIR AHMED
 */

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
