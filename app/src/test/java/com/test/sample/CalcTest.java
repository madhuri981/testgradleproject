package com.test.sample;

import static org.junit.Assert.*;
import org.junit.Test;



public class CalcTest {
	@Test public void  testAdd() {
		Calc cal = new Calc();
		int res=cal.add(2, 3);
		assertEquals(res, 4);
	}

}
