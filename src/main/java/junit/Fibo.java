package junit;

public class Fibo {
	
	/**
	 * Computes the Fibonacci sequence numbers.
	 * @param n, 0 or positive integer
	 * @return int, the n-th number in the Fibonnaci sequence
	 * @throws IllegalArgumentException if n < 0
	 * @throws IllegalArgumentException if fib(n) > Integer.MAX_VALUE
	 */
	public static int fib(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n must be positive");
		}
		if (n > 46) {
			throw new IllegalArgumentException("n is too big, must be <= 46");
		}
		if (n == 0) {
			return 0;
		}
		if (n <= 2) {
			return 1;
		}
		return fib(n-2) + fib(n-1);
	}

}
