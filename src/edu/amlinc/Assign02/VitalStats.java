package edu.amlinc.Assign02;

import java.util.*;

public class VitalStats {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String Fname, Lname;
        int totIn, htIn, htFt, bmi;
        double wt;
        System.out.println("Enter name:");
        Fname = scan.next();
        Lname = scan.next();
        System.out.println("Enter height in inches:");
        totIn = scan.nextInt();
        htFt = totIn/12;
        htIn = totIn%12;
        System.out.println("Enter weight in pounds:");
        wt = scan.nextDouble();
        bmi = (int)((703*wt)/(totIn*totIn));
        System.out.println("NAME: " + Lname + ", " + Fname);
        System.out.println("WEIGHT: " + wt + " lbs.");
        System.out.println("HEIGHT: " + htFt + "'-" + htIn + "\"");
        System.out.println("BMI: " + bmi);
    }
}
