// Gabriel Gaydos
// 10/20/15
// hw08
// import method
import java.util.Scanner;
// name class
public class StringAnalysis {
// create methods
// creating a method that checks the input for non-string inputs and counts the number of index's that are not strings
    public static void check (String temp) {
        int count = 0;
        for (int i = 0; i<temp.length(); i++) {
            if (!Character.isLetter(temp.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
// creating a method that counts the number of index's that are not strings
// the difference between this method and the first is this method checks a certain number of index's
    public static void check (String temp, int j) {
        int count = 0;
        for (int i = 0; i<j; i++) {
            if (!Character.isLetter(temp.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
// main method
    public static void main (String [ ] args) {
        Scanner scan = new Scanner (System.in);
        String string = scan.next();
        String temp = scan.next();
        temp = temp.toLowerCase();
        if (temp.equals("yes")) {
            int index = scan.nextInt();
            check(string,index);
        }
        else if (temp.equals("no")) {
            check(string);
        }
        else {
            System.out.println("Invalid input, say yes or no");
            scan.next();
        }
    }
}