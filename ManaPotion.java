package test328;

public class ManaPotion extends Consumable {
	int cost;

	public ManaPotion(int i, String string, int j) {
		super(i,string);
		cost=j;
		
	}
	@Override
	public void pickup() {
		System.out.println("Picked up "+ super.itemName + ".");

	}

	@Override
	public void drop() {
		System.out.println("Dropped "+ super.itemName + " gold.");

	}
}
