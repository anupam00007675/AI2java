import java.util.Scanner;

/**
 * Write a description of class SP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SP
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marked price");
        float markedprice = input.nextFloat();
        System.out.print("Enter the category(A, B, C, D):");
        char category = input.next().charAt(0);
        float discount = 0;
        if (category == 'A'){
            discount = 60;
            
       }
        else if (category == 'B'){
            discount = 40;
        }
        else if (category == 'C'){
            discount = 20;
        }
        else if (category == 'D'){
            
            discount = 10;
        }
        else {
            System.out.print("invalid category ");
            input.close();
            return;
        }
        float sellingPrice = markedprice - (markedprice * discount / 100);
        System.out.print("The selling price after discount :"+sellingPrice);
        input.close();
        
        }
}