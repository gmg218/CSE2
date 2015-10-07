// Gabriel Gaydos
// lab06
// 10/3/15
// import method
import java.util.Random;
// name class
public class GettingLoopy {
// main method
    public static void main(String [ ] args) {
        System.out.println("Step 1:");
        int num = 1;
        while (num < 8) {
            System.out.print(num++);
            if (num == 7) {
                System.out.print(num + "" + num + "" + num + "" + num + "" + num + "" + num);
            }
        }
        System.out.println("");
        System.out.println("Step 2:");
        int prime = 10, i = 2;
        while (prime < 100) {
            i = 2;
            while (i < prime) {
                if (prime % i == 0) {
                    break;
                }
                i++;
            }
            if (i == prime) {
                System.out.print(prime + " ");
            }
            prime++;
        } 
        System.out.println("");
        for (prime = 10; prime <= 100; prime++) {
            for (i = 2; i < prime; i++) {
                if (prime % i == 0) {
                    break;
                }
            }
            if (i == prime) {
                System.out.print(prime + " ");
            }
        }
        System.out.println("");
        prime = 10;
        do {
            i = 2;
            do {
                if (prime % i == 0) {
                    break;
                }
                i++;
            } while (i < prime);
            if (i == prime) {
                System.out.print(prime + " ");
            }
            prime ++;
        } while (prime < 100);
        System.out.println("Step 3:");
        int nums = (int) (Math.random()*201) + 5;
        for (int x = 0; x <= nums; x++) {
            if (x % 20 == 0) {
                System.out.println();
            }
            System.out.print("$");
        }
    }
}