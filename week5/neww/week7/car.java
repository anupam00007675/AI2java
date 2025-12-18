package week5.neww.week7;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class car
{
    int modelNumber; // instance variable
   String brand;
   double price;
   void start ()
   {
       System.out.println("Car start");
   }
   void stop()
   {
       System.out.println("car stop");
   }

   public static void main(String[]args)
   {
       car c1;
       c1=new car();
       c1.modelNumber=123;
       c1.brand="Mercedez";
       c1.price= 3000;
       
       System.out.println("modelnumber is"+c1.modelNumber);
       System.out.println("brand is"+c1.brand);
       System.out.println("price is"+c1.brand);
       
       c1.start();
       c1.stop();
       
       car c2=new car();
       c2=new car();
       c2.modelNumber=345;
       c2.brand="bmw";
       c2.price=400000000;
       
       System.out.println("brand ");
       
    }
         
       
   }
