package lessoncode.buoi1;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("Hello world ");

        Circle circle = new Circle(1);

        Shape[] shapeArray = new Shape[1];
        shapeArray[0] = circle;

        CalculateAreas calculateAreas = new CalculateAreas(shapeArray);

        CalculateAreas sum = new CalculateAreas(shapeArray);

        OutputAreas outputAreas = new OutputAreas(sum.sumAreas());

        outputAreas.console(); //output to console
        outputAreas.HTML(); //output to HTMl

        calculateAreas.sumAreas();

        calculateAreas.output();

        
    }
    
}
