/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUBASHIR AHMED
 */
public class Loan {

    private double limit;
    private double interestRate; // New field for interest rate

    public Loan(double limit, double interestRate) {
        this.limit = limit;
        this.interestRate = interestRate;
    }

    public double getInterestBasedLimit() {
        return limit + (limit * interestRate / 100); // Calculate interest-based limit
    }

    // Other methods for the loan class
}

