package edu.amlinc.Assign06;

public class Huorn extends Tree {
    public Huorn(String n){
        super(n);
    }

    public String toString(){
        return "Huorn " + super.toString();
    }

    public String speak(){
        return "<angry rustling>";
    }
}
