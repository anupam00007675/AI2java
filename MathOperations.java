import java.util.Scanner;

/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner (System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int add = N1+N2;
        int sub = N1-N2;
        int mul = N1*N2;
        float div = (float)N1/N2;
        System.out.println("the result is" +add+"\n"+sub+"\n"+mul+"\n"+div);
        System.out.println("enter student's grade");
        int G = sc.nextInt();
        String C = (G>40)?"Pass":"Fail";
        System.out.println(C);
        
    }
}