import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTests {

	private Stack stack;
	@Before
	public void setup() {
		stack = new Stack();
	}
	
	@Test
	public void testStack() {
		for (int i=0; i<100; i++) {
			stack.push(i);
		}
		stack.display();
		for (int i=99; i>=0; i--) {
			int expectedResult = i;
			int actualResult = stack.pop();
			//assert
			Assert.assertEquals(expectedResult, actualResult);	
		}
	}
	
}
