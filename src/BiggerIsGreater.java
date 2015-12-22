import java.util.Arrays;


public class BiggerIsGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "npcle";
		compute_lexico_smallestInBig(str);
	}

	private static void compute_lexico_smallestInBig(String str) {
		// TODO Auto-generated method stub
		int minIndex = -1;
		for(int i=str.length()-2; i>0; i--){
			if(minIndex == -1){
			minIndex = check_if_greater_char(str,i);
			if(minIndex != -1)
			System.out.println(buildString(str,i,minIndex));
			}
			else
				break;
		}
	}

	private static String buildString(String str, int i, int minIndex) {
		// TODO Auto-generated method stub
		char[] strArr = str.toCharArray();
		char temp = strArr[i];
		strArr[i] = strArr[minIndex];
		strArr[minIndex] = temp;
		char[] sortedRight = Arrays.copyOfRange(strArr, i+1, strArr.length-1);
		char[] left = Arrays.copyOfRange(strArr, 0, i);
		String finalStr = new String(left) + new String(sortedRight);
		return finalStr;
	}

	private static int check_if_greater_char(String str, int i) {
		// TODO Auto-generated method stub
		char min = '\0';
		int minIndex = -1;
		for(int j=str.length()-1; j>i; j--){
			if(str.charAt(j) > str.charAt(i)){
				if(min == '\0'){
					min = str.charAt(j);
					minIndex = j;
				}
				else if(str.charAt(j) < min){
					min = str.charAt(j);
					minIndex = j;
				}
			}
		}
		return minIndex;
		
	}

}
