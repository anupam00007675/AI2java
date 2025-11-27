import java.util.Scanner;

/**
 * Write a description of class Positivenegativezero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Positivenegativezero
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number");
        int number = input.nextInt();
        if (number > 0){
            System.out.print("The given number is negative");
        }
        else if (number < 0){
            System.out.print("The given number is positive");
        }
        else{
            System.out.print("The given number is zero");
            
        }
        
    
     input.close();
    }
     
     
    
    
}