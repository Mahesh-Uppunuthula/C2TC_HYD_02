import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculationUnitTest {

	@Test
	void test() {
		Calculation c1 = new Calculation();
		int actualValue = c1.add(10, 20);
		assertEquals(30, actualValue);
	}

}
