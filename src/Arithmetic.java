import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      double total = (M * (1 + (double)T/100 + (double)X/100));
      //(int) Math.round
      System.out.println("The final price of the meal is $" + total);
      // Enter your code here!
      // Run some computations....
      
      // int total = (int) Math.round(/*numberToRoundHere*/);
      
      // ...then print!
      
    }
}
