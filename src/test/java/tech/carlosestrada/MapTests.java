package tech.carlosestrada;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapTests {

	@Test
	public void containsTest(){
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 1);
		hashMap.put("B", 2);

		Assert.assertTrue(hashMap.containsKey("A"));

		Assert.assertTrue(hashMap.containsValue(2));
	}

	@Test
	public void keySetTest() {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 1);
		hashMap.put("B", 2);

		Set<String> expectedSet = new HashSet<>();
		expectedSet.add("A");
		expectedSet.add("B");

		Set<String> actualSet = hashMap.keySet();

		Assert.assertEquals(expectedSet,actualSet);
	}

	@Test
	public void valuesTest() {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 1);
		hashMap.put("B", 2);

		Integer[] expected = new Integer[]{1,2};

		Integer[] actual = hashMap.values().toArray(new Integer[0]);


		Assert.assertArrayEquals(expected, actual);
	}
}
