package day22_MultiThreading_ExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * The submit() method can accept a Callable task, which allows returning a result. 
 * It returns a Future object that you can use to retrieve the result or handle the completion status of the task.
 */
//Using submit() with Callable and Future
public class _2CallableFutureExample {
	public static void main(String[] args) {
		
		// Step 1: Create an ExecutorService with a single thread
		ExecutorService executorService = Executors.newSingleThreadExecutor();//which creates a thread pool with just one thread.

		// Step 2: Submit a Callable task and get a Future object
		Future<Integer> future = executorService.submit(new FactorialCalculator(5));
		//The FactorialCalculator class implements Callable<Integer>, which allows it to return a result (Integer in this case).

		// Step 3: Get the result from the Future
		try {
			System.out.println("Factorial is: " + future.get()); // Blocks until the task completes
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Step 4: Shutdown the ExecutorService
			executorService.shutdown();
		}
	}
}

class FactorialCalculator implements Callable<Integer> {
	private final int number;

	public FactorialCalculator(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
			Thread.sleep(100); // Simulate time-consuming task
		}
		return result;
	}
}
