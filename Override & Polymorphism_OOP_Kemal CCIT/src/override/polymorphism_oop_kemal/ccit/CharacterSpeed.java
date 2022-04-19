
package override.polymorphism_oop_kemal.ccit;

public class CharacterSpeed {
    double defencePower;
    String name;

    // overriding methods
    void display(){
        System.out.println("\nHero Speed");
        System.out.println("archer Name : " + this.name);
        System.out.println("Defence Power : " + this.defencePower);
    }
}

