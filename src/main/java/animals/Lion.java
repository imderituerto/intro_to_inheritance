package animals;

import javax.xml.namespace.QName;

// Takes over "type" property in animal class

public class Lion extends Animal{

    private boolean canWaitToBeKing;

    public Lion(String name, boolean canWaitToBeKing){
        super(name);
        this.canWaitToBeKing = canWaitToBeKing;
    }

    //OVERRIDING A SUPERCLASS METHOD
    public String makeNoise(){
    return "Roar";
    }

}
