package day22_MultiThreading_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/*
 * Handling Timeout with Future
   You can also set a timeout when waiting for a task to complete using the get(long timeout, TimeUnit unit) method of Future.
   This is useful when tasks might take longer than expected, and you want to limit how long the program waits.
 */
public class _3TimeoutExample {
	public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> future = executorService.submit(new FactorialCalculator(10));

        try {
            // Wait for the result with a timeout of 1 second
            Integer result = future.get(1, TimeUnit.SECONDS);//method blocks for up to 1 second. If the task takes longer, a TimeoutException is thrown.
            System.out.println("Result: " + result);
        } catch (TimeoutException e) {
            System.out.println("Task took too long to complete.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}

/*
Key Points of ExecutorService:

Thread Management: Handles thread creation and task execution for you, allowing easier concurrency management.
Scalability: You can submit tasks without worrying about the underlying thread creation or pool management.
Graceful Shutdown: You can gracefully stop accepting tasks and ensure all submitted tasks are completed.
Timeouts and Futures: Provides mechanisms to retrieve task results asynchronously and apply timeouts to prevent blocking indefinitely.
*/
