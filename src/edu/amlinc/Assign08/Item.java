package edu.amlinc.Assign08;

import java.util.*;
public class Item implements Loadable {
    protected String ID = "";
    protected int value = 0;

    public Item(){

    }
    public Item(String identity, int v){
        ID = identity;
        value = v;
    }

    public String getID(){
        return ID;
    }
    public int getValue(){
        return value;
    }
    public void setID(String identity){
        ID = identity;
    }
    public void setValue(int v){
        value = v;
    }

    public String toString(){
        String out = ID + " with value " + value;
        return out;
    }

    public void load(Scanner in) throws GameFileException{
        try{
            ID = in.next();
            value = in.nextInt();
        }
        catch (Exception e){
            ID = "";
            value = 0;
            throw new GameFileException("Error loading Item", e);
        }
    }
}
