/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

/**
 *
 * @author MUBASHIR AHMED
 */
import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<BaseComponent> colleagues = new ArrayList<>();

    @Override
    public void operationA() {
        System.out.println("Mediator knows that operation A can be done by Colleague 1.");
        for (BaseComponent colleague : colleagues) {
            colleague.setMediator(this);
        }
    }

    @Override
    public void operationD() {
        System.out.println("Mediator knows that operation D can be done by Colleagues 2 and 3.");
        for (BaseComponent colleague : colleagues) {
            colleague.setMediator(this);
        }
    }

    @Override
    public void addColleague(BaseComponent colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void removeColleague(BaseComponent colleague) {
        colleagues.remove(colleague);
    }
}

