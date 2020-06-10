import java.util.List;

/**
 * This class give some information about what kind of numbers are in a list.
 * 
 * @author Andrea Servín
 *
 */
public class Numbers {
	private List<Number> _numbers = null;

	public Numbers(List<Number> numbers) {
		if (numbers == null) {
			throw new NullPointerException("The list cannot be null.");
		} else if (numbers.isEmpty()) {
			throw new IllegalArgumentException("The list cannot be empty.");
		}
		_numbers = numbers;
	};

	/**
	 * This method says if all elements are positives.
	 * 
	 * @return true if all elements are positives, false if not.
	 */
	public boolean areAllPositive() {
		return _numbers.stream().allMatch(n -> (Integer) n > 0);
	}

	/**
	 * This method says if all elements are negatives.
	 * 
	 * @return true if all elements are negatives, false if not.
	 */
	public boolean areAllNegative() {
		return _numbers.stream().allMatch(n -> (Integer) n < 0);
	}

	/**
	 * This method say if exist any even element.
	 * 
	 * @return true if exist any even element, false if not.
	 */
	public boolean areAnyEvenElement() {
		return _numbers.stream().anyMatch(n -> ((Integer) n % 2 == 0));
	}
}
