import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class testArrayDemo {

	@Test
	void arrayDemoTest() {
		ArrayDemo ad = new ArrayDemo();
		int[] expVal = ad.returnArray();
		assertArrayEquals(expVal, new int[] { 1, 2, 3 });
	}

}
