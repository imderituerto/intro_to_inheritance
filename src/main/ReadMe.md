
**Overriding:**

public String makeNoise(){

return "Hello, my name is " + this.name + "."

return String.format("Hello, my name is %s.", this.name);
}**

**Abstracting:**

An animal is a category, not a specific class. We still want to access the properties and methods in this class though.

public class Animal -> public *abstract* class Animal

**Polymorphism:**

An object can take its previous forms (superclass) when creating a new variable -- a lion is a lion but also an animal (inheritance).