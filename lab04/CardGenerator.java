// Gabriel Gaydos
// lab04
// import
import java.util.Random;
// name class
public class CardGenerator {
// main method
    public static void main(String [ ] args) {
// generate a random number
        int num = (int) (Math.random()*52)+2;
// creating strings to help with switch statements
        String spades = new String ("spades");
        String diamonds = new String ("diamonds");
        String clubs = new String ("clubs");
        String hearts = new String ("hearts");
        String num1 = "" + num;
        System.out.println("Generate a random number for your card: " + num);
// operation of identifying each number to a specific suit
// aslo some calculations to change the numbers above 13 to regulation value
        switch (num) {
            case 1:
            num1 = ("Ace");
            System.out.println("Your card is the: " + num1 + " of " + diamonds);
            break;
            case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
            System.out.println("Your card is the: " + num + " of " + diamonds);
            break;
            case 11:
            num1 = ("Jack");
            System.out.println("Your card is the: " + num1 + " of " + diamonds);
            break;
            case 12:
            num1 = ("Queen");
            System.out.println("Your card is the: " + num1 + " of " + diamonds);
            break;
            case 13:
            num1 = ("King");
            System.out.println("Your card is the: " + num1 + " of " + diamonds);
            break;
            case 14:
            num1 = ("Ace");
            System.out.println("Your card is the: " + num1 + " of " + clubs);
            break;
            case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23:
            num-= 13;
            System.out.println("Your card is the: " + num + " of " + clubs);
            break;
            case 24:
            num1 = ("Jack");
            System.out.println("Your card is the: " + num1 + " of " + clubs);
            break;
            case 25:
            num1 = ("Queen");
            System.out.println("Your card is the: " + num1 + " of " + clubs);
            break;
            case 26:
            num1 = ("King");
            System.out.println("Your card is the: " + num1 + " of " + clubs);
            break;
            case 27:
            num1 = ("Ace");
            System.out.println("Your card is the: " + num1 + " of " + hearts);
            break;
            case 28: case 29: case 30: case 31: case 32: case 33: case 34: case 35: case 36:
            num-= 26;
            System.out.println("Your card is the: " + num + " of " + hearts);
            break;
            case 37:
            num1 = ("Jack");
            System.out.println("Your card is the: " + num1 + " of " + hearts);
            break;
            case 38:
            num1 = ("Queen");
            System.out.println("Your card is the: " + num1 + " of " + hearts);
            break;
            case 39:
            num1 = ("King");
            System.out.println("Your card is the: " + num1 + " of " + hearts);
            break;
            case 40:
            num1 = ("Ace");
            System.out.println("Your card is the: " + num1 + " of " + spades);
            break;
            case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49:
            num-= 39;
            System.out.println("Your card is the: " + num + " of " + spades);
            break;
            case 50:
            num1 = ("Jack");
            System.out.println("Your card is the: " + num1 + " of " + spades);
            break;
            case 51:
            num1 = ("Queen");
            System.out.println("Your card is the: " + num1 + " of " + spades);
            break;
            case 52:
            num1 = ("King");
            System.out.println("Your card is the: " + num1 + " of " + spades);
            break;
        }
    }
}