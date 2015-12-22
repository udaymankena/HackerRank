import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ValidPANFormat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pan = br.readLine();
		System.out.println(pan);
		if(isValidPAN(pan))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	private static boolean isValidPAN(String pan) {
		// TODO Auto-generated method stub
		
		if(pan.length() != 10)
			return false;
		for(int i=0;i<5;i++){
			if((pan.charAt(i) >= 97 && pan.charAt(i) <= 122) == false)
				return true;
			if((Integer.parseInt(pan, pan.charAt(10 - i)) >= 97 && pan.charAt(i) <= 122) == false)
				return true;
			
		}
		return true;
	}

}
