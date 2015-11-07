package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// START TESTING LANDING PAGE LINKS FOR ALL THREE CONDITIONS
	@Test
	public void WT_LP_01_01_Positive() {
		assertEquals("NOT_SAME_STRING", "Testing Junit 4", core.App.a);
	}

	@Test
	public void WT_LP_01_02_Negative() {
		assertEquals("NOT_SAME_STRING", "TESTING TestNG 6", core.App.a);
	}

	@Ignore
	@Test
	public void WT_LP_01_03_Ignored() {
		assertEquals("NOT_SAME_STRING", "TESTING JUnit 3", core.App.a);
	}

	@Test
	public void WT_LP_02_01_Positive() {
		assertSame("NOT_SAME_INTEGER", 100, core.App.b);
	}

	@Test
	public void WT_LP_02_02_Negative() {
		assertSame("NOT_SAME_INTEGER", 10, core.App.b);
	}

	@Ignore
	@Test
	public void WT_LP_02_03_Ignored() {
		assertSame("NOT_SAME_INTEGER", 101, core.App.b);
	}

	@Test
	public void WT_LP_03_01_False_Positive() {
		assertFalse("Boolean is False", core.App.c);
	}

	@Test
	public void WT_LP_03_02_False_Negative() {
		assertFalse("Boolean is False", core.App.d);
	}

	@Test
	public void WT_LP_04_01_True_Positive() {
		assertTrue("Boolean is True", core.App.d);
	}

	@Test
	public void WT_LP_04_02() {
		assertTrue("Boolean is True", core.App.c);
	}
}
