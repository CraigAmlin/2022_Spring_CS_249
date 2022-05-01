package edu.amlinc.Assign08;

import java.util.*;
public class Book extends Item {
    protected String skill = "";

    public Book(){
        super();
    }
    public Book(String identity, int v, String s){
        super(identity,v);
        skill = s;
    }

    public String getSkill(){
        return skill;
    }
    public void setSkill(String s){
        skill = s;
    }

    public void read(){
        System.out.println("Skill " + skill + " increased!");
    }
    public String toString(){
        return super.toString() + ", enhances " + skill;
    }

    public void load(Scanner in) throws GameFileException{
        try{
            super.load(in);
            skill = in.next();
        }
        catch (Exception e){
            setID("");
            setValue(0);
            skill = "";
            throw new GameFileException("Error loading Book", e);
        }
    }
}
