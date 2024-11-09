package day22_MultiThreading_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * The ExecutorService in Java is part of the java.util.concurrent package, which provides a framework for managing a pool of threads efficiently. 
 * Instead of manually creating and managing threads, 
 * you can use an ExecutorService to handle thread management for you, allowing for more scalable and maintainable concurrency code.
 */

//Using ExecutorService to Run Multiple Tasks

public class _1ExecutorServiceExample {
	
	public static void main(String[] args) {
		
		// Step 1: Create an ExecutorService with a fixed thread pool of 3 threads. This means up to 3 tasks can run concurrently
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		// Step 2: Submit tasks for execution
		for (int i = 1; i <= 5; i++) {
			Runnable worker = new WorkerThread("Task " + i);
			executorService.execute(worker); // Submit task to the thread pool
		}

		// Step 3: Shut down the ExecutorService
		executorService.shutdown(); // Prevents new tasks from being submitted

		// Await termination of all tasks
		while (!executorService.isTerminated()) {
			// Busy wait until all tasks are finished
		}

		System.out.println("All tasks are finished!");
	}
}

class WorkerThread implements Runnable {
	private final String taskName;

	public WorkerThread(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is executing " + taskName);
		try {
			// Simulate task execution time
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(taskName + " is completed by " + Thread.currentThread().getName());
	}
}
