package week5;
import java.util.Scanner;


/**
 * Write a description of class Primeornot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Primeornot
{
    public static void main(String[]arg)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number to check:");
        int num = input.nextInt();
        int count=0;
        for (int i=1;i<=num;i++){
            if (num%2==0){
                count++;
            }
            
            
        }
        if (count==2){
            System.out.println(num + " is a Prime number.");
            
            
        }
        else{
            System.out.println(num + " is not a Prime number.");
        }
        
        
    }
}