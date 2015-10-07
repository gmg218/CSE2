// Gabriel Gaydos
// lab03
// import method
import java.util.Scanner;
// name class
public class Check {
// main method
    public static void main(String [ ] args) {
        Scanner scan = new Scanner(System.in); // creating scan as the new scanner
        System.out.print("Enter the original cost of the check in the form of xx.xx: ");
        double checkCost= scan.nextDouble();
        System.out.print("Enter the percentage of tip that you want to pay as a whole numebr in the form of xx: ");
        double tipPercent= scan.nextDouble();
        tipPercent/=100; // this makes the percent into a decimal
        System.out.print("Enter the number of people that went out to dinner: ");
        int numPeople= scan.nextInt();
        double totalCost,
        CostPerPerson;
        int dollars,
        dimes,
        pennies;
        totalCost= checkCost * (1+tipPercent);
        CostPerPerson= totalCost/numPeople;
        dollars= (int) CostPerPerson;
        dimes= (int) (CostPerPerson * 10) % 10;
        pennies= (int) (CostPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies );
    }
}