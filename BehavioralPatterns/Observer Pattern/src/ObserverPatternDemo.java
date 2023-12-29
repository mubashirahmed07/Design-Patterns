/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUBASHIR AHMED
 */
import java.util.ArrayList;
import java.util.List;

// Subject class
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(this); // Pass the Subject instance to the observer
        }
    }
}

// Observer class
abstract class Observer {
    public abstract void update(Subject subject);
}

// Concrete observer classes
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

// Additional Concrete Observer class
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

// ObserverPatternDemo class
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

        // Adding a WhiteShirtObserver
        new WhiteShirtObserver(subject);

        // Additional state change for demonstration
        System.out.println("Third state change: 3");
        subject.setState(3);
    }
}
