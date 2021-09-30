import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayTest {

	private Array arr;
	@Before
	public void setup() {
		arr = new Array();
	}
	
	@Test
	public void testInsert() {
		for (int i=0; i<10; i++) {
			Array.insert(i, i);
		}
		Array.display();
		for (int i=0; i<10; i++) {
			boolean expectedResult = true;
			boolean actualResult = Array.binarySearch(i,i,i);	//checking elements at exact location
			//assert
			Assert.assertEquals(expectedResult, actualResult);	
		}
		
	}
	
	@Test
	public void testDelete() {
		for (int i=0; i<10; i++) {
			Array.insert(i, i);
		}
		Array.delete(6);	//checking delete function
		Array.display();
		boolean expectedResult = false;
		boolean actualResult = Array.binarySearch(6,6,6);	//checking elements at exact location
		//assert
		Assert.assertEquals(expectedResult, actualResult);	
		
	}
	
	@Test
	public void testBubbleSort() {
		int idx = 0;
		for (int i=9; i>=0; i--) {	//insert in reverse order
			Array.insert(i, idx);
			idx++;
		}
		Array.bubbleSort();	//performing bubble sort
		Array.display();
		for (int i=0; i<10; i++) {
			boolean expectedResult = true;
			boolean actualResult = Array.binarySearch(i,i,i);	//checking elements at exact location
			//assert
			Assert.assertEquals(expectedResult, actualResult);	
		}	
		
	}

	@Test
	public void testLinerSearchPos() {
		for (int i=0; i<10; i++) {
			Array.insert(i, i);
		}
		Array.delete(6);	//checking delete function
		Array.display();
		boolean expectedResult = false;
		boolean actualResult = Array.binarySearch(6,6,6);	//checking elements at exact location
		//assert
		Assert.assertEquals(expectedResult, actualResult);	
		
	}
	
	@Test
	public void testLinerSearchNeg() {
		for (int i=0; i<10; i++) {
			Array.insert(i, i);
		}
		Array.display();
		boolean expectedResult = true;
		boolean actualResult = Array.linearSearch(6);	//checking elements at exact location
		//assert
		Assert.assertEquals(expectedResult, actualResult);	
		
	}
	
}
