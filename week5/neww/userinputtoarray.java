package week5.neww;
import java.util.Scanner;


/**
 * Write a description of class userinputtoarray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class userinputtoarray
{
    public static void main(String[]args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    sc.nextLine();
    String []name=new String[size];
    for (int i=0;i<name.length;i++)
    {
        System.out.println("Enter the name");
        name[i]=sc.nextLine();
    }
    System.out.println("Display using loop");
    for(int j=0;j<name.length;j++)
    {
        System.out.print(name[j]+"\t");
    }
    }
}