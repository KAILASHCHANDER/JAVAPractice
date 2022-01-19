package test.practice.codingblocks;

import java.util.Scanner;

public class AnyBaseToDesimal {
	
	public static void main(String[] args) 
	{
		
		try (Scanner sc = new Scanner(System.in)) {
			int snum = sc.nextInt();
			//int sb = sc.nextInt();
			//int	 result = anyBaseToDesimal(snum, sb);
			System.out.println("Hello");
			int db = sc.nextInt();
			int	 result = desimalToAnyBase(snum, db);
			
			System.out.println(result);
		}
		
	}
	
	public static int anyBaseToDesimal(int snum, int sb) {
		int ans =0;
		int multiplier = 1 ;
		
		while (snum !=0) {
			int rem = snum % 10;
			ans = ans + (rem * multiplier) ;
			multiplier = multiplier * sb;
			snum = snum/10;
		}
		
		return ans;
	}
	
	public static int desimalToAnyBase(int snum, int db) {
		int ans =0;
		int multiplier = 1 ;
		
		while (snum !=0) {
			int rem = snum % db;
			ans = ans + (rem * multiplier) ;
			multiplier = multiplier * 10;
			snum = snum/db;
		}
		
		return ans;
	}

}
