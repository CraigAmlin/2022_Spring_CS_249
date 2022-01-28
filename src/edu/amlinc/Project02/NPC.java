package edu.amlinc.Project02;

public class NPC {
    private int hp;
    private int str;
    private int def;
    private int spd;
    private char status;

    public NPC(){
        hp = 1;
        str = 1;
        def = 1;
        spd = 1;
        status = 'a';
    }

    public NPC(int h, int s, int d, int q){
        hp = h;
        str = s;
        def = d;
        spd = q;
        status = 'a';
        DeathCheck();
    }

    public void takeDamage(int d){
        hp -= d;
        DeathCheck();
    }

    public void setHealth(int h){
        hp = h;
        DeathCheck();
    }

    private void DeathCheck(){
        if(hp <= 0)
            status = 'd';
    }

    public boolean strengthCheck(int c){
        return (str > c);
    }

    public boolean speedCheck(int c){
        return (spd > c);
    }

    public boolean defenseCheck(int c){
        return (def > c);
    }

    public char checkStatus(){
        return status;
    }
}
