package foo;

import junit.framework.*;

//import junit.Test.*;


/**
 * Unit test for simple App.
 */
public class QuickSortTest 
    extends TestCase
{
	@Test
	public void testWithOneElementArray() {
		Integer[] array = { 1 };

		Integer[] arraySorted = QuickSort.sortIntegerArray(array);
		Assert.assertNotNull(arraySorted);

		Assert.assertEquals((Integer) 1, arraySorted[0]);
	}

	@Test
	public void testWithNullArray() {
		Integer[] array = null;

		Integer[] arraySorted = QuickSort.sortIntegerArray(array);
		Assert.assertNull(arraySorted);

	}

	@Test
	public void testWithTwoElementArray() {
		Integer[] array = { 2, 1 };

		Integer[] arraySorted = QuickSort.sortIntegerArray(array);
		Assert.assertNotNull(arraySorted);

		//Assert.assertEquals((Integer) 1, arraySorted[0]);
		//Assert.assertEquals((Integer) 2, arraySorted[1]);
		Assert.assertTrue(arraySorted[1] >= arraySorted[0]);
	}
	
	@Test
	public void testWithFiveElementArray() {
		Integer[] array = { 4, 8, 1, 44, 23 };
		
		Integer[] arraySorted = QuickSort.sortIntegerArray(array);
		Assert.assertNotNull(arraySorted);
		
		Assert.assertEquals((Integer) 1, arraySorted[0]);
		Assert.assertEquals((Integer) 4, arraySorted[1]);
		Assert.assertEquals((Integer) 8, arraySorted[2]);
		Assert.assertEquals((Integer) 23, arraySorted[3]);
		Assert.assertEquals((Integer) 44, arraySorted[4]);
	}
	
	@Test
	public void testWithMultipleElementArray() {
		Integer[] array = { 2, 566, 87, 2, 0, 42, 65, 12, 56 };
		
		Integer[] arraySorted = QuickSort.sortIntegerArray(array);
		Assert.assertNotNull(arraySorted);
		
		for (int i = 0; i < arraySorted.length-1; i++){
			Assert.assertTrue(arraySorted[i+1] >= arraySorted[i]);
		}
	}
	
}
