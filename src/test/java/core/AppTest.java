package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass method will be executed before first test method starts");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass method will be executed after last test method starts ");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before method will be executed before every test method starts ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After method will be executed before every test method starts ");
	}
// START TESTING LANDING PAGE LINKS FOR ALL THREE CONDITIONS
	@Test
	public void WT_LP_01_01() {
		System.out.println("Test_01_assertEquals_Positive");
	}
	@Test
	public void WT_LP_01_02() {
		System.out.println("Test_02_assertEquals_Negative");
	}
	@Test
	public void WT_LP_01_03() {
		System.out.println("Test_03_assertEquals_Ignored");
	}
	@Test
	public void WT_LP_02_01() {
		System.out.println("Test_04_assertSame_Positive");
	}
	@Test
	public void WT_LP_02_02() {
		System.out.println("Test_05_assertSame_Negative");
	}
	@Test
	public void WT_LP_02_03() {
		System.out.println("Test_06_assertSame_Ignored");
	}
	@Test
	public void WT_LP_03_01() {
		System.out.println("Test_07_assertFalse_Positive");
	}
	@Test
	public void WT_LP_03_02() {
		System.out.println("Test_08_assertFalse_Negative");
	}
	@Test
	public void WT_LP_04_01() {
		System.out.println("Test_09_assertTrue_Positive");
	}
	@Test
	public void WT_LP_04_02() {
		System.out.println("Test_10_assertTrue_Negative");
	}
}
