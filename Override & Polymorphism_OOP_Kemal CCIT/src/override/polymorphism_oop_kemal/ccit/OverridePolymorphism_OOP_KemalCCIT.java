
package override.polymorphism_oop_kemal.ccit;

public class OverridePolymorphism_OOP_KemalCCIT {

    public static void main(String[] args) {
       character character1 = new character("Dutch",10,100);
		characterDamage character2 = new characterDamage("John Marston", 20, 100);
              //polymorphism gais
                character character3 = new characterDamage ("Arthur Morgan",30 , 100);
           
                character[] kumpulancharacter = new character[4];
		kumpulancharacter[0] = character1;
		kumpulancharacter[1] = character2;
		kumpulancharacter[2] = character3;
		

		kumpulancharacter[0].display();
		kumpulancharacter[1].display();

		character1.attack(character2);
		character2.attack(character1);

		kumpulancharacter[0].display();
		kumpulancharacter[1].display();
	}
}
    
    

