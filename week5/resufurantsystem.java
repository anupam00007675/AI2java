package week5;
import java.util.Scanner;


/**
 * Write a description of class resufurantsystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class resufurantsystem
{
   public static void main(String[]arg)
   {
       Scanner input = new Scanner(System.in);
       int choice;
       int quantity;
       int totalBill=0;
       do
       {
           System.out.println("1 : Burger Rs 200");
           System.out.println("2 : Momo Rs 100");
           System.out.println("3 : Pizza Rs 300");
           System.out.println("0 : Bill");
           System.out.println("Enter the choice");
           choice= input.nextInt();
           switch(choice)
           {
               case 1:System.out.println("You choosed Burger");
                      System.out.println("Enter the quantity");
                      quantity=input.nextInt();
                      totalBill+=200*quantity;
                      break;
                      
                      case 2:System.out.println("You choosed Momo");
                            System.out.println("Enter the quantity");
                            quantity=input.nextInt();
                            totalBill=totalBill+100*quantity;
                            break;
                        case 3:System.out.println("You choosed Pizzs");
                                System.out.println("Enter the quantity");
                                quantity=input.nextInt();
                                totalBill=totalBill+300*quantity;
                                break;
                                
                            case 0:System.out.println("Total bill is"+totalBill);
                            break;
                            default:
                                System.out.println("please try again!");
                      
           }
        }
        
           while(choice!=0);
        }
    }
           
        
    
       
   
