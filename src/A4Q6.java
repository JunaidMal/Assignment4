
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // new scanner called input
        Scanner input = new Scanner(System.in);

        // asks for the speed limit, stores it as "limit"
        System.out.println("Enter the speed limit:");
        double limit = input.nextDouble();

        // asks for recorded speed, stores it as "record"
        System.out.println("Enter the recorded speed of the car:");
        double record = input.nextDouble();

        // if the recorded speed is less than the limit, outputs message saying you are within the limit
        if (record < limit) {
            System.out.println("Congratulations, you are within the speed limit!");
        } // if the recorded speed is more than the limit, the following if statements are taken into consideration
        else if (record > limit) {
            // if the recorded speed is 1 to 21 km/h over the limit, tells you that you're speeding and fined $100
            if (record <= limit + 20) {
                System.out.println("You are speeding and your fine is $100.");
            } // if the recorded speed is more than 31 km/h over the limit, tells you that you're speeding and fined $500
            else if (record >= limit + 31) {
                System.out.println("You are speeding and your fine is $500.");
            } else {
                // if neither are registered then the speed over the limit would be between 21 and 30, then outputs message that tells you that you're speeding and fined $270
                System.out.println("You are speeding and your fine is $270.");
            }
        }






    }
}
