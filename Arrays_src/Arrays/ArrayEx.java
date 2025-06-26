package Arrays;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter size:");
		int size = sc.nextInt();
		
		int ar[]=new int[size];
		System.out.println("Read data from console");
		for(int i=0; i<ar.length; ++i) {///1d array
			System.out.println("ENter value:");
			ar[i]=sc.nextInt();
		}
		System.out.println("Display:");
		for(int k:ar) {
			System.out.println(k+" ");
		}
	}

}
