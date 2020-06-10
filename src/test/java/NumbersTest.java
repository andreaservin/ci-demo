import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * This is a Numbers Test class.
 * 
 * @author Andrea Servín
 *
 */
class NumbersTest {

	private Numbers n;
	private List numbersList;
	
	@Test
	void constructorNullTest() {
		assertThrows(NullPointerException.class, () -> new Numbers(null));
	}

	@Test
	void constructorIllegalArgumentTest() {
		assertThrows(IllegalArgumentException.class, () -> new Numbers(new ArrayList()));
	}
	
	@Test
	void areAllPositiveTest(){
		numbersList = new ArrayList<Integer>(List.of(3, 1, 4));
		n = new Numbers(numbersList);
		assertTrue(n.areAllPositive());
	}
	
	@Test
	void areAllNegativeTest(){
		numbersList = new ArrayList<Integer>(List.of(-3, -1, -4));
		n = new Numbers(numbersList);
		assertTrue(n.areAllNegative());
	}
	
	@Test
	void areAnyEvenElementTest() {
		numbersList = new ArrayList<Integer>(List.of(1, 7, 5, 8, 11));
		n = new Numbers(numbersList);
		assertTrue(n.areAnyEvenElement());
	}
	
	@Test
	void arentAnyEvenElementTest() {
		numbersList = new ArrayList<Integer>(List.of(1, 7, 5, -3, 11));
		n = new Numbers(numbersList);
		assertFalse(n.areAnyEvenElement());
	}	
}
