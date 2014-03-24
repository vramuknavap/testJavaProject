package org.learnjava.lesson1;

import junit.framework.TestCase;

public class TrackerTest extends TestCase {
	
	public void testTracker(){
		Doer d1 = new Doer();
		Requester r1 = new Requester();
		Tracker T1 = new Tracker(10, 5, d1, r1);
		assertEquals(10, T1.totalTasks);
		assertEquals(5, T1.coveredTasks);
	}

}
