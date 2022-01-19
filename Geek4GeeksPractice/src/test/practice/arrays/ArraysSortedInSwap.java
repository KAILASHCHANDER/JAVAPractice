package test.practice.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result3 {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps2(List<Integer> a) {
      
    	    	int len = a.size();
       int swaps = 0;
        int temp = 0;
        for (int j=0; j<len-1; j++) {
             for (int i=0; i<len-j-1; i++) {
                 if (a.get(i)>a.get(i+1)) {
                     temp = a.get(i);
                     a.set(i, a.get(i+1));
                     a.set(i+1, temp);
                     swaps += 1;
                 }
             }
        }
             System.out.println("Array is sorted in " + swaps + " swaps.");
             System.out.println("First Element: " + a.get(0));
             System.out.println("Last Element: " + a.get(len-1));
               
    }
    
    public static void countSwaps(List<Integer> a) {
    	/// or below
        int [] b = a.stream().mapToInt(Integer::intValue).toArray();
        int temp =0;
        int swaps = 0;
        int n = b.length;
        for(int i = 0; i < b.length-1; i++){
            if(b[i]>b[i+1]){
                temp = b[i+1];
                b[i+1] = b[i];
                b[i] = temp;
                swaps++;
                i =-1;
            }
        }
    System.out.println("Array is sorted in " + swaps + " swaps.");
    System.out.println("First Element: "+b[0]);
    System.out.println("Last Element: "+b[b.length-1]);

    }
}

public class  ArraysSortedInSwap{
    public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in));
		 * 
		 * int n = Integer.parseInt(bufferedReader.readLine().trim());
		 * 
		 * List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
		 * "").split(" ")) .map(Integer::parseInt) .collect(toList());
		 */
    	 List<Integer>  a = new ArrayList<>(Arrays.asList(1, 2, 3, 5));;
    	 List<Integer>  b = new ArrayList<>(Arrays.asList(6,4,1));;
    	 List<Integer> c 
         = Stream.of(1, 9, 3)
             .collect(Collectors.toList());
    	// Result3.countSwaps(a);
    	 Result3.countSwaps(b);
    	 Result3.countSwaps2(b);
    	// Result3.countSwaps(c);

       // bufferedReader.close();
    }
}
