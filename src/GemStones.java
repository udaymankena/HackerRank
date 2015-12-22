import java.util.Scanner;


public class GemStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] compos = new String[n];
		scanner.nextLine();
		for(int i=0;i<n;i++)
			compos[i] = scanner.nextLine();
		
		System.out.println(gemElements(compos));


	}
	public static int gemElements(String[] compos){
		int[] repeat = new int[26];
		int repIndex=0,gemElements=0;
		for(char ch='a';ch <= 'z';ch++){
			for(int i=0;i<compos.length;i++){
			if(compos[i].contains(ch + "")){
				repeat[repIndex]++;
			}
			}
			repIndex++;
		}
		for(int i=0;i<26;i++){
			if(repeat[i] == compos.length)
				gemElements++;
		}
		return gemElements;
		
	}
	

}
