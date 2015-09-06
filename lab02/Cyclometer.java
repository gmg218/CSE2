// Gabriel Gaydos
// lab02
//
// class
public class Cyclometer {
// main method
    public static void main(String[ ] args) {
        int Trip1sec=480; // first trip in seconds
        int Trip2sec=3220; // second trip in seconds
        int Trip1count=1561; // counts of the first trip
        int Trip2count=9037; //counts of the second trip
// list of conversions
        double wheelDiameter=27.0, 
        Pi=3.14159,
        feetPerMile=5280,
        inchesPerFoot=12,
        secondsPerMinute=60;
// list of variable for the calculated distances
        double Trip1Distance,
        Trip2Distance,
        TotalDistance;
// Print statements with calculations
        System.out.println("Trip 1 took " + (Trip1sec/secondsPerMinute) + " minutes and had " + Trip1count + " counts.");
        System.out.println("Trip 2 took " + (Trip2sec/secondsPerMinute) + " minutes and had " + Trip2count + " counts.");
// Calculations
        Trip1Distance=Trip1count*wheelDiameter*Pi;
        Trip1Distance/=inchesPerFoot*feetPerMile;
        Trip2Distance=Trip2count*wheelDiameter*Pi;
        Trip2Distance/=inchesPerFoot*feetPerMile;
        TotalDistance=Trip1Distance+Trip2Distance;
// Final print statements
        System.out.println("Trip 1 was " + Trip1Distance + " miles.");
        System.out.println("Trip 2 was " + Trip2Distance + " miles.");
        System.out.println("The total distance was " + TotalDistance + " miles.");
    }
}