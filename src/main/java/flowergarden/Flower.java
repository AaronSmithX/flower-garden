package flowergarden;

public class Flower {
	private int hydration = 100;

	public int getHydration() {
		return hydration;
	}

	public void tick() {
		hydration = hydration - 5;
	}

}
