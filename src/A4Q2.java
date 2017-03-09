
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // creates scanner called input
        Scanner input = new Scanner(System.in);
        
        // prints instructions
        System.out.println("Please input measurement in inches");
        
        // takes measurement taken and stores it as "inches"
        double inches = input.nextDouble();
        
        // multiplies inches by the multiplying factor of 2.54 to convert to cm
        double cm = inches * 2.54;
        
        // prints answer with "cm" at the end
        System.out.println(cm + " cm");
        
        
        
     
        
        
        
    }
}
