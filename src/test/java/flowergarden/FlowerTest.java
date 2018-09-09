package flowergarden;

import static org.hamcrest.CoreMatchers.is;
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
}
