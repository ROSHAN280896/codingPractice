/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CheckArrayIsSorted
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] array = {1,2,3,4,6};
		System.out.println(isSortedArray(array,array.length));
		int [] array2 = {1,2,3,4,6,2};
				System.out.println(isSortedArray(array2,array2.length));

	}
	
	static boolean isSortedArray(int array[],int n){
		if (n==1)
		  return true;
		 
		return (array[n-1]>=array[n-2])?isSortedArray(array,n-1):false;
	}
}
