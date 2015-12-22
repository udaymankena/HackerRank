import java.math.BigInteger;
import java.util.Scanner;


public class FibonacciModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		System.out.println(nthTerm(a,b,n));
	}
	
	public static BigInteger nthTerm(long a, long b, int n){
		BigInteger bigA = BigInteger.valueOf(a);
		BigInteger bigB = BigInteger.valueOf(b);
		
		for(int i=0;i<n-2;i++){
			BigInteger temp = bigB;
			bigB = (bigB.multiply(bigB)).add(bigA);
			bigA=temp;
		}
		return bigB;
	}

}
