package edu.amlinc.Assign08;

public class Skeleton extends Creature {
    public Skeleton(){
        super();
    }
    public Skeleton(int r, int c){
        super(r,c);
    }

    public String toString(){
        return "Skeleton at " + getRow() + "," + getCol();
    }
    public void draw(CharImage map){
        map.setPos(row,col,'S');
    }
}
