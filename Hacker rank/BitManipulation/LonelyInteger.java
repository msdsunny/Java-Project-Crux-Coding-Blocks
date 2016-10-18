package BitManipulation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class LonelyInteger {
	  private static ArrayList<Integer> lonelyInteger(int[] a) {
		  Hashtable<Integer, Integer> table = new Hashtable<>();
		  for (int i = 0;i < a.length;i++){
			  if (table.containsKey(a[i])){
				  Integer count = table.get(a[i]);
				  count++;
				  table.put(a[i], count);
			  }else{
				  table.put(a[i], 1);
			  }
		  }
		  ArrayList<Integer> arr = new ArrayList<>();
		  Collection<Integer> allvalue = table.values();
		  for (Integer value : allvalue){// collection doing problem in multiple unique value
			  if (value == 1){
				  Integer unique = table.get(value);
				  arr.add(unique);
			  }
		  }
	      return arr;
	    }
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = in.nextInt();
	        }
	        ArrayList<Integer> arr = lonelyInteger(a);
	        for (int i = 0;i < arr.size();i++){
	        	System.out.println(arr.get(i));
	        }
	    }
}
