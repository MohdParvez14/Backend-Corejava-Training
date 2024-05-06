package Loops;
public class FindingUniqueElement {
	public static void main(String[] args) {
		int n=9;
		int arr[]={10,20,30,10,20,30,78,89,89};
		int XOR=0;
		for(int i=0;i<n;i++){
			XOR=XOR^arr[i];
		}
		System.out.println(XOR + " is the unique element.");
	}
}
