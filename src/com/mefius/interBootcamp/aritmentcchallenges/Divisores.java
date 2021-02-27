package com.mefius.interBootcamp.aritmentcchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisores {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        var d = Integer.parseInt(st.nextToken());
        var nd  = Integer.parseInt(st.nextToken());
        var m = Integer.parseInt(st.nextToken());
        var nm = Integer.parseInt(st.nextToken());
        br.close();

        var result = -1;
        var end = 0;
        var start = 0;

        if (d!=nd && m!=nm){
            start = d;
            end = m;
            while (start<=end) {
                if(start%d==0 && start%nd!=0 && m%start==0 && nm%start!=0){
                    result = start;
                    break;
                }
                start+=d;
            }
        }
        System.out.println(result);
    }
}