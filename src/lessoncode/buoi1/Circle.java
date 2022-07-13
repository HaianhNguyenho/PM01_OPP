package lessoncode.buoi1;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calArea(){

        double area = 3.14 * (radius*radius);

        return area;
    }

    public double getArea(){
        return radius*radius*3.14;
    }
    
}
