public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static int[] createIntArray() {
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

	public static String[] createArray(String s1, String s2, String s3, String s4) {
		String[] arr = {s1, s2, s3, s4};
		return arr;
	}

	public static int findValue(int find, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				return i;
			}
		}
		return -1;
	}

	public static int findThirdValue(String find, String[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(find)) {
				if (count == 3) {
					return i;
				}
				count++;
			}
		}
		return -1;
	}
}
