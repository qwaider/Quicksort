package foo;


/**
 * This is a quick sort implementation
 * 
 * @author Conor
 *
 */
public class QuickSort {
	
	/**
	 * This method takes an array of unsorted integer elements and returns
	 * a sorted array. It does this by moving each element left until the 
	 * element to the left is smaller than it. 
	 * 
	 * @param unSorted
	 * @return sorted integer array
	 */
	
    public static Integer[] sortIntegerArray(Integer[] unSorted) {
    	int count = 1;
    	// if the array is null, empty or contains one element, return it
    	if (unSorted != null && unSorted.length > 1) {
    		//start at the second element, count up to the last one    		  
        	for (int i=count; i<unSorted.length; i++){
        		// for the current element, move left if it's smaller than
        		// the element to the left
        		for (int j = i; j > 0; j-- ){
        			if (unSorted[j] < unSorted[j-1]){
        				int temp = unSorted[j];
        				unSorted[j] = unSorted[j-1];
        				unSorted[j-1] = temp;
        			}
        		}
        		// increment count so that the next element is selected for the 
        		// next run of the for loop
        		count++;
        	}
        }
        
        return unSorted;
    }
}
