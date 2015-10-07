// Gabriel Gaydos
// hw06
// 10/6/15
// import methods
import java.util.Random;
import java.util.Scanner;
// name class
public class BarGraph {
// main method
    public static void main(String [ ] args) {
// have the scanner ask for inputs
        Scanner scan = new Scanner(System.in);
        System.out.print("Expenses for Monday are: $");
        double Mon = scan.nextDouble();
        System.out.print("Expenses for Tuesday are: $");
        double Tue = scan.nextDouble();
        System.out.print("Expenses for Wednesday are: $");
        double Wed = scan.nextDouble();
        System.out.print("Expenses for Thursday are: $");
        double Thu = scan.nextDouble();
        System.out.print("Expenses for Friday are: $");
        double Fri = scan.nextDouble();
        System.out.print("Expenses for Saturday are: $");
        double Sat = scan.nextDouble();
        System.out.print("Expenses for Sunday are: $");
        double Sun = scan.nextDouble();
        double Mon2 = Mon;
        double Tue2 = Tue;
        double Wed2 = Wed;
        double Thu2 = Thu;
        double Fri2 = Fri;
        double Sat2 = Sat;
        double Sun2 = Sun;
        int Mon1 = (int) Mon;
        Mon-=Mon1;
        if (Mon < .5) {
            System.out.print("");
        } else {
            Mon1++;
        }
        int Tue1 = (int) Tue;
        Tue-=Tue1;
        if (Tue < .5) {
            System.out.print("");
        } else {
        Tue1++;
        }
        int Wed1 = (int) Wed;
        Wed-=Wed1;
        if (Wed < .5) {
            System.out.print("");
        } else {
            Wed1++;
        }
        int Thu1 = (int) Thu;
        Thu-=Thu1;
        if (Thu < .5) {
            System.out.print("");
        } else {
            Thu1++;
        }
        int Fri1 = (int) Fri;
        Fri-=Fri1;
        if (Fri < .5) {
            System.out.print("");
        } else {
            Fri1++;
        }
        int Sat1 = (int) Sat;
        Sat-=Sat1;
        if (Sat < .5) {
            System.out.print("");
        } else {
            Sat1++;
        }
        int Sun1 = (int) Sun;
        Sun-=Sun1;
        if (Sun < .5) {
            System.out.print("");
        } else {
            Sun1++;
        }
        System.out.print("Mon: ");
        for (int x = 1; x <= Mon1; x++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Tue: ");
        for (int x = 1; x <= Tue1; x++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Wed: ");
        for (int x = 1; x <= Wed1; x++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Thu: ");
        for (int x = 1; x <= Thu1; x++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Fri: ");
        for (int x = 1; x <= Fri1; x++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Sat: ");
        for (int x = 1; x <= Sat1; x++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Sun: ");
        for (int x = 1; x <= Sun1; x++) {
            System.out.print("*");
        }
        System.out.println("");
        double sum = Mon2 + Tue2 + Wed2 + Thu2 + Fri2 + Sat2 + Sun2;
        double sum1 = sum;
        sum/=7;
        System.out.print("The sum of your expenses daily is: $");
        System.out.printf("%.2f", sum);
        System.out.println("");
        sum1*=52;
        sum1*=4;
        System.out.print("The sum of your expenses after 4 years is: $");
        System.out.printf("%.2f", sum1);
    }
}