package datastructure.studt.dalpha;

public class LSearch implements Search {
	// 찾고자 하는 값이 없는 경우
	private static final int NOT_FOUND = -1;
	@Override
	public int getIdx(int[] arr, int target) {
		for (int chk = 0; chk < arr.length ; ++chk) {
			if (arr[chk] == target) { // 배열에 target이 존재하면
				return chk;
			}
		}
		// 못 찾은 경우
		return NOT_FOUND;
	}
	
}
