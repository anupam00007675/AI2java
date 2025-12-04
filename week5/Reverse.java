package week5;
import java.util.Scanner;


/**
 * Write a description of class Reverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reverse
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int onum= input.nextInt();
        int temp= onum;
        int reversednum= 0;
        int remainder;
        while (temp!=0)
        {
            remainder= temp%10;
            reversednum=( reversednum*10)+remainder;
            temp= temp/10;
        }
        System.out.print("Reversed number:"+reversednum);
        if (onum==reversednum){
            System.out.print("The number is palindrome");
        }
        else{
            System.out.print("The number is not palindrome");
        }
        input.close();
        
        
        }
    }
