package flowergarden;

public class Flower {
	private int hydration = 100;
	private int soilHealth = 100;

	public int getHydration() {
		return hydration;
	}

	public int getSoilHealth() {
		return soilHealth;
	}

	public void tick() {
		hydration = hydration - 5;
		soilHealth -= 5;
	}

	public void fertilize() {
		soilHealth += 50;
	}

	public void water() {
		hydration += 50;
	}

}
