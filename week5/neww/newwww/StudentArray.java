package week5.neww.newwww;


/**
 * Write a description of class Studennts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Saroj", "Sushant", "Ujjwal", "Rabina", "Sandesh"}; 
        System.out.println("--- All Names ---");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("\nName at index 2: " + names[2]);
        names[4] = "Rohan";
        System.out.println("New name at index 4: " + names[4]);
        System.out.print("\nEnter a name to replace index 0: ");
        String inputName = sc.next();
        names[0] = inputName;
        System.out.println("\n--- Updated List ---");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}