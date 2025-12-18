package week5.neww.newwww;


/**
 * Write a description of class uuuuu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Districts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
        System.out.println("--- Original List ---");
        for (int i = 0; i < districts.length; i++) {
            System.out.println((i + 1) + ". " + districts[i]);
        }
        System.out.print("\nHow many districts do you want to enter? ");
        int count = sc.nextInt();
        sc.nextLine(); 
        districts = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name for district " + (i + 1) + ": ");
            districts[i] = sc.nextLine();
        }

        System.out.println("\n--- Updated List ---");
        for (int i = 0; i < districts.length; i++) {
            System.out.println((i + 1) + ". " + districts[i]);
        }
    }
}