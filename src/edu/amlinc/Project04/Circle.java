package edu.amlinc.Project04;

//import java.util.*;
public class Circle {
    private double rad;
    private double [] pos = new double[2];
    
    public Circle(double x, double y, double r){
        rad = r;
        pos[0] = x;
        pos[1] = y;
    }
    public Circle(){
        rad = 0.0;
        pos[0] = 0.0;
        pos[1] = 0.0;
    }
    public Circle(Circle c){
        rad = c.getRad();
        pos[0] = c.getX();
        pos[1] = c.getY();
    }

    public void setRad(double r){
        rad = Math.max(r, 0);
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
    public double getRad(){
        return rad;
    }
    public double getX(){
        return pos[0];
    }
    public double getY(){
        return pos[1];
    }
    public double getArea(){
        return  Math.PI*rad*rad;
    }
}
