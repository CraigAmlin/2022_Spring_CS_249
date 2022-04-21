package edu.amlinc.Assign08;

public class GameFileException extends Exception {
    public GameFileException(String s){
        super(s);
    }
    public GameFileException(String s, Exception e){
        super(s,e);
    }
}
