package disolution;

public class Mammal {

    private MakingNoise speaker;

    public Mammal(){}

    public Mammal(MakingNoise speaker) {
        this.speaker = speaker;
    }

    public MakingNoise getSpeaker() {
        return speaker;
    }

    public void setSpeaker(MakingNoise speaker) {
        this.speaker = speaker;
    }

    

    
}
