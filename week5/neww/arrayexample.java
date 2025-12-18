package week5.neww;


/**
 * Write a description of class arrayexample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrayexample
{
   public static void main(String[]arg)
   {
       int [] age; // array declaration
       age=new int[5]; // construction of an array
       
       age[0]=10;
       age[1]=20;
       age[2]=40;
       age[3]=50;
       age[4]=22;
       
       System.out.println(age[0]);
       System.out.println(age[1]);
       System.out.println(age[2]);
       System.out.println(age[3]);
       System.out.println(age[4]);
       
       int[]number=new int[5];
       
       System.out.println("Using loop to initlizate the array");
       int x=2;
       for(int i=0;i<number.length;i++)
       {
           number[i]=2;
           x=x+2;
           
           
       }
       System.out.println("Display using loop");
       for(int j=0;j<number.length;j++)
       {
           System.out.println(number[j]);
       }
       
   }
    
}