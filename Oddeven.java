import java.util.Scanner;

/**
 * Write a description of class Oddeven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Oddeven
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number");
        int number = input.nextInt();
        if (number % 2 == 0){
            System.out.print("The given number is even");
        }
        else{
            System.out.print("The given number is odd");
        }
        input.close();
        
            
            
            
        }
        
        
}