import java.util.Scanner;

/**
 * Write a description of class PassFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassFail
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        if  (marks >= 40){
            System.out.print ("Result:Pass");
        }
        else{
            System.out.print ("Result:Fail");
        }
        input.close();
    }
}