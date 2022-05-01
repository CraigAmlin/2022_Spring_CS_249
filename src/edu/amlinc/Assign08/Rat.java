package edu.amlinc.Assign08;

public class Rat extends Creature {
    public Rat(){
        super();
    }
    public Rat(int r, int c){
        super(r,c);
    }

    public String toString(){
        return "Rat at " + getRow() + "," + getCol();
    }
    public void draw(CharImage map){
        map.setPos(row,col,'R');
    }
}
