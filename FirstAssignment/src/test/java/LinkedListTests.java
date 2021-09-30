import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTests {

	private LinkedList list;
	@Before
	public void setup() {
		list = new LinkedList();
	}
	
	@Test
	public void testLinkedList() {
	
		for (int i=0; i<10; i++) {
			list.add(i);
		}
		for (int i=0; i<10; i++) {
			int expectedResult = i;
			int actualResult = -1;
			try {
				actualResult = list.topFront();
				list.popFront();
				
			}
			catch (Exception e) {
				System.out.println("Exception occured");
			}
			//assert
			Assert.assertEquals(expectedResult, actualResult);	
		}
		try {
			list.topBack();
			list.display();
		}
		catch(Exception r) {
			System.out.println("Exception occured");
		}
	}
	
	@Test
	public void testLinkedList2() {
	
		for (int i=0; i<10; i++) {
			list.pushFront(i);
		}
		for (int i=9; i>=0; i--) {
			int expectedResult = i;
			int actualResult = -1;
			try {
				actualResult = list.topFront();
				list.popFront();
				
			}
			catch (Exception e) {
				System.out.println("Exception occured");
			}
			//assert
			Assert.assertEquals(expectedResult, actualResult);	
		}
	}
	
	@Test
	public void testLinkedList3() {
	
		for (int i=0; i<10; i++) {
			list.pushBack(i);
		}
		for (int i=0; i<10; i++) {
			int expectedResult = i;
			int actualResult = -1;
			try {
				actualResult = list.topFront();
				list.popFront();
				
			}
			catch (Exception e) {
				System.out.println("Exception occured");
			}
			//assert
			Assert.assertEquals(expectedResult, actualResult);	
		}
	}
	
	@Test
	public void testLinkedList4() {
	
		for (int i=0; i<100; i++) {
			list.pushBack(i);
		}
		int expectedResult = 100;
		int actualResult = list.size();
		//assert
		Assert.assertEquals(expectedResult, actualResult);	
	}

}
