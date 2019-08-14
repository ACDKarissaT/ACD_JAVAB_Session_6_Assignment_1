package assignment1;

public class Arrays {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i <10; i++) {
			arr[i] = i+1;
		}
		for(int i =1; i<10; i = i+2) {
			System.out.println(arr[i]);
		}
	}
}
