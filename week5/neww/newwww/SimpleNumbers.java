package week5.neww.newwww;


/**
 * Write a description of class ii here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class SimpleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = {10, 20, 30, 40, 50};
        int sum = 0;
        int max = scores[0]; 
        int min = scores[0]; 

        System.out.println("--- Scores ---");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
            sum = sum + scores[i];
            if (scores[i] > max) max = scores[i];
            if (scores[i] < min) min = scores[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / scores.length));
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);
        System.out.println("\n--- Dynamic Input ---");
        System.out.print("Enter number of subjects: ");
        int size = sc.nextInt();
        
        int[] userScores = new int[size]; 
        for (int i = 0; i < size; i++) {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            userScores[i] = sc.nextInt();
        }
        System.out.println("\n--- Updated Array ---");
        for (int i = 0; i < size; i++) {
            System.out.println(userScores[i]);
        }
    }
}