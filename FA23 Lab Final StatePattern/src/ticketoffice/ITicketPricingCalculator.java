/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketoffice;

/**
 *
 * @author MUBASHIR AHMED
 */
class ITicketPricingCalculator implements ITicketPricingStrategy {

    public int CalculateTicketPrice(int age) {
        if (age < 16) {
            return 10;
        } else if (age >= 65) {
            return 12;
        } else {
            return 15;
        }
    }
}