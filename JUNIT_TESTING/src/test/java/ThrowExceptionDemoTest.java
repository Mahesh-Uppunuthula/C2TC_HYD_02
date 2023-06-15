import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

class ThrowExceptionDemoTest {

	static Function<String, String> getError = (functionName) -> {
		String str = "";
		if ("add".equals(functionName)) {
			str = "Addtion Operation failed";
		} else if ("sub".equals(functionName)) {
			str = "Substration Operation failed";
		} else if ("mul".equals(functionName)) {
			str = "Multiplication Operation failed";
		} else if ("div".equals(functionName)) {
			str = "Division Operation failed";
		} else {
			str = "Illegal function call";
		}
		return str;
	};

	@Test
	void testAdd() {
		assertEquals(ThrowExceptionDemo.add(1, 2), 3, getError.apply("add"));
	}

	@Test
	void testSub() {
		assertEquals(ThrowExceptionDemo.sub(1, 2), -1, getError.apply("sub"));
	}

	@Test
	void testMul() {
		assertEquals(ThrowExceptionDemo.mul(1, 2), 2, getError.apply("mul"));
	}

	@Test
	void testDiv() {
		assertEquals(ThrowExceptionDemo.div(1, 1), 1, getError.apply("div"));
		assertThrows(ArithmeticException.class, () -> ThrowExceptionDemo.div(1, 0), "div fail");
	}

	/**
	 * AfterEach, BeforeEach, Executable, AssertNotEqual, AssetThrow, BeforeALL,
	 * AfterAll
	 */
}
