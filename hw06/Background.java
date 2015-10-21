// Gabriel Gaydos
// hw06
// 10/6/15
// import method
import java.util.Scanner;
// name class
public class Background {
// main method
    public static void main(String [ ] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a 10 digit barcode: ");
        int isbn1 = scan.nextInt();
        int isbn2 = isbn1;
        int first = 0;
        int ld = 0;
        int sum = 0;
        int j = 0;
        isbn2/=10;
        j = isbn2;
        isbn2*=10;
            isbn2+=10;
            ld = isbn2 - isbn1;
            ld = 10-ld;
            first = ld;
            isbn1 = j;
            for(int i=2; i<=10; i++){
                if(isbn1<10){
                    sum+=isbn1*10;
                }
                else{
                    isbn2=isbn1;
                    isbn2/=10;
                    System.out.println(isbn2);
                    j = isbn2;
                    isbn2*=10;
                    isbn2+=10;
                    ld = isbn2 - isbn1;
                    ld = 10 - ld;
                    sum += ld*i;
                    isbn1 = j;
                }
            }
            sum%= 11;
            System.out.println("sum is:" + sum);
        }
    }