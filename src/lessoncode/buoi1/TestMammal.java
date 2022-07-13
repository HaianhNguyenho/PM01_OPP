package lessoncode.buoi1;

public class TestMammal {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Mammal cat = new Cat();
        Mammal dog = new Dog1();

        System.out.println("Cat says "+cat.makeNoise());

        System.out.println("Dog says "+dog.makeNoise());
    }
    
}
