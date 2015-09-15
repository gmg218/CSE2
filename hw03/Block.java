// Gabriel Gaydos
// hw03
// import method
import java.util.Scanner;
// class
public class Block {
// main method
    public static void main(String [ ] args) {
        Scanner scan = new Scanner(System.in); // creating a new scanner int called scan
        System.out.print("Enter the length of the block: ");
        double l= scan.nextDouble(); // creating length and making it be the next input by the user
        System.out.print("Enter the width of the block: ");
        double w= scan.nextDouble(); // creating width and making it be the next input by the user
        System.out.print("Enter the height of the block ");
        double h= scan.nextDouble(); // creating height and making it be the next input by the user
        double V= ((l * w) * h); // creating volume and calculating it with the length, width, and height
        double SA= (((2*l*w) + 2*w*h) + 2*h*l); // creating surface area and calculating it
        System.out.println("The volume of the block with dimensions " + l + " x " + w + " x " + h + " is: " + V);
        System.out.println("The surface area of the block is: " + SA);
    }
}