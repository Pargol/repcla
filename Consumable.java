package test328;

public class Consumable implements Collectible {

	int itemID;
	String itemName;

	public Consumable(int i, String string) {
		itemID=i;
		itemName= string;

	}

	@Override
	public void pickup() {
	}

	@Override
	public void drop() {

	}
}
