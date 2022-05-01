package edu.amlinc.Project00;

import java.util.*;
public class Project00 {
    public static void main(String[] args){
        //^ = XOR
        //break breaks out of the current loop
        //continue skips back to the loop condition
        //loops!
        String a;
        final int LOOP_CT = 6;
        for(int i = 0; i < LOOP_CT; i++){
            for(int j = 0; j < i; j++){
                System.out.print('*');
           }
           System.out.println();
        }
        //print!
        System.out.println("Ehh, whatever man.");

        a = """
        In the first age, in the first battle,
        When the shadows first lengthened,
        One stood.

        Burned by the embers of armageddon,
        His soul blistered by the fires of hell
        And tainted beyond ascencion.

        In His ravenous hatred, He found no peace,
        And with boiling blood he scoured the umbral plains,
        Seeking vengance against the dark lords who had wronged Him.

        He wore the crown of the Knight Sentinels,
        And those that tasted the bite of his blade named him

        THE DOOMSLAYER.
        """;
        System.out.println(a);

        //random class!
        int damage;
        Random r = new Random(System.currentTimeMillis());
        int roll = r.nextInt(20) + 1;
        System.out.println("You rolled a " + roll + "!");


        //switch statements!
        switch(roll){
            case 1:
                System.out.println("Nat 1!");
            case 2,3,4:
                System.out.println("Failed check!");
                break;
            case 20:
                System.out.println("Nat 20!");
            default:
                System.out.println("Check passed!");
                break;
        }
        //Alternative Switch Syntax!?!?
        damage = switch(roll){
            case 1,2,3,4 -> 0;
            case 5,6,7 -> 5;
            case 8,9,10 -> 12;
            case 11,12,13,14 -> 18;
            case 15,16,17 -> 24;
            case 18,19 -> 30;
            case 20 -> 45;
            default -> 5;
        };
        System.out.println("Dealt " + damage + " damage to enemy!");
        //alternative to single statement if/else statements!
        boolean recoil = (roll==1) ? true:false;
        if(recoil)
            System.out.println("Taken 12 recoil damage!");
        
    }
}
