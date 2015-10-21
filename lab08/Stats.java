// Gabriel Gaydos
// 10/20/15
// lab08
// import method
import java.util.Scanner;
// name class
public class Stats {
// create methods
    public static double Mean (double a, double b, double c, double d, double e) {
        double mean1 = a + b + c + d + e;
        mean1/= 5;
        return mean1;
    } 
    public static void Print (double mean2) {
        System.out.println("The mean is: " + mean2);
    }
    public static void main(String [ ] args) {
        Scanner scan = new Scanner(System.in);
        double firstnum = scan.nextDouble();
        double secondnum = scan.nextDouble();
        double thirdnum = scan.nextDouble();
        double fourthnum = scan.nextDouble();
        double fifthnum = scan.nextDouble();
        /*while (true) {
            
            System.out.println("Invalid input. Try again");
            scan.nextDouble();
        }*/
        double mean = Mean (firstnum,secondnum,thirdnum,fourthnum,fifthnum);
        Print (mean);
    }
}