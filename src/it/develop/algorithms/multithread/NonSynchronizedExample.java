package it.develop.algorithms.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class NonSynchronizedExample {
	private int count = 0;

	private void increment() {
		count = count + 1;
	}

	public static void main(String[] args) {
		NonSynchronizedExample example = new NonSynchronizedExample();
		ExecutorService executor = Executors.newFixedThreadPool(2);
		IntStream.range(0, 10000).forEach(i -> executor.submit(example::increment));
		ConcurrentUtils.stop(executor);
		System.out.println(example.count); // 9965
	}
}
