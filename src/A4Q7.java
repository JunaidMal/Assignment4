
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner called input
        Scanner input = new Scanner(System.in);
       
        // first square is 1
        int square2 = 1;
        
        // while the player is not on 100, then roll until at 100
        while(square2 < 100) {
            
            // asks to submit roll, stores roll as roll2
            System.out.println("Enter sum of dice:");
            int roll2 = input.nextInt();
            
            // if the roll is between 2 and 12, then allow the roll to be used
            if(roll2 >= 2 && roll2 <= 12) {
            
            square2 = roll2 + square2;
                    
            }
            
            // if the roll makes the player go above 100, return back to original square before you rolled that number
            if(square2 > 100) {
                square2 = square2 - roll2;
            }
            // if you land on 9, climb ladder to 34
            if(square2 == 9) {
                square2 = square2 + 25;
            } 
            // if you land on 40, climb ladder to 64
            else if(square2 == 40) {
                square2 = square2 + 24;
            }
            // if you land on 54, slide down snake to 19
            else if(square2 == 54) {
                square2 = square2 - 35;
            } 
            // if you land 67, climb ladder to 86
            else if(square2 == 67) {
                square2 = square2 + 19;
            }
            // if you land on 90, slide down snake to 48
            else if(square2 == 90) {
                square2 = square2 - 42;
            }
            // if you land on 99, slide down snake to 77
            else if(square2 == 99) {
                square2 = square2 - 22;
            }
            
            // outputs the current square you are on after rolling and moving
            System.out.println("You are now on square " + square2);
            
            // if you complete the game by reaching 100, outputs message telling you that you won!
            if(square2 == 100) {
                System.out.println("You Win!");
            }
            
        }
        
        
    }
}
