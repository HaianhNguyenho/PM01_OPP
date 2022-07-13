package lessoncode.buoi1;

public class OpenClosed {
    public static void main(String[] args) {
        System.out.println("Hello world ");

        Rectangle r =new Rectangle(1, 2);

        CalculateAreas ca = new CalculateAreas();

        System.out.println("Area = "+ca.calArea(r));

        Circle circle = new Circle(2);

        System.out.println("Area = "+ca.calArea(circle));
    }
    
}
