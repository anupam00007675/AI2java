package week5;
import java.util.Scanner;


/**
 * Write a description of class Checkoddeven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Checkoddeven
{
   public static void main(String[]arg)
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number");
       int number= input.nextInt();
       int evencount=0;
       int oddcount=0;
       int digit;
       if (number == 0){
           evencount=1;
           
       }
       else if (number < 0){
           number = number*-1;
    }
    while (number!=0){
        digit= number%10;
        if (digit % 2 == 0){
            evencount++;
        }
        else{
            oddcount++;
        }
        number=number/10;
    }
    System.out.print("Total even number"+evencount);
    System.out.print("Total odd number"+oddcount);
    input.close();
    }
   }
