package edu.cleansweep.controlsystem;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import edu.baseplan.floor.Direction;
import edu.baseplan.floor.FloorNavigationProxy;
import edu.baseplan.floor.Location;

public class VacuumTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testDoClean() {
		
		FloorNavigationProxy floorNavProxy;
		floorNavProxy = new FloorNavigationProxy("TEST_A.cft");
		
		Vacuum vacuum = new Vacuum(floorNavProxy);
		Location location = floorNavProxy.getStaringLocation();
		
		location = floorNavProxy.move(location, Direction.NORTH);
		if(!location.isClean()){
			assertTrue(vacuum.doClean(location));
			assertTrue(vacuum.doClean(location));
			assertTrue(location.isClean());
		}
		
		location = floorNavProxy.move(location, Direction.NORTH);
		if(!location.isClean()){
			assertTrue(vacuum.doClean(location));
			assertTrue(vacuum.doClean(location));
			assertTrue(location.isClean());
		}
		
		location = floorNavProxy.move(location, Direction.NORTH);
		if(!location.isClean()){
			assertTrue(vacuum.doClean(location));
			assertTrue(vacuum.doClean(location));
			assertTrue(location.isClean());
		}
	}
}
