package tech.carlosestrada;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class ArrayDequeTests {

	@Test
	public void addTests() {
		Deque<Integer> arrayDeque = new ArrayDeque<>();
		arrayDeque.addFirst(2);
		arrayDeque.addFirst(1);
		arrayDeque.addLast(3);

//		Deque<Integer> eDeque = new ArrayDeque<>();
//		eDeque.add(1);
//		eDeque.add(2);
//		eDeque.add(3);

		Integer expected = 3;
		Integer actual = arrayDeque.size();

		Assert.assertEquals(expected,actual);

		expected = 1;
		actual = arrayDeque.peekFirst();

		Assert.assertEquals(expected, actual);

//		Assert.assertSame(eDeque, arrayDeque);
	}

	@Test
	public void removeTests() {
		Deque<String> deque = new ArrayDeque<>();
		deque.add("A");
		deque.removeFirst();

		int actual = deque.size();
		int expected = 0;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void pollTests(){
		Deque<String> deque = new ArrayDeque<>();
		deque.addFirst("A");
		deque.addLast("B");
		deque.addLast("C");

		String expected = "A";
		String actual = deque.pollFirst();

		int expectedSize = 2;
		int actualSize = deque.size();

		Assert.assertEquals(expected, actual);
		Assert.assertEquals(expectedSize, actualSize);
	}


}
