package org.learnjava.lesson1;

import junit.framework.TestCase;

public class TaskManagerTest extends TestCase {

	public void testTaskManager(){
		
	}
	
	protected void setUp() throws Exception {
		Doer d1 = new Doer();
		Requester r1 = new Requester();
		Task t1 = new Task();
		Tracker tr1 = new Tracker(0, 0, d1, r1);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
