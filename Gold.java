package test328;

public class Gold implements Collectible {

	int value;

	public Gold(int i) {
		value = i;
	}

	@Override
	public void pickup() {
		System.out.println("Picked up " + value + " gold.");

	}

	@Override
	public void drop() {
		System.out.println("Dropped " + value + " gold.");

	}
}
