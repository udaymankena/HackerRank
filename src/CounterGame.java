import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CounterGame {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while(tc >0){
			String n_str = br.readLine();
			BigInteger n= new BigInteger(n_str);
			getWinner(n);
			tc--;
		}
	}

// n is not 2 power and even n - 2power
	private static void getWinner(BigInteger n) {
		// TODO Auto-generated method stub
		// if n is a power of 2
		if(is2power(n)){
			winnerWhen2power(n);
		}
		//not a 2 power
		else{
			if(countTurns(n) %2 == 0){
				System.out.println("Richard");
				return;
			}
			else{
				System.out.println("Louise");
				return;
			}
		}
	}

	private static void winnerWhen2power(BigInteger n){
		if( maxPowerof2(n)%2 == 0){
			System.out.println("Richard");
			return;
		}
		else{
			System.out.println("Louise");
			return;
		}
	}
	private static int countTurns(BigInteger n){
		int turn_count = 0;
		while(n.compareTo(BigInteger.valueOf(1)) != 0){
			
			if(is2power(n))
				n = n.divide(BigInteger.valueOf(2));
			else
				n = n.subtract(maxPowerVal(maxPowerof2(n)));
			turn_count++;
		}
		//System.out.println(turn_count);
		return turn_count;
	}
	
	public static BigInteger maxPowerVal(int power){
		BigInteger powerVal = BigInteger.valueOf(1);
		for(int i=0; i<power; i++)
			powerVal = powerVal.multiply(BigInteger.valueOf(2));
		return powerVal;
	}
	private static boolean is2power(BigInteger n){
		boolean is2power = true;
		while(n.compareTo(BigInteger.valueOf(1)) == 1){
			if(n.remainder(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0)) != 0){
				is2power = false;
				break;
			}
			n=n.divide(BigInteger.valueOf(2));
		}
		return is2power;
	}
	private static int maxPowerof2(BigInteger n) {
		// TODO Auto-generated method stub
		int max_power = 0;
		while(n.compareTo(BigInteger.valueOf(1)) == 1){
			max_power++;
			n=n.divide(BigInteger.valueOf(2));
		}
		
		return max_power;
	}
}
