// Gabriel Gaydos
// 10/20/15
// hw08
// import method
import java.util.Scanner;
// name class
public class Area {
// create methods
// creating a method that finds the area of a circle
    public static double CircleArea (double r) {
        double Pi= 3.14;
        r*= r;
        double circle = Pi * r;
        return circle;
    }
// creating a method that finds the area of a rectangle
    public static double RectangleArea (double l, double w) {
        double rectangle = l * w;
        return rectangle;
    }
// creating a method that fins the area of a triangle
    public static double TriangleArea (double h, double b) {
        double triangle = h * b;
        triangle/=2;
        return triangle;
    }
// creting a method that prints out the string the user inputs
    public static String Input () {
        Scanner scan = new Scanner(System.in);
        String in = scan.next();
        in = in.toLowerCase();
        if (in.equals("circle") || in.equals("rectangle") || in.equals("triangle")) {
            System.out.println("You chose a: " + in);
        }
// making the user reenter if the input was not a string
        else {
            System.out.println("Invalid input please enter: cirlce, rectangle or triangle.");
            in = scan.next();
        }return in;
    }
// main method
    public static void main (String [ ] args) {
        Scanner scan = new Scanner (System.in);
        String in = Input();
        double circledim = 0;
        if (in.equals("circle")) {
            while (!scan.hasNextDouble()) {
                System.out.println("Error, Try again");
                scan.next();
            }
            double dim = scan.nextDouble();
            circledim = CircleArea (dim);
            System.out.println("The area of the circle is: " + circledim);
        }
        double rectangledim = 0;
        if (in.equals("rectangle")) {
            while (!scan.hasNextDouble()) {
                System.out.println("Error, Try again");
                scan.next();
            }
            double length = scan.nextDouble();
            double width = scan.nextDouble();
            rectangledim = RectangleArea (length, width);
            System.out.println("The area of the rectangle is: " + rectangledim);
        }
        double triangledim = 0;
        if (in.equals("triangle")) {
            while (!scan.hasNextDouble()) {
                System.out.println("Error, Try again");
                scan.next();
            }
            double height = scan.nextDouble();
            double base = scan.nextDouble();
            triangledim = TriangleArea (height, base);
            System.out.println("The area of the triangle is: " + triangledim);
        }
    }
}