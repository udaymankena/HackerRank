package com.hackerrank.otherscode;

import java.util.*;
import java.io.*;

public class ClosestNumbers_joshuapixla {
	
	private static int[] input;
	
	private static void compute(int[] input){
		
		List<Integer> result = new ArrayList<Integer>();
		Arrays.sort(input);
		int mindist = Integer.MAX_VALUE;
		Set<Integer> indexes = new HashSet<Integer>();
		int currdist;
		
		for(int i = 0; i < input.length-1; i++){
			currdist = input[i+1] - input[i];
			if(currdist < mindist){
				indexes = new HashSet<Integer>(); // making a set of values, when difference is less than current difference
				indexes.add(i);                   // so that other values can be ignored
				mindist = currdist;
			}
			if(currdist == mindist){
				indexes.add(i);
			}
		}
		
		Iterator<Integer> it = indexes.iterator();
		int next;
		while(it.hasNext()){
			next = it.next();
			result.add(input[next]);
			result.add(input[next+1]);
		}
		
		Collections.sort(result);
		for(int k = 0; k < result.size(); k++){
			System.out.print(result.get(k)+" ");
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		int N;
		String[] temp;
	    String line = "";
		
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        line = br.readLine(); // why all these parsing and stuff? why can't yoou take an integer input straight away?
	    N = Integer.parseInt(line);
	    line = br.readLine();
	    temp = line.split(" ");
	    input = new int[N];
	    
	    for(int i = 0; i < N; i++){
			input[i] = Integer.parseInt(temp[i]);
		}
		
		compute(input);
	}
}