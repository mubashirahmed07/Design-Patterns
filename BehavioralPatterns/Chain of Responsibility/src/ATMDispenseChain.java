import java.util.Scanner;

import java.util.Scanner;

public class Currency {
    private int amount;

    public Currency(int amt) {
        this.amount = amt;
    }

    public int getAmount() {
        return this.amount;
    }
}

interface CalculatorHandler {
    void setNextHandler(CalculatorHandler nextHandler);

    int compute(int a, int b);
}

class Adder implements CalculatorHandler {
    private CalculatorHandler nextHandler;

    @Override
    public void setNextHandler(CalculatorHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public int compute(int a, int b) {
        if (nextHandler != null) {
            return a + b;
        } else {
            return nextHandler.compute(a, b);
        }
    }
}

class Subtractor implements CalculatorHandler {
    private CalculatorHandler nextHandler;

    @Override
    public void setNextHandler(CalculatorHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public int compute(int a, int b) {
        if (nextHandler != null) {
            return a - b;
        } else {
            return nextHandler.compute(a, b);
        }
    }
}

class Multiplier implements CalculatorHandler {
    private CalculatorHandler nextHandler;

    @Override
    public void setNextHandler(CalculatorHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public int compute(int a, int b) {
        if (nextHandler != null) {
            return a * b;
        } else {
            return nextHandler.compute(a, b);
        }
    }
}

class Divider implements CalculatorHandler {
    private CalculatorHandler nextHandler;

    @Override
    public void setNextHandler(CalculatorHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public int compute(int a, int b) {
        if (nextHandler != null) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Cannot divide by zero.");
                return 0;
            }
        } else {
            return nextHandler.compute(a, b);
        }
    }
}

public class ATMDispenseChain {
    private CalculatorHandler calculatorChain;

    public ATMDispenseChain() {
        // initialize the chain of responsibility for calculator
        CalculatorHandler adder = new Adder();
        CalculatorHandler subtractor = new Subtractor();
        CalculatorHandler multiplier = new Multiplier();
        CalculatorHandler divider = new Divider();

        // set the chain of responsibility
        adder.setNextHandler(subtractor);
        subtractor.setNextHandler(multiplier);
        multiplier.setNextHandler(divider);

        this.calculatorChain = adder;
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();

        // perform some calculator operations
        int result = atmDispenser.calculatorChain.compute(10, 5);
        System.out.println("Calculator Result: " + result);

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            // For demonstration purposes, just printing the computed result
            System.out.println("Dispensing " + atmDispenser.calculatorChain.compute(amount, 10) + " notes");
        }
    }
}
