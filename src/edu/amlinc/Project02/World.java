package edu.amlinc.Project02;

public class World {
    public static void main(String[] args){
        NPC steve = new NPC(100,20,18,12);
        if(!(steve.strengthCheck(12)))
            steve.takeDamage(17);
    }
}
