
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner called input
        Scanner input = new Scanner(System.in);
        
        // asks for food cost, stores it as food
        System.out.println("How much does the food for prom cost? :");
        double food = input.nextDouble();
        
        // asks for DJ cost, stores it as dj
        System.out.println("How much does the DJ cost? :");
        double dj = input.nextDouble();
        
        // asks for hall cost, stores it as hall
        System.out.println("How much does it cost to rent the hall? :");
        double hall = input.nextDouble();
        
        // asks for decoration cost, stores it as decor
        System.out.println("How much does decorations cost? :");
        double decor = input.nextDouble();
        
        // asks for staff cost, stores it as staff
        System.out.println("How much does it cost for staff? :");
        double staff = input.nextDouble();
        
        // asks for miscellaneous cost, stores it as misc
        System.out.println("How much for miscellaneous costs? :");
        double misc = input.nextDouble();
        
        // adds all the cost up and stores it as total
        double total = food + dj + hall + decor + staff + misc;
        
        // divides 35 from total to find tickets needed to break even
        double tickets = total / 35;
        // rounds up tickets needed because you can't sell a part of a ticket
        tickets = Math.ceil(tickets);
        
        // prints final message giving total cost and tickets needed to break even
        System.out.println("The total cost is $" + total + " You will need to sell " + tickets + " tickets to break even.");
        
        
        
        
        
        
    }
}
