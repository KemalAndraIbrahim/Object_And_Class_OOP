package override.polymorphism_oop_kemal.ccit;


public class character {
    String name;
	double attackPower, health;

	character(String nameInput, double attackInput, double healthInput){
		this.name = nameInput;
		this.attackPower = attackInput;
		this.health = healthInput;
	}


	void attack(character enemy){
		System.out.println("\n" + this.name + " attack " + enemy.name);
		enemy.takeDamage(this.attackPower);
	}

	void takeDamage(double damage){
		System.out.println(this.name + " receive damage " + damage);
		this.health = this.health - damage;
	}

	void display(){
	System.out.println("=== Red Dead Redemption 2 Prologue Mission===" );	
            System.out.println("\nName: " + this.name);
		System.out.println("Health: " + this.health);
		System.out.println("Power: " + this.attackPower);
	}
}
