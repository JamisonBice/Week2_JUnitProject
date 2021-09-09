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
public class PoolTest1 {

	Pool pool = new Pool(125, 300 , 5 , 4.00);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateRevenue() {
		double revenue = pool.calculateRevenue();
		assertEquals(500, revenue, 0.0);
	}

	@Test
	public void testCloseEntering() {
		assertFalse(pool.closeEntering());
	}
	
	@Test
	public void testCorrectAmountOfLGuards() {
		assertTrue(pool.correctAmtOfLGuards());
	}

}
