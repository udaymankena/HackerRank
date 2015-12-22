package com.hackerrank.otherscode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClosestNumbers_raphmclee {


	
	public static class Diff implements Comparator<Diff> {

		private int a ,b;
		private Integer diff;
		
		public Diff(int a, int b) {
			this.a = a;
			this.b = b;
			diff = b-a;
		}
		

		@Override
		public int compare(Diff o1, Diff o2) {
			return o1.diff.compareTo(o2.diff);
		}
		
	}
	
	
	public static void findClosest(int[] ar) {
		Arrays.sort(ar);
		Diff[] diff = new Diff[ar.length - 1];
		for(int i = 0; i < diff.length; i++ ) {
			diff[i] = new Diff(ar[i], ar[i+1]);
		}
		Arrays.sort(diff, 0, diff.length, diff[0]);
		int i = 0;
		int oldValue = diff[i].diff;
		do {
			System.out.print(diff[i].a + " " + diff[i].b + " " );
			i++;
		} while(oldValue == diff[i].diff);
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		findClosest(ar);
		in.close();
	}
}