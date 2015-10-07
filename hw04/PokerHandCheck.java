// Gabriel Gaydos
// hw04
// import
import java.util.Random;
// name class
public class PokerHandCheck {
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
        int Snum = (int) (Math.random()*52)+2;
        String Snum1 = "" + Snum;
        System.out.println("Generate a random number for your second card: " + Snum);
        switch (Snum) {
            case 1:
            Snum1 = ("Ace");
            System.out.println("Your card is the: " + Snum1 + " of " + diamonds);
            break;
            case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
            System.out.println("Your card is the: " + Snum + " of " + diamonds);
            break;
            case 11:
            Snum1 = ("Jack");
            System.out.println("Your card is the: " + Snum1 + " of " + diamonds);
            break;
            case 12:
            Snum1 = ("Queen");
            System.out.println("Your card is the: " + Snum1 + " of " + diamonds);
            break;
            case 13:
            Snum1 = ("King");
            System.out.println("Your card is the: " + Snum1 + " of " + diamonds);
            break;
            case 14:
            Snum1 = ("Ace");
            System.out.println("Your card is the: " + Snum1 + " of " + clubs);
            break;
            case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23:
            Snum-= 13;
            System.out.println("Your card is the: " + Snum + " of " + clubs);
            break;
            case 24:
            Snum1 = ("Jack");
            System.out.println("Your card is the: " + Snum1 + " of " + clubs);
            break;
            case 25:
            Snum1 = ("Queen");
            System.out.println("Your card is the: " + Snum1 + " of " + clubs);
            break;
            case 26:
            Snum1 = ("King");
            System.out.println("Your card is the: " + Snum1 + " of " + clubs);
            break;
            case 27:
            Snum1 = ("Ace");
            System.out.println("Your card is the: " + Snum1 + " of " + hearts);
            break;
            case 28: case 29: case 30: case 31: case 32: case 33: case 34: case 35: case 36:
            Snum-= 26;
            System.out.println("Your card is the: " + Snum + " of " + hearts);
            break;
            case 37:
            Snum1 = ("Jack");
            System.out.println("Your card is the: " + Snum1 + " of " + hearts);
            break;
            case 38:
            Snum1 = ("Queen");
            System.out.println("Your card is the: " + Snum1 + " of " + hearts);
            break;
            case 39:
            Snum1 = ("King");
            System.out.println("Your card is the: " + Snum1 + " of " + hearts);
            break;
            case 40:
            Snum1 = ("Ace");
            System.out.println("Your card is the: " + Snum1 + " of " + spades);
            break;
            case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49:
            Snum-= 39;
            System.out.println("Your card is the: " + Snum + " of " + spades);
            break;
            case 50:
            Snum1 = ("Jack");
            System.out.println("Your card is the: " + Snum1 + " of " + spades);
            break;
            case 51:
            Snum1 = ("Queen");
            System.out.println("Your card is the: " + Snum1 + " of " + spades);
            break;
            case 52:
            Snum1 = ("King");
            System.out.println("Your card is the: " + Snum1 + " of " + spades);
            break;
        }
        int Tnum = (int) (Math.random()*52)+2;
        String Tnum1 = "" + Tnum;
        System.out.println("Generate a random number for your third card: " + Tnum);
        switch (Tnum) {
            case 1:
            Tnum1 = ("Ace");
            System.out.println("Your card is the: " + Tnum1 + " of " + diamonds);
            break;
            case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
            System.out.println("Your card is the: " + Tnum + " of " + diamonds);
            break;
            case 11:
            Tnum1 = ("Jack");
            System.out.println("Your card is the: " + Tnum1 + " of " + diamonds);
            break;
            case 12:
            Tnum1 = ("Queen");
            System.out.println("Your card is the: " + Tnum1 + " of " + diamonds);
            break;
            case 13:
            Tnum1 = ("King");
            System.out.println("Your card is the: " + Tnum1 + " of " + diamonds);
            break;
            case 14:
            Tnum1 = ("Ace");
            System.out.println("Your card is the: " + Tnum1 + " of " + clubs);
            break;
            case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23:
            Tnum-= 13;
            System.out.println("Your card is the: " + Tnum + " of " + clubs);
            break;
            case 24:
            Tnum1 = ("Jack");
            System.out.println("Your card is the: " + Tnum1 + " of " + clubs);
            break;
            case 25:
            Tnum1 = ("Queen");
            System.out.println("Your card is the: " + Tnum1 + " of " + clubs);
            break;
            case 26:
            Tnum1 = ("King");
            System.out.println("Your card is the: " + Tnum1 + " of " + clubs);
            break;
            case 27:
            Tnum1 = ("Ace");
            System.out.println("Your card is the: " + Tnum1 + " of " + hearts);
            break;
            case 28: case 29: case 30: case 31: case 32: case 33: case 34: case 35: case 36:
            Tnum-= 26;
            System.out.println("Your card is the: " + Tnum + " of " + hearts);
            break;
            case 37:
            Tnum1 = ("Jack");
            System.out.println("Your card is the: " + Tnum1 + " of " + hearts);
            break;
            case 38:
            Tnum1 = ("Queen");
            System.out.println("Your card is the: " + Tnum1 + " of " + hearts);
            break;
            case 39:
            Tnum1 = ("King");
            System.out.println("Your card is the: " + Tnum1 + " of " + hearts);
            break;
            case 40:
            Tnum1 = ("Ace");
            System.out.println("Your card is the: " + Tnum1 + " of " + spades);
            break;
            case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49:
            Tnum-= 39;
            System.out.println("Your card is the: " + Tnum + " of " + spades);
            break;
            case 50:
            Tnum1 = ("Jack");
            System.out.println("Your card is the: " + Tnum1 + " of " + spades);
            break;
            case 51:
            Tnum1 = ("Queen");
            System.out.println("Your card is the: " + Tnum1 + " of " + spades);
            break;
            case 52:
            Tnum1 = ("King");
            System.out.println("Your card is the: " + Tnum1 + " of " + spades);
            break;
        }
        int Fonum = (int) (Math.random()*52)+2;
        String Fonum1 = "" + Fonum;
        System.out.println("Generate a random number for your fourth card: " + Fonum);
        switch (Fonum) {
            case 1:
            Fonum1 = ("Ace");
            System.out.println("Your card is the: " + Fonum1 + " of " + diamonds);
            break;
            case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
            System.out.println("Your card is the: " + Fonum + " of " + diamonds);
            break;
            case 11:
            Fonum1 = ("Jack");
            System.out.println("Your card is the: " + Fonum1 + " of " + diamonds);
            break;
            case 12:
            Fonum1 = ("Queen");
            System.out.println("Your card is the: " + Fonum1 + " of " + diamonds);
            break;
            case 13:
            Fonum1 = ("King");
            System.out.println("Your card is the: " + Fonum1 + " of " + diamonds);
            break;
            case 14:
            Fonum1 = ("Ace");
            System.out.println("Your card is the: " + Fonum1 + " of " + clubs);
            break;
            case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23:
            Fonum-= 13;
            System.out.println("Your card is the: " + Fonum + " of " + clubs);
            break;
            case 24:
            Fonum1 = ("Jack");
            System.out.println("Your card is the: " + Fonum1 + " of " + clubs);
            break;
            case 25:
            Fonum1 = ("Queen");
            System.out.println("Your card is the: " + Fonum1 + " of " + clubs);
            break;
            case 26:
            Fonum1 = ("King");
            System.out.println("Your card is the: " + Fonum1 + " of " + clubs);
            break;
            case 27:
            Fonum1 = ("Ace");
            System.out.println("Your card is the: " + Fonum1 + " of " + hearts);
            break;
            case 28: case 29: case 30: case 31: case 32: case 33: case 34: case 35: case 36:
            Fonum-= 26;
            System.out.println("Your card is the: " + Fonum + " of " + hearts);
            break;
            case 37:
            Fonum1 = ("Jack");
            System.out.println("Your card is the: " + Fonum1 + " of " + hearts);
            break;
            case 38:
            Fonum1 = ("Queen");
            System.out.println("Your card is the: " + Fonum1 + " of " + hearts);
            break;
            case 39:
            Fonum1 = ("King");
            System.out.println("Your card is the: " + Fonum1 + " of " + hearts);
            break;
            case 40:
            Fonum1 = ("Ace");
            System.out.println("Your card is the: " + Fonum1 + " of " + spades);
            break;
            case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49:
            Fonum-= 39;
            System.out.println("Your card is the: " + Fonum + " of " + spades);
            break;
            case 50:
            Fonum1 = ("Jack");
            System.out.println("Your card is the: " + Fonum1 + " of " + spades);
            break;
            case 51:
            Fonum1 = ("Queen");
            System.out.println("Your card is the: " + Fonum1 + " of " + spades);
            break;
            case 52:
            Fonum1 = ("King");
            System.out.println("Your card is the: " + Fonum1 + " of " + spades);
            break;
        }
        int Finum = (int) (Math.random()*52)+2;
        String Finum1 = "" + Finum;
        System.out.println("Generate a random number for your fith card: " + Finum);
        switch (Finum) {
            case 1:
            Finum1 = ("Ace");
            System.out.println("Your card is the: " + Finum1 + " of " + diamonds);
            break;
            case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
            System.out.println("Your card is the: " + Finum + " of " + diamonds);
            break;
            case 11:
            Finum1 = ("Jack");
            System.out.println("Your card is the: " + Finum1 + " of " + diamonds);
            break;
            case 12:
            Finum1 = ("Queen");
            System.out.println("Your card is the: " + Finum1 + " of " + diamonds);
            break;
            case 13:
            Finum1 = ("King");
            System.out.println("Your card is the: " + Finum1 + " of " + diamonds);
            break;
            case 14:
            Finum1 = ("Ace");
            System.out.println("Your card is the: " + Finum1 + " of " + clubs);
            break;
            case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23:
            Finum-= 13;
            System.out.println("Your card is the: " + Finum + " of " + clubs);
            break;
            case 24:
            Finum1 = ("Jack");
            System.out.println("Your card is the: " + Finum1 + " of " + clubs);
            break;
            case 25:
            Finum1 = ("Queen");
            System.out.println("Your card is the: " + Finum1 + " of " + clubs);
            break;
            case 26:
            Finum1 = ("King");
            System.out.println("Your card is the: " + Finum1 + " of " + clubs);
            break;
            case 27:
            Finum1 = ("Ace");
            System.out.println("Your card is the: " + Finum1 + " of " + hearts);
            break;
            case 28: case 29: case 30: case 31: case 32: case 33: case 34: case 35: case 36:
            Finum-= 26;
            System.out.println("Your card is the: " + Finum + " of " + hearts);
            break;
            case 37:
            Finum1 = ("Jack");
            System.out.println("Your card is the: " + Finum1 + " of " + hearts);
            break;
            case 38:
            Finum1 = ("Queen");
            System.out.println("Your card is the: " + Finum1 + " of " + hearts);
            break;
            case 39:
            Finum1 = ("King");
            System.out.println("Your card is the: " + Finum1 + " of " + hearts);
            break;
            case 40:
            Finum1 = ("Ace");
            System.out.println("Your card is the: " + Finum1 + " of " + spades);
            break;
            case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49:
            Finum-= 39;
            System.out.println("Your card is the: " + Finum + " of " + spades);
            break;
            case 50:
            Finum1 = ("Jack");
            System.out.println("Your card is the: " + Finum1 + " of " + spades);
            break;
            case 51:
            Finum1 = ("Queen");
            System.out.println("Your card is the: " + Finum1 + " of " + spades);
            break;
            case 52:
            Finum1 = ("King");
            System.out.println("Your card is the: " + Finum1 + " of " + spades);
            break;
        }
        if (num1 == Snum1 || Tnum1 || Fonum1 || Finum1) {
            System.out.println("You have one pair!");
        }
        else if (Snum1 == Tnum1 || Fonum1 || Finum1 || num1) {
            System.out.println("You have one pair!");
        }
        else if (Tnum1 == Fonum1 || Finum1 || Snum1 || num1) {
            System.out.println("You have one pair!");
        }
        else if (Fonum1 == Finum1 || Snum1 || num1) {
            System.out.println("You have one pair!");
        }
        else if (num == Snum || Tnum || Fonum || Finum) {
            System.out.println("You have one pair!");
        }
    }
}