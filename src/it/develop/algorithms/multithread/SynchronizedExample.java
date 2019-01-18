package it.develop.algorithms.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SynchronizedExample {
	private int count = 0;

	synchronized private void increment() {
		count = count + 1;
	}

	public static void main(String[] args) {
		SynchronizedExample example = new SynchronizedExample();
		ExecutorService executor = Executors.newFixedThreadPool(2);
		IntStream.range(0, 10000).forEach(i -> executor.submit(example::increment));
		ConcurrentUtils.stop(executor);
		System.out.println(example.count); // 10000
	}
}
