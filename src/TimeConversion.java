// *************  NEEDS TO BE OPTIMIZED *****************

/* https://www.hackerrank.com/challenges/time-conversion
 * The only challenge comes at midnight and noon
 * 12:00:00 times*/
import java.util.Arrays;
import java.util.Scanner;
public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String normal_time = scanner.next();
		System.out.println(get_military_time(normal_time));
	}

	private static String get_military_time(String normal_time) {
		// TODO Auto-generated method stub
		char[] normal_time_arr = normal_time.toCharArray();
		if(normal_time_arr[8] == 'A'){
			if(normal_time_arr[0] == '1' && normal_time_arr[1] == '2'){
				normal_time_arr[0] = '0';
				normal_time_arr[1] = '0';
			}
		}
		else {
			int hour = Integer.parseInt("" + normal_time_arr[0] + normal_time_arr[1]);
			if(hour != 12){
				hour += 12;
				String hour_str = hour + "";
				char[] hour_arr = hour_str.toCharArray();
				normal_time_arr[0] = hour_arr[0];
				normal_time_arr[1] = hour_arr[1];
				
			}
		}
		return String.valueOf(normal_time_arr).substring(0,8);
	}

}
