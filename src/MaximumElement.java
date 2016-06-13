import java.util.Scanner;
import java.util.Stack;


public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		Stack<Integer> stack = new Stack();
		int max=0;
		for(int i=0; i<N; i++){
			int queryNum = scanner.nextInt();
			if(queryNum == 1){ // push element to stack
				int element = scanner.nextInt();
				stack.push(element);
			}
			else if(queryNum == 2){ // delete the top element
				stack.pop();
			}
			else{ // print max element
				Stack<Integer> dupStack = stack;
				max = 0;
				while(!dupStack.isEmpty()){
					int current = dupStack.pop().intValue();
					if(current > max)
						max = current;
				}
				System.out.println(max);
			}
		}
	}

}
