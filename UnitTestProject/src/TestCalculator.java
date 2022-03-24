import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCalculator {

	@Test // tell is a unit test app
	public void testSum() {
		Calculator c = new Calculator();
		Assertions.assertEquals(4, c.sum(2, 2));
		Assertions.assertEquals(8, c.sum(6, 2));
		Assertions.assertEquals(1024, c.sum(512, 512));
	}// testSuma
	
	@Test // tell is a unit test app
	public void testMultiply() {
		Calculator c = new Calculator();
		Assertions.assertEquals(4, c.multiply(2, 2));
		Assertions.assertEquals(8, c.multiply(4, 2));
		Assertions.assertEquals(100, c.multiply(50, 2));
	}// testMultiply
	
	@Test // tell is a unit test app
	public void testDivide() {
		Calculator c = new Calculator();
		Exception exception = Assertions.assertThrows(ArithmeticException.class, ()->c.divide(9, 0));
		Assertions.assertEquals("/ by zero", exception.getMessage());
		Assertions.assertEquals(3, c.divide(9, 0));
		Assertions.assertEquals(2, c.divide(4, 2));
		Assertions.assertEquals(25, c.divide(50, 2));
	}// testDivide
	
	@Test // tell is a unit test app
	public void testStrPI() {
		Calculator c = new Calculator();
		Assertions.assertNotNull(c.getStrPI());
		Assertions.assertTrue(c.getStrPI().length()>3);
		Assertions.assertTrue(c.getStrPI().indexOf(".")==1);
		}// testStrPI
	
	@Test // tell is a unit test app
	public void testEmail() throws EmailFormatException{
		Calculator c = new Calculator();
		Exception exception = Assertions.assertThrows(EmailFormatException.class, ()->c.setEmail("alonsograjeda&generationorg"));
		Assertions.assertEquals("The email format is invalid", exception.getMessage());
		}// testEmail

}// class testCalculator
