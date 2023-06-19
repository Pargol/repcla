package test328;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collectible collectible[] = new Collectible[5];
		collectible[0] = new Gold(30);
		collectible[1] = new Gold(15);
		collectible[2] = new HealthPotion(4000, "Minor Health Potion", 10);
		collectible[3] = new HealthPotion(4100, "Large Health Potion", 100);
		collectible[4] = new ManaPotion(5000, "Medium Mana Potion", 50);
		
		for (Collectible coll : collectible) {
			coll.pickup();
			coll.drop();
		}


	}

}
