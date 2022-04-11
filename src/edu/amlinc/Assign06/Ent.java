package edu.amlinc.Assign06;

public class Ent extends Tree {
    public Ent(String n){
        super(n);
    }

    public String toString(){
        return "Ent " + super.toString();
    }

    
    public String speak(){
        return "HOOM";
    }
    
}
