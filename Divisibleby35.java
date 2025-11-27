import java.util.Scanner;

/**
 * Write a description of class Divisibleby35 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Divisibleby35
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number");
        int number = input.nextInt();
        if  (number % 5 == 0){
            System.out.print("The number is divisible by 5");
        }
        else if (number % 3 ==0){
            System.out.print("The number is divisible by 3");
        }
        else{
            System.out.print("The number is not divisible by both 3 and 5 ");
        }
        input.close();
        
        
        
        
        
        
    }
}