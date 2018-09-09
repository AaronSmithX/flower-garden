package flowergarden;

import java.util.ArrayList;

public class Garden {
	
	private ArrayList<Flower> flowers = new ArrayList<Flower>();
	
	public Garden() {
		this.flowers.add(new Flower());
		this.flowers.add(new Flower());
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

}
