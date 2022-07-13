package lessoncode.buoi1;

public class Rectangle extends Shape{
    protected double length;

    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length *width;
    }

    public double calArea(){
        double area = this.length * this.width;
        return area;
    }

    
    
}
