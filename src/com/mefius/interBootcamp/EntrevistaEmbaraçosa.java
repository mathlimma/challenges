package com.mefius.interBootcamp;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class EntrevistaEmbaraçosa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, StandardCharsets.ISO_8859_1);

        while (sc.hasNextLine()) {
            String word = sc.nextLine();
            var wordLength = word.length();

            var last = 1;
            for(int i=wordLength-1;i>0;i--){
                var sub =  word.substring(i);
                var contains = word.substring(0,i).contains(sub);

                if (!contains){
                    last = i+1;
                    break;
                }
            }

            System.out.println(word.substring(0,last));
        }
    }
}
