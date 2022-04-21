package edu.amlinc.Project04;

public abstract class Shape {
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
    public double getX(){
        return pos[0];
    }
    public double getY(){
        return pos[1];
    }

    abstract public double getArea();

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Shape s){
            final double ERROR = 1e-15;
            if(s.pos[0] - this.pos[0] < ERROR && s.pos[1] - this.pos[1] < ERROR)
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
