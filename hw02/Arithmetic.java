// Gabriel Gaydos
// hw02
//
// class
public class Arithmetic {
// main method
    public static void main(String[ ] args) {
// initializing variables
        int nS=3; // number of socks
        int nG=6; // number of glasses
        int nE=1; // number of boxes of envelopes
        double Sc$=2.58; // cost per pair of socks
        double Gc$=2.29; // cost per glass
        double Ec$=3.25; // cost per box of envelopes
        double taxP=0.06; // tax percent
        double tax=1-0.06; // tax
        double tSc; // total cost of socks with tax
        double tGc; // total cost of glasses with tax
        double tEc; // total cost of boxes of envelopes
        double tc; // total cost before tax
        double tst; // total sales tax
        double tct; // total cost of the transaction
// calculations
        tSc=nS*Sc$*tax*100;
        double tSc2= (int) tSc/100.0; // conversion of the total cost of the socks from a doubl to an int
        tGc=nG*Gc$*tax*100;
        double tGc2= (int) tGc/100.0; // conversion of the total cost of the glasses from a double to an int
        tEc=nE*Ec$*tax*100;
        double tEc2= (int) tEc/100.0; // conversion of the total cost of the boxes of envelopes from a double to an int
        tc=tSc2+tGc2+tEc2;
        tst=tc*taxP*100;
        double tst2= (int) tst/100.0; // conversion of the total sales tax from a double to an int 
        tct=tst2+tc;
// print statements
        System.out.println("total cost of socks with tax is $" + tSc2);
        System.out.println("total cost of glasses with tax is $" + tGc2);
        System.out.println("total cost of boxes of envelopes with tax is $" + tEc2);
        System.out.println("total cost of all the products before tax $" + tc);
        System.out.println("total cost of the tax of the products $" + tst2);
        System.out.println("total cost of the transaction $" + tct);
    }
}