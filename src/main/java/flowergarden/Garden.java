package flowergarden;

import java.util.ArrayList;

public class Garden {
	
	private ArrayList<Flower> flowers = new ArrayList<Flower>();
	
	public Garden () {
		// Empty constructor - no extra setup
	}
	
	/**
	 * Creates a new Garden with <b>flowerCount</b> flowers in it.
	 * @param flowerCount
	 */
	public Garden(int flowerCount) {
		for (int i = 0; i < flowerCount; i++) {
			this.flowers.add(new Flower());
		}
	}

	public ArrayList<Flower> getFlowers() {
		return flowers;
	}

	public void waterAllFlowers() {
		for (Flower flower : flowers) {
			flower.water();
		}
	}

	public void fertilizeFlower(int index) {
		flowers.get(index).fertilize();
	}

	public void tick() {
		for (Flower flower : flowers) {
			flower.tick();
		}
	}

}
