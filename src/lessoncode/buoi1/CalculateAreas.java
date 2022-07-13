package lessoncode.buoi1;

public class CalculateAreas {
    Shape[] shapes;
    double sumTotal = 0;

    private double area;

    public CalculateAreas(){

    }

    public double calArea(Rectangle r){
        area = r.length * r.width;

        return area;
    }
    public double calArea(Shape s){
        area = s.getArea();
        return area;
    }

    public CalculateAreas(Shape[] shapes) {
        this.shapes = shapes;
    }

    public double sumAreas(){

        sumTotal = 0;
        for(int i = 0; i <shapes.length; i++){
            sumTotal = sumTotal + shapes[i].calArea();
        }
        return sumTotal;
    }

    public void output(){
        System.out.println("Total of all areas = "+sumTotal);
    }
    
    
}
