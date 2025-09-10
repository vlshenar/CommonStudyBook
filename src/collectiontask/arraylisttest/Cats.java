package collectiontask.arraylisttest;

public class Cats extends Pets {

    //constructors
    public Cats(String name) {
        this.name = name;
        this.voice = "Meou!";
    }

    public Cats(String name, String voice) {
        this(name);
        this.voice = voice;
    }

    public Cats() {
        this("SomeCat", "PurrMeouPurr!");
    }

    //toString
    public String toString() {
        return name + " " + voice;
    }

    //getting voice
    @Override
    public String getVoice() {
        return voice;
    }
}
