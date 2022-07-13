package betterdesign;

public class MammalTestDrive {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catNoise.makeMoise();

        Dog dog = new Dog();
        dog.dogNoise.makeMoise();

        System.out.println("Dog says "+dog.makeNoise());
        System.out.println("Cat says "+cat.makeNoise());
    }

    
    
}
