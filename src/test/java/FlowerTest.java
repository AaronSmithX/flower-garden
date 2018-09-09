import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

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
}
