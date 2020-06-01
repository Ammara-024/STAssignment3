package CalculatorFunctions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatotTest {

	@Test
	public void AdditionTest() {
		CalculatorClass calculator= new CalculatorClass();
		int result = calculator.add(20, 60);
		assertEquals(80,result);
	}
	
	@Test
	public void SubtractionTest() {
		CalculatorClass calculator= new CalculatorClass();
		int result = calculator.sub(55, 33);
		assertEquals(22,result);
	}
	
	@Test
	public void multiplicationTest() {
		CalculatorClass calculator= new CalculatorClass();
		int result = calculator.mul(22, 200);
		assertEquals(4400,result);
	}
	
	@Test
	public void divisionTest() {
		CalculatorClass calculator= new CalculatorClass();
		double result = calculator.div(40, 2);
		assertEquals(20,result);
	}
	
	@Test
	public void AverageTest() {
		CalculatorClass calculator= new CalculatorClass();
		float result = calculator.Average(20, 150, 250);
		assertEquals(140,result);
	}
	@Test
	public void Addtest() {
		CalculatorClass calculator= new CalculatorClass();
		int result = calculator.add(-1, 60);
		assertFalse(result !=80);
	}
	
	@Test
	public void Subtest() {
		CalculatorClass calculator= new CalculatorClass();
		int result = calculator.sub(40, 0);
		assertFalse(result !=22);
	}
	
	@Test
	public void Multest() {
		CalculatorClass calculator= new CalculatorClass();
		int result = calculator.mul(-2, 100);
		assertFalse(result !=200);
	}
	
	@Test
	public void Divtest() {
		CalculatorClass calculator= new CalculatorClass();
		double result = calculator.div(0, -1);
		assertFalse(result !=1);
	}
	
	@Test
	public void AvagTest() {
		CalculatorClass calculator= new CalculatorClass();
		float result = calculator.Average(-2, 50, 20);
		assertFalse(result!=140);
	}
}
