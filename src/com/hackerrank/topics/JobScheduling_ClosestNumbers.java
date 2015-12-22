package com.hackerrank.topics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JobScheduling_ClosestNumbers {
	
	static HashMap job_overlaps;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] start,end;
		start = new int[n];
		end = new int[n];
		for(int i=0;i<n;i++){
			start[i] = input.nextInt();
			end[i] = input.nextInt();
		}
		job_overlaps = new HashMap<Integer,ArrayList<Integer>>();
		largest_nonOverlapping_jobs(start,end);
	}
	

	private static void largest_nonOverlapping_jobs(int[] start, int[] end) {
		int[] numOfOverlaps = num_of_overlaps(start,end);
		int least_overlaps_index = least_overlaps(numOfOverlaps);
		ArrayList least_overlap_dependents = (ArrayList) job_overlaps.get(least_overlaps_index);
		for(int i=0;i<least_overlap_dependents.size();i++){
			start[(int) least_overlap_dependents.get(i)] = -1;
			end[(int) least_overlap_dependents.get(i)] = -1;
		}
		
	}


	private static int least_overlaps(int[] numOfOverlaps) {
		// TODO Auto-generated method stub
		int smallest = 0;
		for(int i=0;i<numOfOverlaps.length - 1;i++){
			if(numOfOverlaps[i+1] < numOfOverlaps[i]){
				smallest = i;
			}
		}
		return smallest;
	}


	private static int[] num_of_overlaps(int[] start, int[] end) {
		job_overlaps.clear();
		int[] numOfOverlaps = new int[start.length];
		for(int i=0;i<start.length;i++){
			ArrayList overlaps = new ArrayList<Integer>();
			for(int j=0; j<start.length; j++){
				if(i==j)
					continue;
				if(start[j] >= end[i] || end[j] <= start[i])
					continue;
				else{
					overlaps.add(j);
					numOfOverlaps[i]++;
				}
			}
			job_overlaps.put(i, overlaps);
		System.out.printf("start:%d end:%d overlap:%d \n",start[i],end[i],numOfOverlaps[i]);
		}
		return numOfOverlaps;
	}

}
