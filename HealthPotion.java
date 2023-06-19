package test328;

public class HealthPotion extends Consumable  {
	
	int cost;

	public HealthPotion(int i, String string, int j) {
		super(i,string);
		cost = i;
		
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
