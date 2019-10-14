package tech.carlosestrada;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ListTests {

	@Test
	public void addAllTest(){
		ArrayList<Integer> a0 = new ArrayList<>();
		a0.add(1);
		a0.add(2);

		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(3);
		a1.add(4);

		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);

		a0.addAll(a1);

		Assert.assertEquals(expected, a0);
	}

	@Test
	public void cloneTest(){
		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);

		ArrayList<Integer> actual = (ArrayList<Integer>) expected.clone();

		Assert.assertEquals(expected,actual);
	}

	@Test
	public void trimToSizeTest(){
		ArrayList<Integer> al = new ArrayList<>(30);
		al.add(1);
		al.add(2);

		al.trimToSize();

		int expected = 2;
		int actual = al.size();

		Assert.assertEquals(expected, actual);
	}
}
