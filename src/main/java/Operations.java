import java.util.List;

/**
 * This class allows to realized some operations with a list of integers
 * numbers.
 * 
 * @author Andrea Servín
 *
 */
public class Operations {

	private List<Integer> _numbers;

	/**
	 * This is the constructor of this class.
	 * 
	 * @param numbers a list of integers numbers.
	 */
	public Operations(List<Integer> numbers) {
		if (numbers == null) {
			throw new NullPointerException("The list cannot be Null.");
		}
		_numbers = numbers;
	};

	/**
	 * This method returns the sum of all elements of the list.
	 * 
	 * @return the sum of all elements.
	 */
	public int summation() {
		return _numbers.stream().reduce(0, (a, b) -> a + b);
	}

	/**
	 * This method returns the average of all elements of the list.
	 * 
	 * @return the average of all elements.
	 */
	public int average() {
		return summation() / _numbers.size();
	}

	/**
	 * This method return the product of all element of the list.
	 * 
	 * @return the product of all elements.
	 */
	public int product() {
		return _numbers.stream().reduce(1, (a, b) -> a * b);
	}
}
