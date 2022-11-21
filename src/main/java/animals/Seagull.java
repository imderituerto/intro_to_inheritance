package animals;

public class Seagull extends Bird{

    public Seagull(String name, int numberOfEggs) {
        super(name,numberOfEggs);
    }

    public String makeNoise(){
        return String.format("%s: Mine, mine, mine!", this.name);
    }
}