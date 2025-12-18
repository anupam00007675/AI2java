package week5.neww.week7;


/**
 * Write a description of class rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle {
    double length;
    double breadth;
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        
        rect1.length = 10;
        rect1.breadth = 5;

        rect2.length = 8;
        rect2.breadth = 4;

        
        System.out.println("--- Rectangle 1 ---");
        System.out.println("Length: " + rect1.length);
        System.out.println("Breadth: " + rect1.breadth);

        
        double area1 = rect1.length * rect1.breadth;
        System.out.println("Area: " + area1);

        System.out.println("\n--- Rectangle 2 ---");
        System.out.println("Length: " + rect2.length);
        System.out.println("Breadth: " + rect2.breadth);
        double area2 = rect2.length * rect2.breadth;
        System.out.println("Area: " + area2);
    }
}