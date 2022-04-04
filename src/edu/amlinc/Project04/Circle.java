package edu.amlinc.Project04;


//import java.util.*;
public class Circle extends Shape {
    private double rad;
    
    public Circle(){}

    public void setRad(double r){
        rad = Math.max(r, 0);
    }

    public Circle(double x, double y, double r){
        super(x,y);
        rad = r;
    }
    
    public Circle(Circle c){
        rad = c.getRad();
        pos[0] = c.getX();
        pos[1] = c.getY();
    }
    
    public double getRad(){
        return rad;
    }
    public double getArea(){
        return  Math.PI*rad*rad;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Circle c){
            final double ERROR = 1e-15;
            if(c.rad - this.rad < ERROR)
                return ((Shape)this).equals(obj);
            else
                return false;
        }
        else
            return false;
    }
}
