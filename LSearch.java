package datastructure.studt.dalpha;

public class LSearch implements Search {
	// ã���� �ϴ� ���� ���� ���
	private static final int NOT_FOUND = -1;
	@Override
	public int getIdx(int[] arr, int target) {
		for (int chk = 0; chk < arr.length ; ++chk) {
			if (arr[chk] == target) { // �迭�� target�� �����ϸ�
				return chk;
			}
		}
		// �� ã�� ���
		return NOT_FOUND;
	}
	
}
