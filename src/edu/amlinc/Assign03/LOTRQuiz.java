package edu.amlinc.Assign03;

import java.util.*;
public class LOTRQuiz {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int strength, wisdom;
        boolean bigStr, bigWis;
        System.out.println("Enter strength and wisdom:");
        strength = scan.nextInt();
        wisdom = scan.nextInt();
        if(strength < 0 || wisdom < 0)
            System.err.println("ERROR: Negative entry!");
        else{
            bigStr = strength >= 50;
            bigWis = wisdom >= 50;
            if(bigStr && bigWis)
                System.out.println("ARAGORN!");
            if(bigStr && !bigWis)
                System.out.println("BOROMIR!");
            if(!bigStr && bigWis)
                System.out.println("GANDALF!");
            if(!bigStr && !bigWis)
                System.out.println("GOLLUM!");
        }
    }
    
}
