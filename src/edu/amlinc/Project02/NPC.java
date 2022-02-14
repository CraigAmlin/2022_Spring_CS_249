package edu.amlinc.Project02;

public class NPC {
    private int hp;
    private int str;
    private int def;
    private int spd;
    private Status stat = Status.DEAD;

    public NPC(){
        hp = 1;
        str = 1;
        def = 1;
        spd = 1;
        stat = Status.ALIVE;
    }

    public NPC(int h, int s, int d, int q){
        hp = h;
        str = s;
        def = d;
        spd = q;
        stat = Status.ALIVE;
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
            stat = Status.DEAD;
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

    public Status checkStatus(){
        return stat;
    }

}
