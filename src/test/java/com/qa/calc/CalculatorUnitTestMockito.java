package com.qa.calc;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorUnitTestMockito {
	
	@Mock
	private Adder adder;
	
	@Mock
	private Subtractor subtractor;
	
	@Mock
	private Multiplier multipler;
	
	@Mock
	private Divider divider;
	
	@InjectMocks
	private Calculator calculator;
	
	@Test
	public void addTest() {
		Mockito.when(adder.add(5, 5)).thenReturn(10);
		
		assertEquals(10, calculator.add(5, 5));
		
		verify(adder, times(1)).add(Mockito.anyInt(), Mockito.anyInt());
	}
	
	@Test
	public void subTest() {
		// Complete this code
	}
	
	@Test
	public void mulTest() {
		// Complete this code
	}
	
	@Test
	public void divTest() {
		// Complete this code
	}
	
}
