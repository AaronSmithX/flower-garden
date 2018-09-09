package flowergarden;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import flowergarden.Flower;

public class FlowerTest {

	@Test
	public void shouldBeAbleToCreateFlower() {
		Flower flower = new Flower();
	}

	@Test
	public void shouldBeAbleToGetHydration100FromNewFlower() {
		// Arrange
		Flower flower = new Flower();
		// Act
		int hydration = flower.getHydration();
		// Assert
		assertThat(hydration, is(100));
	}

	@Test
	public void shouldDecreaseFlowerHydrationOnTick() {
		// Arrange
		Flower flower = new Flower();
		// Act
		int hydrationBefore = flower.getHydration();
		flower.tick();
		int hydrationAfter = flower.getHydration();
		// Assert
		assertThat(hydrationAfter, lessThan(hydrationBefore));
	}
	
	@Test
	public void shouldBeAbleToGetSoilHealth100FromNewFlower() {
		// Arrange
		Flower flower = new Flower();
		// Act
		int soilHealth = flower.getSoilHealth();
		// Assert
		assertThat(soilHealth, is(100));
	}
	
	@Test
	public void shouldDecreaseSoilHealthOnTick() {
		// Arrange
		Flower flower = new Flower();
		// Act
		int soilHealthBefore = flower.getSoilHealth();
		flower.tick();
		int soilHealthAfter = flower.getSoilHealth();
		// Assert
		assertThat(soilHealthAfter, lessThan(soilHealthBefore));
	}
	
	@Test
	public void shouldIncreaseHydrationWhenWatered() {
		// Arrange
		Flower flower = new Flower();
		// Act
		int hydrationBefore = flower.getHydration();
		flower.water();
		int hydrationAfter = flower.getHydration();
		// Assert
		assertThat(hydrationAfter, is(greaterThan(hydrationBefore)));
	}
	
	@Test
	public void shouldIncreaseSoilHealthWhenFertilized() {
		// Arrange
		Flower flower = new Flower();
		// Act
		int soilHealthBefore = flower.getSoilHealth();
		flower.fertilize();
		int soilHealthAfter = flower.getSoilHealth();
		// Assert
		assertThat(soilHealthAfter, is(greaterThan(soilHealthBefore)));
	}
}
