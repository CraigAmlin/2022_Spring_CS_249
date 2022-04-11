package edu.amlinc.Assign06;

public class Tree extends Giant {
    Tree(String n){
        super(n);
    }

    public String toString(){
        return super.toString() + " of the trees";
    }

    public String speak(){
        return "<rustling>";
    }
}
