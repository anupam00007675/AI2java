import java.util.Scanner;

/**
 * Write a description of class Classconversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classconversion
{
    public static void main(String[]arg)
    {
     Scanner sc = new Scanner(System.in);
     int D = sc.nextInt();
     int year = D/365;
     int month = D/30;
     int DR = D%24;
     
     System.out.println("The time is"+year+"\n"+month+"\n"+DR);
     
    }
}