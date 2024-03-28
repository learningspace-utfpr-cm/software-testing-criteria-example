package learningspace.swtest.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleFunctionalTest {
	@Test
	public void testEquilateral() {
		Triangle t = new Triangle(3, 3, 3);
		assertEquals(t.getType(), Triangle.EQUILATERAL);
	}

	@Test
	public void testIsosceles() {
		Triangle t = new Triangle(3, 5, 5);
		assertEquals(t.getType(), Triangle.ISOSCELES);
	}

	@Test
	public void testScalene() {
		Triangle t = new Triangle(3, 4, 5);
		assertEquals(t.getType(), Triangle.SCALENE);
	}
}
