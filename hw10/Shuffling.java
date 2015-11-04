// Gabriel Gaydos
// 11/03/15
// hw10
// import method
import java.util.Scanner;
// name class
public class Shuffling {
// methods
    public static void printArray(String [] A1) {
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        for (int i = 0; i < A1.length; i++) {
            System.out.print(A1[i] + " ");
        }
        System.out.println();
    }
    public static void shuffle(String [] A1) {
        System.out.println();
        System.out.println("Shuffle");
        for (int i=0; i < 50; i++) {
            int r = (int) (Math.random()*51);
            String temp = A1 [r];
            A1[r] = A1[0];
            A1[0] = temp;
        }
    } 
    public static String [] randomizeHand(String [] A1) {
        System.out.println();
        System.out.println("Randomized");
        String [] h = new String [5];
        for (int i=0; i < 5; i++) {
            int r = (int) (Math.random()*51);
            if (A1[r].equals(h[0]) || A1[r].equals(h[1]) || A1[r].equals(h[2]) || A1[r].equals(h[3]) || A1[r].equals(h[4])) {
                r = (int) (Math.random()*51);
            }
            h [i] = A1 [r];
        }
        return h;
    }
// main method
    public static void main (String [ ] args) {
        Scanner scan = new Scanner(System.in);
	    //suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        for (int i=0; i<52; i++){
            cards[i]=rankNames[i%13]+suitNames[i/13];
            System.out.print(cards[i]+" ");
        }
        shuffle(cards);
        printArray(cards);
        hand = randomizeHand(cards);
        printArray(hand);
    }
}