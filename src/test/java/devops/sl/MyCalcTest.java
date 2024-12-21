package devops.sl;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalcTest {
	MyCalc calc = new MyCalc();
	


	@Test
	public void test_Sum() {
		
//		assertEquals(40, calc.sum(30, 10));
		
	}
	@Test
	public void test_Diif() {
		
		assertEquals(20, calc.diff(30, 10));
		
	}
}