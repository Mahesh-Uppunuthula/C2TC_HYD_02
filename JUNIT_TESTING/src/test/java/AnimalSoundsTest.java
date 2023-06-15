import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalSoundsTest {
	static AnimalSounds a;

	@BeforeAll
	static void config() {
		System.out.println("Before all\n");
		a = new AnimalSounds();
	}

	@BeforeEach
	void init() {
		System.out.println("---------before each---------\n");
	}

	@AfterEach
	void afterEach() {
		System.out.println("---------After each---------\n");
	}

	@AfterAll
	static void close() {
		System.out.println("After all\n");
		System.gc();
	}

	@Test
	void testCat() {
		assertEquals(a.cat(), "meow");
	}

	@Test
	void testDog() {
		assertEquals(a.dog(), "bow");
	}

	@Test
	void testCow() {
		assertEquals(a.cow(), "moo");
	}

}
