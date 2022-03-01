package edu.amlinc.Assign04;

import java.util.*;
public class PrintShop {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        BusinessCard card = askForBusinessCardData(scan);
        System.out.println("Your new business card:");
        System.out.println(card);
    }

    public static BusinessCard askForBusinessCardData(Scanner in){
        String bus;
        char edge;
        String[] lines = new String [4];
        System.out.println("Enter business name:");
        bus = in.nextLine();
        System.out.println("Enter boundary character:");
        lines[0] = in.nextLine();
        edge = lines[0].charAt(0);
        System.out.println("Enter slogan (max 4 lines):");
        lines[0] = in.nextLine();
        lines[1] = in.nextLine();
        lines[2] = in.nextLine();
        lines[3] = in.nextLine();
        BusinessCard card = new BusinessCard(bus, lines, edge);
        return card;
    }
}
