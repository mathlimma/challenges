package com.mefius.interBootcamp;

import java.nio.charset.StandardCharsets;
import java.util.*;

// accepted
public class EntrevistaEmbaraçosa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, StandardCharsets.ISO_8859_1);
        List<String> wordsToPrint = new ArrayList<String>();

        while (sc.hasNextLine()) {
            String word = sc.nextLine();
            var wordLength = word.length();

            for(int i=wordLength-1;i>0;i--){
                var sub =  word.substring(i);
                var initIndex = wordLength-(sub.length()*2);
                if(initIndex<0) break;

                var equals = word.substring(initIndex, wordLength-sub.length()).equals(sub);
                if (equals){
                    wordsToPrint.add(word.substring(0,i));
                }
            }

            if(wordsToPrint.size()>0){
                Collections.reverse(wordsToPrint);
                wordsToPrint.stream().forEach(el-> System.out.println(el));
                wordsToPrint.clear();
            }else{
                System.out.println(word.substring(0,wordLength));
            }

        }
    }
}
