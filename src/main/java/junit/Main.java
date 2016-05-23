package junit;

public class Main {

	public static void main(String[] args) {
		
		HelloJUnit hello = new HelloJUnit();
		System.out.println(hello.hello());
		for (int n = 0; n < Integer.MAX_VALUE; n++) {
			System.out.println(String.format("fib(%s) = %s", n, Fibo.fib(n)));
		}

	}

}
