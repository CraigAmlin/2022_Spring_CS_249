package edu.amlinc.Assign08;

import java.util.*;
public abstract class Creature implements Drawable, Loadable{
    protected int row = 0;
    protected int col = 0;

    protected Creature(){

    }
    protected Creature(int r, int c){
        row = r;
        col = c;
    }

    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    public void setRow(int r){
        row = r;
    }
    public void setCol(int c){
        col = c;
    }

    public void load(Scanner in) throws GameFileException{
        try{
            row = in.nextInt();
            col = in.nextInt();
        }
        catch(Exception e){
            row = 0;
            col = 0;
            throw new GameFileException("Error loading Creature",e);
        }
    }
}
