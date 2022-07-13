package lessoncode.buoi1;

public class LiskovSubstitution {
    public static void main(String[] args) {
        System.out.println("Hello world ");

        Rectangle r = new Rectangle(1, 2);

        System.out.println("Area = "+r.calArea());

        Square s = new Square(2);

        System.out.println("Area = "+s.calArea());
    }
    
}
