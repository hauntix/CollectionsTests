package tech.carlosestrada;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class SetTests {

	@Test
	public void testAdd(){
		Person person = new Person("Carly", 1996);

		HashSet<Person> personHashSet = new HashSet<>();

		personHashSet.add(person);

		Assert.assertTrue(personHashSet.contains(person));
	}

	@Test
	public void testClear(){
		Person person = new Person("Carly", 1996);

		HashSet<Person> personHashSet = new HashSet<>();

		personHashSet.add(person);
		personHashSet.clear();

		Assert.assertTrue(personHashSet.isEmpty());
	}

	@Test
	public void testRemove(){
		Person person = new Person("Carly", 1996);

		HashSet<Person> personHashSet = new HashSet<>();

		personHashSet.add(person);
		personHashSet.remove(person);

		Assert.assertTrue(personHashSet.isEmpty());
	}
}
