import java.util.Scanner;

/**
 * Write a description of class Average here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Average
{
    public static void main(String[]arg)
    {
     Scanner sc = new Scanner (System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     int d = sc.nextInt();
     int e = sc.nextInt();
     int avg = (a+b+c+d+e)/5;
     int per = ((a+b+c+d+e)/100)*100;
     System.out.println("The avg and % is"+avg+"\n"+per);
     
    }
}