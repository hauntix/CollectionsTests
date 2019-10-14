package tech.carlosestrada;


import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class QueueTests {

	@Test
	public void offerTest() {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);

		Assert.assertTrue(queue.offer(3));
	}

	@Test
	public void pollTest(){
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);

		Integer actual = queue.poll();
		Integer exepected = 1;

		int actualSize = queue.size();
		int expectedSize = 1;

		Assert.assertEquals(exepected, actual);
		Assert.assertEquals(expectedSize, actualSize);
	}

	@Test
	public void peekTest() {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);

		Integer actual = queue.peek();
		Integer exepected = 1;

		int actualSize = queue.size();
		int expectedSize = 2;

		Assert.assertEquals(exepected, actual);
		Assert.assertEquals(expectedSize, actualSize);
	}
}
