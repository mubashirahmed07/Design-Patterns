/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUBASHIR AHMED
 */
class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}

class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}

class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}

class WhiteShirtObserver extends Observer {
    public WhiteShirtObserver(Subject subject) {
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        int state = subject.getState();
        if (state > 5) {
            System.out.println("White Shirt Observer: High availability - Special message.");
        } else {
            System.out.println("White Shirt Observer: Low availability - Standard message.");
        }
    }
}
