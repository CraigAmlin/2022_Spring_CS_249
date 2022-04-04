package edu.amlinc.Project04;

public class Shape {
    protected double [] pos = new double[2];

    public Shape(){}

    public Shape(double x, double y){
        setPos(x,y);
    }

    public void setPos(double x, double y){
        setX(x);
        setY(y);
    }
    public void setX(double x){
        pos[0] = x;
    }
    public void setY(double y){
        pos[1] = y;
    }
}
