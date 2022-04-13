package edu.amlinc.Assign03;

import java.util.*;
public class CharGen {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int seed = 0;
        int str, wis;
        String className;
        boolean validClass = true;
        System.out.println("Enter seed:");
        seed = scan.nextInt();
        Random r = new Random(seed);
        do{
            str = r.nextInt(51);
            wis = r.nextInt(51);
            System.out.println("Enter class:");
            className = scan.next();
            className = className.toUpperCase();
            switch(className){
                case "RANGER":
                    str += 50;
                    wis += 50;
                    break;
                case "WIZARD":
                    wis += 50;
                    break;
                case "WARRIOR":
                    str += 50;
                    break;
                case "PEASANT":
                    break;
                default:
                    validClass = false;
            }
            if(validClass){
                System.out.println("CLASS: " + className);
                System.out.println("STRENGTH: " + str);
                System.out.println("WISDOM: " + wis);
            }
            else{
                System.err.println("UNKNOWN CLASS: " + className);
            }
        }while(validClass);
        scan.close();
    }
}
