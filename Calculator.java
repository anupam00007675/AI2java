import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main (String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number");
        int first_number = sc.nextInt();
        System.out.println("Enter Second Number");
        int second_number = sc.nextInt();
        if (first_number>second_number){
            System.out.println("The greatest number is:"+first_number);
        }
        else if(second_number>first_number){
            System.out.println("The greatest number is:"+second_number);
        }
        else{
            System.out.println("Both numbers are equal");
        }
        
        int add = first_number + second_number;
        int sub = first_number - second_number;
        int product = first_number * second_number;
        int divide = first_number / second_number;
        
        System.out.println("Addition:"+add);
        System.out.println("Subtraction:"+sub);
        System.out.println("Multiplication:"+product);
        System.out.println("Division:"+divide);
    }
}
        
        
        
