/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketoffice;

/**
 *
 * @author MUBASHIR AHMED
 */
public class TicketOffice {
    private ITicketPricingStrategy _ticketPricingStrategy;
    private SaleTaxCalculator _saleTaxCalculator;

    public TicketOffice(ITicketPricingStrategy ticketPricingStrategy, SaleTaxCalculator saleTaxCalculator) {
        _ticketPricingStrategy = ticketPricingStrategy;
        _saleTaxCalculator = saleTaxCalculator;
    }

    public int CalculateTotalTicketPrice(int age, int taxRate) {
        var ticketPrice = _ticketPricingStrategy.CalculateTicketPrice(age);
        var saleTax = _saleTaxCalculator.CalculateSaleTax(ticketPrice, taxRate);
        return ticketPrice + saleTax;
    }
}
