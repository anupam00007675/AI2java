import java.util.Scanner;

/**
 * Write a description of class nestedif here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nestedif
{
   public static void main(String[]arg)
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the number");
       int number = input.nextInt();
       if (number % 5 == 0){
           if (number % 3 == 0){
               System.out.print("The number is divisible by 3");
           }
           else {
               System.out.print("The number is divisible by 5");
           }
        }
           else {
               System.out.print("The number is not divisible by both 3 and 5");
               
           }
           input.close();
           }
           
       }
    