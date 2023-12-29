/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ticketoffice;

/**
 *
 * @author MUBASHIR AHMED
 */
public class Main {
    public static void main(String[] args) {
   
        ITicketPricingStrategy pricingStrategy = new ITicketPricingCalculator();
        SaleTaxCalculator saleTaxCalculator = new SaleTaxCalculator();

      
        TicketOffice ticketOffice = new TicketOffice(pricingStrategy, saleTaxCalculator);

        int childAge = 12;
        int adultAge = 25;
        int seniorAge = 70;

        int taxRate = 2;

        int childTicketPrice = ticketOffice.CalculateTotalTicketPrice(childAge, taxRate);
        int adultTicketPrice = ticketOffice.CalculateTotalTicketPrice(adultAge, taxRate);
        int seniorTicketPrice = ticketOffice.CalculateTotalTicketPrice(seniorAge, taxRate);

        System.out.println("Child Ticket Price: $" + childTicketPrice);
        System.out.println("Adult Ticket Price: $" + adultTicketPrice);
        System.out.println("Senior Ticket Price: $" + seniorTicketPrice);
    }
}
