package datastructure.studt.dalpha;

public class BSearch implements Search {
	private static final int NOT_FOUND = -1;
	
	@Override
	public int getIdx(int[] arr, int target) {
			int left = 0, right = arr.length - 1;
			while(left <= right) {
				int mid = (left + right) / 2;
				if (target == arr[mid]) {
					return mid;
				}
				else if (target < arr[mid]) {
					right = mid - 1;
				}
				else {
					left = mid + 1;
				}
			}
		
		return NOT_FOUND;
	}
	
}
