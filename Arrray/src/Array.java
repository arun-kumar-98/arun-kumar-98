
public class Array {

	int[] even = new int[5];
	int[] odd = new int[5];

	public int[] arrType(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[i] = arr[i];
			} else {
				odd[i] = arr[i];
			}
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		
		
		int[] arr=new int[] {2,3,2,5,10};
		
		new Array().arrType(arr);
	}

}
