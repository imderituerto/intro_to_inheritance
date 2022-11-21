<h1>Inheritance</h1>

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