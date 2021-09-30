import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTests {

	private Queue queue;
	@Before
	public void setup() {
		queue = new Queue(100);
	}
	
	@Test
	public void testQueue() {
		for (int i=0; i<100; i++) {
			queue.enqueue(i);
		}
		queue.display();
		for (int i=0; i<100; i++) {
			int expectedResult = i;
			int actualResult = queue.dequeue();
			//assert
			Assert.assertEquals(expectedResult, actualResult);	
		}
		
	}
	
	@Test
	public void testQueue2() {
		for (int i=0; i<120; i++) {	//over the size
			queue.enqueue(i);
		}
		for (int i=0; i<100; i++) {
			int expectedResult = i;
			int actualResult = queue.dequeue();;
			//assert
			Assert.assertEquals(expectedResult, actualResult);	
		}
	}
}
