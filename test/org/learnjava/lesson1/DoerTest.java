package org.learnjava.lesson1;

import junit.framework.TestCase;

public class DoerTest extends TestCase {

	public void testDoer() {
		Doer d1 = new Doer ();
		DoerTest.assertEquals("Unknown" , d1.getDoerName());
		assertEquals("Friend", d1.getRelation());
	}

	public void testSetDoerName() {
		Doer d2 = new Doer();
		d2.setDoerName("AnyName");
		assertEquals("AnyName", d2.getDoerName());
	}

	public void testSetRelation() {
		Doer d3 = new Doer();
		d3.setRelation("Family");
		assertEquals("Family", d3.getRelation());
	}

	public void testToString() {
		Doer d4 = new Doer();
		d4.setDoerName("Vittalad");
		d4.setRelation("Self");
		
		String testString = "Vittalad Self";
		assertEquals(testString, d4.toString());
		
	}
}
