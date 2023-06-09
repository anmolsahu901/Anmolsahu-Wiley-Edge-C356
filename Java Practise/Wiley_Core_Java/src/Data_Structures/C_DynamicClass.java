package Data_Structures;

import java.util.HashMap;
import java.util.Map;

/*
Certainly! Let's consider an example of the "Fibonacci sequence" to illustrate a dynamic programming algorithm in Java. The Fibonacci sequence is a sequence of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1.

Here's an example implementation using dynamic programming to efficiently compute the nth Fibonacci number:
*/

public class C_DynamicClass{
	private static Map<Integer, Integer> memo = new HashMap<>();

	public static void main(String[] args) {
		int n = 10; // Example: Compute the 10th Fibonacci number

		int fibonacciNumber = fibonacci(n);
		System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}

		if (memo.containsKey(n)) {
			return memo.get(n);
		}

		int fibNumber = fibonacci(n - 1) + fibonacci(n - 2);
		memo.put(n, fibNumber);
		return fibNumber;
	}
}


/*
In this example, we use a map (memo) to store previously computed Fibonacci numbers. The dynamic programming approach avoids redundant calculations by storing the results of previously solved subproblems and reusing them.

The fibonacci method takes an integer n as input and returns the nth Fibonacci number. It first checks if the result for n is already present in the memo map. If it is, it directly retrieves the result from the map. Otherwise, it recursively computes the Fibonacci number using the formula fib(n) = fib(n-1) + fib(n-2). After computing the Fibonacci number, it stores the result in the memo map for future reference.

By memoizing previously computed results, we avoid redundant calculations and improve the efficiency of the algorithm. Without using dynamic programming, the Fibonacci sequence can be computationally expensive for large values of n. However, with the dynamic programming approach, the computation becomes much faster as we reuse already calculated results.
This demonstrates how dynamic programming can significantly improve the performance of algorithms by efficiently solving overlapping subproblems and reusing their solutions.
*/
