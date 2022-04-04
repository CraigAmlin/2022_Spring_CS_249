package edu.amlinc.Project04;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(){}

    public Rectangle(double l, double w){
        length = l;
        width = w;
    }
    public Rectangle(double x, double y, double l, double w){
        super(x,y);
        length = l;
        width = w;
    }

    public Rectangle(Rectangle r){
        length = r.getLength();
        width = r.getWidth();
        pos[0] = r.getX();
        pos[1] = r.getY();
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return length*width;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Rectangle r){
            final double ERROR = 1e-15;
            if((r.length - this.length < ERROR && r.width - this.width < ERROR) || (r.width - this.length < ERROR && r.length - this.width < ERROR))
                return ((Shape)this).equals(obj);
            else
                return false;
        }
        else
            return false;
    }
}
