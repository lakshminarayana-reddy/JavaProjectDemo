package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter length of array");
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int j=0; j<n; j++) {
			for(int k=1; k<n-1; k++) {
				if(arr[k]<arr[k]) {
					temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
			System.out.println(arr[j]);
		}
	}

}
