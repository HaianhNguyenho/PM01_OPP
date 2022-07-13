package lessoncode.buoi1;

public class Square extends Rectangle{


    private double side;

    public Square(double s){
        super(s,s);
    }
   
    public double calArea(){
        area = side*side;
        return area;
    }
    
}
