package week5.neww.week7;
import java.util.Scanner;


/**
 * Write a description of class jjj here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class employee
{
    int id;
    String name;
    int salary;
    public static void main(String[]arg){
        employee e[]= new employee[3];
        Scanner bed=new Scanner(System.in);
        System.out.println("enter the detail in following order : ID , NAME , SALARY");
        for(int i=0 ; i<e.length;i++){
            e[i]= new employee();
            e[i].id=bed.nextInt();
            e[i].name=bed.next();
            e[i].salary=bed.nextInt();
            }
        for(int i=0;i<e.length;i++){
            System.out.println("the detail of the employee number "+(i+1)+"is"+" "+e[i].id+" "+e[i].name+" "+e[i].salary);
        }
        employee max = e[0];
        for(int i=1;i<e.length;i++){
            if(max.salary<e[i].salary){
            max=e[i];
        }
        }
    System.out.println("the detail of the employee with the higest salary is "+max.id+max.name+max.salary);
    }
}