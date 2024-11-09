package day25_ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

//How to use a ConcurrentHashMap in a multithreaded environment. The example shows how different threads can safely read from and write to the map concurrently.

/*
 * Key Points about ConcurrentHashMap:
Thread-Safe: Allows concurrent access by multiple threads without external synchronization.
No Null Keys or Values: ConcurrentHashMap does not allow null keys or values. Attempting to insert a null key or value will throw a NullPointerException.
Better Performance: Unlike Collections.synchronizedMap(), which locks the entire map for every operation, ConcurrentHashMap uses a more granular locking mechanism (segment-based locking), which improves performance in high-concurrency scenarios.
Atomic Operations: Provides atomic operations like putIfAbsent(), replace(), and computeIfAbsent() for safe, concurrent updates.
 */

public class ConcurrentHashMapExample {
	public static void main(String[] args) throws InterruptedException {
        // Creating a ConcurrentHashMap
		// This creates a new ConcurrentHashMap with String keys and Integer values.
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        // Adding some initial entries to the map
        concurrentMap.put("Ramya", 100);
        concurrentMap.put("Aadhvi", 200);
        concurrentMap.put("Srihari", 300);

        // Printing initial state of the map
        System.out.println("Initial Map: " + concurrentMap);

        // Creating two threads that will modify the map concurrently
        Thread writerThread1 = new Thread(new MapWriter(concurrentMap, "Ramya", 150));
        Thread writerThread2 = new Thread(new MapWriter(concurrentMap, "Rama", 400));
        
        // Creating a reader thread to read the map concurrently
        Thread readerThread = new Thread(new MapReader(concurrentMap));

        // Start the threads
        writerThread1.start();
        writerThread2.start();
        readerThread.start();

        // Wait for all threads to finish
        writerThread1.join();
        writerThread2.join();
        readerThread.join();

        // Final state of the map
        System.out.println("Final Map: " + concurrentMap);
    }
}

// A class that writes/updates the ConcurrentHashMap
class MapWriter implements Runnable {
    private ConcurrentHashMap<String, Integer> map;
    private String key;
    private Integer value;

    public MapWriter(ConcurrentHashMap<String, Integer> map, String key, Integer value) {
        this.map = map;
        this.key = key;
        this.value = value;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " updating " + key + " to " + value);
        map.put(key, value);  // Update the map with a new value
    }
}

// A class that reads the ConcurrentHashMap
class MapReader implements Runnable {
    private ConcurrentHashMap<String, Integer> map;

    public MapReader(ConcurrentHashMap<String, Integer> map) {
        this.map = map;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " reading map: " + map);
    }
}
