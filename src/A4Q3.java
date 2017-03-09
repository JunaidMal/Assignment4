
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates new scanner called input
       Scanner input = new Scanner(System.in);
       
       // prints instructions
       System.out.println("Please enter in 4 numbers on separate lines:");
       
       // scans next 4 numbers entered and stores them as numb1 - numb4
       double numb1 = input.nextDouble();
       double numb2 = input.nextDouble();
       double numb3 = input.nextDouble();
       double numb4 = input.nextDouble();
       
       // prints numbers with statement
       System.out.println("Your numbers were " + numb1 + ", " + numb2 + ", " + numb3 + ", and " + numb4);
       
       
       
       
       
    }
}
