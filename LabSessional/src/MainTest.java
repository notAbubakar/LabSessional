import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	
	int index;

	/**
	 * // Make sure assertions are enabled with VM argument: -ea
	 */
	
	@Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; 
    }
	
	/**
	 * Checking by passing an empty string.
	 */
	
	@Test
	public void emptyString(){
		
		index = Main.getIndex("", 'w');
		assertEquals("return -1", -1, index);
		
	}
	
	/**
	 * Checking the index by passing an empty string.
	 */
	
	@Test
	public void oneCharString(){
		
		index = Main.getIndex("w", 'w');
		assertEquals("return 0", 0, index);
		
	}
	
	/**
	 * Checking the index of last char in the String
	 */
	
	@Test
	public void getLastCharInString(){
		
		index = Main.getIndex("waqas", 's');
		assertEquals("return 4",4, index);
		
	}
	
	/**
	 * Checking the index of first char in the String.
	 */
	
	@Test
	public void getFirstCharInString(){
		
		index = Main.getIndex("waqas", 'w');
		assertEquals("return 0",0, index);
		
	}
	
	/**
	 * Checking the index of mid char in the String
	 */
	
	@Test
	public void getMidCharInString(){
		
		index = Main.getIndex("waqas", 'q');
		assertEquals("return 2",2, index);
		
	}
	
	/**
	 * Checking the index when no char ch is found.
	 */
	
	@Test
	public void charNotFoundInString(){
		
		index = Main.getIndex("waqas", 'p');
		assertEquals("return -1",-1, index);
		
	}

}
