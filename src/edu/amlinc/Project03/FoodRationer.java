package edu.amlinc.Project03;

import java.util.*;

public class FoodRationer {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int food, pop, rations, time, day;
        food = 250;
        pop = 5;
        rations = 5;
        System.out.println("How much food will you bring(lbs)?");
        food = scan.nextInt();
        System.out.println("How many people are in your party?");
        pop = scan.nextInt();
        day = pop * rations;
        time = food / day;
        System.out.println("Your party will survive " + time + " days with " + food + " pounds of food.");
        scan.close();
    }
}
