package edu.amlinc.Project03;

public class FoodRationer {
    public static void main(String[] args){
        int food, pop, rations, time, day;
        food = 250;
        pop = 5;
        rations = 5;
        day = pop * rations;
        time = food / day;
        System.out.println("Your party will survive " + time + " days with " + food + " pounds of food.");
    }
}
