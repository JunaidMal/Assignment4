
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // new scanner called input
         Scanner input = new Scanner(System.in);
         // prints greeting message
         System.out.println("Please enter your name");
         // stores response from user as "name"
         String name = input.nextLine();
         
         // prints response "Hello (name). How are you today?"
         System.out.println("Hello " + name + ". How are you today?");
    }
}
