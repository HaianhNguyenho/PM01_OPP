package disolution;

public class MammalTestDrive {
    public static void main(String[] args) {
        //da hinh
        DogNoise dogNoise = new DogNoise();

        Mammal dog = new Mammal(dogNoise);

        dog.getSpeaker().makingNoise();

        CatNoise catNoise = new CatNoise();
        Mammal cat = new Mammal();
        cat.setSpeaker(catNoise);
        cat.getSpeaker().makingNoise();

        
    }
    
}
