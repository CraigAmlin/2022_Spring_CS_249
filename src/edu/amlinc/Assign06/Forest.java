package edu.amlinc.Assign06;

import java.util.*;
public class Forest {
    ArrayList <Giant> daList = new ArrayList<>();

    public Giant createGiant(String name, String type){
        if(name.equals(""))
            return null;
        switch(type){
            case"GIANT":
                return new Giant(name);
            case"TROLL":
                return new Troll(name);
            case"TREE":
                return new Tree(name);
            case"ENT":
                return new Ent(name);
            case"HUORN":
                return new Huorn(name);
            default:
                return null;
        }
    }

    public boolean addGiant(String name, String type){
        Giant g = createGiant(name, type);
        if(g == null){
            return false;
        }
        else{
            daList.add(g);
            return true;
        }
    }

    public Giant getGiant(int index){
        if((index >= 0) && (index < daList.size()))
            return daList.get(index);
        else
            return null;
    }

    public void printAllGiants(){
        System.out.println("ALL GIANTS:");
        for (Giant g : daList) {
            System.out.println("- " + g.toString());
        }
    }

    public void printAllTrees(){
        System.out.println("ALL TREES:");
        for (Giant g : daList) {
            if(g instanceof Tree t)
                System.out.println("- " + t.toString() + ": " + t.speak());
        }
    }
    
    public void printAllTrolls(){
        System.out.println("ALL TROLLS:");
        for (Giant g : daList) {
            if(g instanceof Troll t)
                System.out.println("- " + t.toString() + ": " + t.cook());
        }
    }
}
