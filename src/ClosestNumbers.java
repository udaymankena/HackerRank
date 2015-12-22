import java.util.Arrays;
import java.util.Scanner;


public class ClosestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
			arr[i] = scanner.nextInt();
		printPairs(arr);
	}
	
	public static void printPairs(int[] arr){
		Arrays.sort(arr);
		int leastDiff = leastDiff(arr);
		for(int i=1;i<arr.length;i++){ // print out the pairs with the least difference
			if((arr[i] - arr[i-1]) == leastDiff ){
				System.out.print(arr[i-1] + " ");
				System.out.print(arr[i] + " ");
			}
		}
	}
//Sort the array and find the difference between consecutive elements
// .. and obtain the least difference between the elements
	public static int leastDiff(int[] arr){
		int leastDiff= arr[1] - arr[0];
		for(int i=1;i<arr.length;i++){
			if((arr[i] - arr[i-1]) < leastDiff)
				leastDiff = arr[i] - arr[i-1];
		}
		return leastDiff;
		
	}
	
	

}
