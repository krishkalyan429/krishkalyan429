package Exercise3;

import java.util.Scanner;

public class ReverseStr {
static void getSorted(int a[], int n) {
	int[] b = new int[n];
	int j = n ;
	for(int i =0; i<n;i++) {
		b[j-1] = a[i];
		j = j -1;
	}
	System.out.println("Reversed array is :");
	for(int k=0;k<n;k++) {
		System.out.print(b[k]+" ");
	}
}

public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the no. of elements:");
	n = sc.nextInt();
	int[] array = new int[5];
	System.out.println("enter the elements into array:");
	for(int i =0;i<n;i++) {
		array[i] = sc.nextInt();
	}
	getSorted(array,array.length);
}
}
