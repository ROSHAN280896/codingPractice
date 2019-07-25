/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		while (x > 0){
			x= x-1;
			int k = Integer.parseInt(br.readLine());
		Long y = factorial(k);
		System.out.println(y);
		}
	}
	
	static Long factorial(int x){
		if(x==0)
		 return 1L;
		 
		 Long y = factorial(x-1);
		 return x*y;
	}
}
