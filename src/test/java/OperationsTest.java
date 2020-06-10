import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sun.tools.javac.util.List;

/**
 * This is a Operations Test class.
 * 
 * @author Andrea Servín
 *
 */
class OperationsTest {

	private Operations o;

	@BeforeEach
	void beforeEach() {
		o = new Operations(List.of(5, 4, 3, 2, 1));
	}

	@Test
	void constructorNullTest() {
		assertThrows(NullPointerException.class, () -> new Operations(null));
	}

	@Test
	void summationTest() {
		assertEquals(15, o.summation());
	}
	
	@Test
	void productTest() {
		assertEquals(120, o.product());
	}
	
	@Test
	void averageTest() {
		assertEquals(5, o.average());
	}
}
