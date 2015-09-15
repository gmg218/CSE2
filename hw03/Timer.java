// Gabriel Gaydos
// hw03
// import method
import java.util.Scanner;
// class
public class Timer {
// main method
    public static void main(String [ ] args) {
        Scanner myScanner = new Scanner(System.in); // creating a new scanner int
        System.out.print("The current time is ");
        int currentT = myScanner.nextInt(); // allowing the int current time to be inputed through the user
        System.out.print("The time of dinner is ");
        int dinnerT = myScanner.nextInt(); // initializing dinner time and allowing for an input from the user
        int hours = (dinnerT - currentT) / 100; // calculation for hours
        int minutes = ((dinnerT - currentT) % 100) - 40; // calculation for minutes
        System.out.print("You have " + hours + " hours and " + minutes);
        System.out.println(" minutes until dinner");
    }
}