package jnuitAssignment1File;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          MinMaxFinder obj = new MinMaxFinder();
          
         int[] a =  obj.findMinMax(new int[] {5,7,45,2,76});
         
         System.out.println(a[0]);
         System.out.println(a[1]);
      
         
	}

}
    class MinMaxFinder {
	 
	public int[] findMinMax(int[] a) {
		//int max=0,min=0;
		int[] arr = new int[2];
		Arrays.sort(a);
		
		arr[0] = a[0];
		arr[1] = a[a.length-1];
		
		return arr;
	}
	

}