package flowergarden;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class GardenTest {

	@Test
	public void shouldBeAbleToCreateGarden() {
		Garden garden = new Garden();
	}
	
	@Test
	public void shouldBeAbleToGetFlowersInGarden() {
		// Arrange
		Garden garden = new Garden(3);
		// Act
		ArrayList<Flower> flowers = garden.getFlowers();
		// Assert
		assertThat(flowers.size(), is(3));
	}
	
	@Test
	public void shouldBeAbleToWaterAllFlowersAtOnce() {
		// Arrange
		Garden garden = new Garden(2);
		// Act
		int hydrationBefore0 = garden.getFlowers().get(0).getHydration();
		int hydrationBefore1 = garden.getFlowers().get(1).getHydration();
		garden.waterAllFlowers();
		int hydrationAfter0 = garden.getFlowers().get(0).getHydration();
		int hydrationAfter1 = garden.getFlowers().get(1).getHydration();
		// Assert
		assertThat(hydrationAfter0, is(greaterThan(hydrationBefore0)));
		assertThat(hydrationAfter1, is(greaterThan(hydrationBefore1)));
	}
	
	@Test
	public void shouldBeAbleToFertilizeSingleFlower() {
		// Arrange
		Garden garden = new Garden(2);
		// Act
		int soilHealthBefore = garden.getFlowers().get(1).getSoilHealth();
		garden.fertilizeFlower(1);
		int soilHealthAfter = garden.getFlowers().get(1).getSoilHealth();
		// Assert
		assertThat(soilHealthAfter, is(greaterThan(soilHealthBefore)));
	}
	
	@Test
	public void shouldDecreaseAllHyrdationOnTick() {
		// Arrange
		Garden garden = new Garden(2);
		// Act
		int hydrationBefore0 = garden.getFlowers().get(0).getHydration();
		int hydrationBefore1 = garden.getFlowers().get(1).getHydration();
		garden.tick();
		int hydrationAfter0 = garden.getFlowers().get(0).getHydration();
		int hydrationAfter1 = garden.getFlowers().get(1).getHydration();
		// Assert
		assertThat(hydrationAfter0, is(lessThan(hydrationBefore0)));
		assertThat(hydrationAfter1, is(lessThan(hydrationBefore1)));
	}
}
