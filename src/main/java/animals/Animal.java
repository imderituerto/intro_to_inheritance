package animals;

public class Animal {

    private String name;
    private boolean healthy;

    public Animal(String name) {
        this.name = name;
        this.healthy = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public String makeNoise(){
        //return "Hello, my name is " + this.name + "."
        return String.format("Hello, my name is %s.", this.name);
    }

    public String eat(){
        return "Mmm, that was tasty!";
    }
}
