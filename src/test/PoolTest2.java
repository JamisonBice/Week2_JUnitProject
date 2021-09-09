package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Pool;

/**
 * @author Jamison Bice - jdbice
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
public class PoolTest2 {

	Pool pool = new Pool(324, 300 , 11 , 6.75);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateRevenue() {
		double revenue = pool.calculateRevenue();
		assertEquals(2187, revenue, 0.0);
	}

	@Test
	public void testCloseEntering() {
		assertTrue(pool.closeEntering());
	}
	
	@Test
	public void testCorrectAmountOfLGuards() {
		assertFalse(pool.correctAmtOfLGuards());
	}

}
