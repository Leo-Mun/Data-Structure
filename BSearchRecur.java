package datastructure.studt.dalpha;

import java.util.Arrays;
import java.util.Scanner;

public class BSearchRecur {
	
	public static int bSearch (int arr[], int left, int right, int target) {
		int mid = (left + right) / 2;
		
		if (left > right) {
			return 0;
		}
		
		if (target == arr[mid]) {
			return 1;
		}
		
		else if (target < arr[mid]) {
			return bSearch(arr, left, mid - 1, target); 
		}
		
		else {
			return bSearch(arr, mid + 1, right, target);
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int m = sc.nextInt();
		
		for (int i = 0; i < m; ++i) {
			int tmp = sc.nextInt();
			System.out.println(bSearch(arr, 0, arr.length - 1, tmp));
		}
		
	}
}
