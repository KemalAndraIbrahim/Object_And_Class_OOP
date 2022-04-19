
package override.polymorphism_oop_kemal.ccit;

public class characterDamage extends character{
    String type = "the Schofield Revolver ";

	characterDamage(String nameInput, double attackInput, double healthInput){
		super(nameInput, attackInput, healthInput);
	}

	@Override
	void display(){
		super.display();
		System.out.println(" Gun Type : " + this.type);
	}

	@Override
	void takeDamage(double damage){
		System.out.println(this.name + " receive half damage from gunshot " + damage + " -> " + 0.5*damage);
		this.health = this.health - 0.5*damage;
	}
}

