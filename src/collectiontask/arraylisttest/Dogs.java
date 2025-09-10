package collectiontask.arraylisttest;

public class Dogs extends Pets {

    public Dogs(String name) {
        this.name = name;
        this.voice = "Woof!";
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
