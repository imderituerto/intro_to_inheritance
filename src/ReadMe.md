<h1>Polymorphism</h1>

<h2>I. Inheritance</h2>
Inheritance:`extends`

Inherit properties: `super()` // Invokes constructor of Superclass


<h3>Key concepts</h4>

**Overriding:**

`public String makeNoise(){`

`return "Hello, my name is " + this.name + "."`

`return String.format("Hello, my name is %s.", this.name);
}`

**Abstracting:**

An animal is a category, not a specific class. We still want to access the properties and methods in this class though.

"public class Animal" -> "public *abstract* class Animal"

**Polymorphism:**

An object can take its previous forms (superclass) when creating a new variable -- a lion is a lion but also an animal (inheritance).

**Inheritance chain:**

Animal > Bird > Parrot, seagull

"public abstract class Bird extends Animal"

--> Abstract class within the already Abstract class "Animal"

- Access to property in Parent class within subclasses (e.g. this.name): "private" -> "protected"

<h2>II. Polymorphism </h2>

`Animal animal = new Lion()`

`animal = new Parrot()`

<h3>Key concepts</h4>

**Casting:**

`lion.(roar)`

`Animal animal = new Lion()`

`animal.roar()`

    public int countBirdEggs(){
        int totalEggs = 0;
        for(Animal animal : this.birdCage.getAnimals()){
            Bird bird = (Bird) animal;
            totalEggs += bird.getNumberOfEggs();
        }
    }

**Overloading:**

**Abstract methods:**

For methods that are consistently being overridden in child classes.