package datastructure.studt.dalpha;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static int inArray (int arr[], int target) {
		
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (target == arr[mid]) {
				return 1;
			}
			
			else if (target < arr[mid]) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		
		
		return 0;
	}

	
	public static void main(String args[]) {
//		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		Search s = new LSearch();
//		Search s = new BSearch();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Target : ");
//		int target = sc.nextInt();
//		System.out.println("Idx : " + s.getIdx(arr, target));
		int n, m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n ; ++i) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
        
		m = sc.nextInt();
        for (int i = 0; i < m ; ++i) {
			int tmp = sc.nextInt();
			System.out.println(inArray(arr, tmp));
		}
		
		
		
	}
}
