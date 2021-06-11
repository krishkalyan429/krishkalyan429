package Exericise1;

import java.util.Arrays;
import java.util.Scanner;

public class SecSmallestNum {

	public static void main(String[] args) {
		int[] a = new int[5];
		System.out.println("Enter the elements into the array:");
		Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++) {
        	a[i] = sc.nextInt();
        	
        }
        Arrays.sort(a);
      int res = a[1];
      System.out.println("2nd smallest element in arrat is " + res);
	}

}
