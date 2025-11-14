import java.util.Scanner;

/**
 * Write a description of class WaterlevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterlevelMonitor
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Water Level=");
        int water_level = sc.nextInt();
        System.out.println("Your water level is="+water_level);
        int remainingwater = 1000 - water_level;
        if (water_level<1000){
            System.out.println ("Water level is normal");
            }
            else{
                System.out.println("Warning water level has reached 1000 or more");
            }
        }
    }
            
        
    