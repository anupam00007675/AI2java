package week5.neww;
import java.util.Scanner;


/**
 * Write a description of class matrixexample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class matrixexample
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        int[][]matrix=new int[2][2];
        System.out.println("Inilization of Matrix");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("Enter the data");
                matrix[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Inilization of Matrix");
        for(int k=0;k<2;k++)
        {
            for(int l=0;l<2;l++)
            {
                System.out.print(matrix[k][l]+"\t");
            }
            System.out.println();
        }
        
    }
}