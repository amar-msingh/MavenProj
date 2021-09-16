import static org.junit.Assert.*;
import com.lti.*;

import org.junit.Test;

import com.lti.MyCalculator;

public class MyCalculatorTest {

	@Test
	public void test() {
		assertEquals(10, new MyCalculator().getSum(5, 5));
	}
	@Test
	public void test1() {
		assertEquals(5, new MyCalculator().getSum(2, 3));
	}
	@Test
	public void test2() {
		assertEquals(5, new MyCalculator().getDiff(10, 5));
	}
	@Test
	public void test3() {
		assertEquals(0, new MyCalculator().getDiff(5, 5));
	}

}
