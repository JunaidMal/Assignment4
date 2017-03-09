
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // creating a scanner called input
        Scanner input = new Scanner(System.in);

        // asks for you to enter name then saves it as name
        System.out.println("Please enter your name");
        String name = input.nextLine();

        // Asks for the total marks the each individual test is out of, then what mark you got for each of them
        System.out.println("What was the first test out of?:");
        double test1 = input.nextDouble();

        System.out.println("What mark did you get?:");
        double mark1 = input.nextDouble();

        System.out.println("What was the second test out of?:");
        double test2 = input.nextDouble();

        System.out.println("What mark did you get?:");
        double mark2 = input.nextDouble();

        System.out.println("What was the third test out of?:");
        double test3 = input.nextDouble();

        System.out.println("What mark did you get?:");
        double mark3 = input.nextDouble();

        System.out.println("What was the fourth test out of?:");
        double test4 = input.nextDouble();

        System.out.println("What mark did you get?:");
        double mark4 = input.nextDouble();

        System.out.println("What was the fifth test out of?:");
        double test5 = input.nextDouble();

        System.out.println("What mark did you get?:");
        double mark5 = input.nextDouble();


        // divides mark you got from total marks for each individual test, then multiplies it by 100 for a percentage
        double total1 = mark1 / test1 * 100;

        double total2 = mark2 / test2 * 100;

        double total3 = mark3 / test3 * 100;

        double total4 = mark4 / test4 * 100;

        double total5 = mark5 / test5 * 100;

        // prints who the test scores are for
        System.out.println("Test scores for " + name);

        // prints the total percentage you got for each test
        System.out.println("Test 1: " + total1 + "%");

        System.out.println("Test 2: " + total2 + "%");

        System.out.println("Test 3: " + total3 + "%");

        System.out.println("Test 4: " + total4 + "%");

        System.out.println("Test 5: " + total5 + "%");

        // adds all the marks you got then divides by 5 to find the average
        double average = (total1 + total2 + total3 + total4 + total5) / 5;

        // makes space
        System.out.println("");
        // prints your average
        System.out.println("Average: " + average + "%");



    }
}
