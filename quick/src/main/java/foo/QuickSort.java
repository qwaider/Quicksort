package foo;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class QuickSort {
	
    public static Integer[] sortIntegerArray(Integer[] unSorted) {
    	int count = 1;
    	if (unSorted != null && unSorted.length > 1) {
        	for (int i=count; i<unSorted.length; i++){
        		//System.out.println(Arrays.toString(unSorted));
        		for (int j = i; j > 0; j-- ){
        			if (unSorted[j] < unSorted[j-1]){
        				int temp = unSorted[j];
        				unSorted[j] = unSorted[j-1];
        				unSorted[j-1] = temp;
        			}
        		}
        		count++;
        	}
        }
        
        return unSorted;
    }
}
