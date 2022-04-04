package edu.amlinc.Project04;

//import java.util.*;
public class Circle extends Shape {
    private double rad;
    
    public Circle(double x, double y, double r){
        super(x,y);
        rad = r;
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
