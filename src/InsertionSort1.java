import java.util.Scanner;


public class InsertionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
			arr[i] = scanner.nextInt();
		insertionSort(arr);
	}

	public static void insertionSort(int arr[]){
		int element = arr[arr.length - 1];
		//arr[arr.length-1] = arr[arr.length - 2];
		int pen = arr.length-2;
		while(pen >= 0){
			if(element < arr[pen]){
				arr[pen+1] = arr[pen];
				pen--;
				printArr(arr);
			}
			else{
				arr[pen+1] = element;
				printArr(arr);
				break;
			}
	}
	}
	
	public static void printArr(int arr[]){
		for(int element: arr)
			System.out.print(element + " ");
		System.out.println();
	}
}
