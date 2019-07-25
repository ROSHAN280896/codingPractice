/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TowerOfHanoi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		/*
			Tower Of Hanoi
			move first n-1 rod from source to auxilary
			move nth rod to destination
			move n-1 rod from auxilary to destination
		*/
		towerOfHanoi(2,"A","B","C");
		towerOfHanoi(3,"A","B","C");

		
	}
	
	static void towerOfHanoi(int n, String source, String destination, String auxilary){
		
		if(n==1){
			System.out.println("move disk " + n +"from "+ source +" to "+destination);
			return;
		}
		//move top n-1 from source to aux via destination
		towerOfHanoi(n-1,source,auxilary,destination);
		System.out.println("move disk " + n +"from "+ source +" to "+destination);
		//move n-1 disk from aux to destination
		towerOfHanoi(n-1,auxilary,destination,source);

	
	}

}
