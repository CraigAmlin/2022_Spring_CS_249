package edu.amlinc.Assign07;

public class TreasureMapException extends Exception {
    public TreasureMapException(String s){
        super(s);
    }

    public TreasureMapException(String s, Exception e){
        super(s,e);
    }
}
