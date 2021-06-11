package Exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		int temp,size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		char charArray[] = str.toCharArray();
		size = charArray.length;
		Arrays.sort(charArray);
		for(int i = 0; i < size/2; i++) {
			charArray[i]= Character.toUpperCase(charArray[i]);
			
		}
		System.out.println("sorted array string is "+String.copyValueOf(charArray));

	}

}
