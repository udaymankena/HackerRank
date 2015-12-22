package com.hackerrank.otherscode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClosestNumbers_luk_2013 {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();
        String [] splitted = line.split(" ");
        int [] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(splitted[i]);
        }
        Arrays.sort(a);
//         System.out.println(Arrays.toString(a));
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n-1; i++) {
            int diff = a[i+1] - a[i];
            if (diff < min) {
                 min = diff;
            }
        }
        for (int i = 0; i < n-1; i++) {
            int diff = a[i+1] - a[i];
            if (diff == min) {
                System.out.print(a[i] + " " + a[i+1]+" ");
            }
        }
        
    }
}