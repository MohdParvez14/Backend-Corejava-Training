package Arrays;
public class multiDimensionalArray {
	public static void main(String[] args) {
		int arr[][] = {{2,7,9},{3,6,1},{7,4,2}};
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
//		System.out.println("Length of row 1: " + arr[0].length);
//		System.out.println("Length of row 2: " + arr[1].length);
//		System.out.println("Length of row 3: " + arr[2].length);
	}
}
