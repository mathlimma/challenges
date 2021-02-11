package com.mefius.interBootcamp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;


public class AbreviandoPosts {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String, Integer> wordToCaracterEconomy = new LinkedHashMap<String, Integer>();
        Map<String,String> abreviations = new HashMap<String, String>();
        List<String> words = new ArrayList<String>();


        while(st.hasMoreTokens()){
            String currentWord = st.nextToken().trim();
            if(currentWord.equals(".")) break; // end of test

            words.add(currentWord);

            if(currentWord.length()>2) { // words smaller than 2 must be ignored
                var currentWordEconomy = wordToCaracterEconomy.getOrDefault(currentWord,0);
                wordToCaracterEconomy.put(currentWord, currentWordEconomy + currentWord.length()-2);
            }
        }

        // mapping abreviations
        for (Map.Entry<String, Integer> wordEconomy : wordToCaracterEconomy.entrySet()) {
            String word = wordEconomy.getKey();
            System.out.println(word);
            String abreviation = word.substring(0,1);

            if(!abreviations.containsKey(abreviation)){ // checks if key is not already being used
                abreviations.put(abreviation, word);
            }else{
                String currentWordAbreviated = abreviations.get(abreviation);
                Integer currentEconomy = wordToCaracterEconomy.get(currentWordAbreviated);

                if(wordEconomy.getValue() > currentEconomy){
                    abreviations.put(abreviation, word);
                }
            }
        }

        // printing word with words mapped

        for (String word : words) {
            if(abreviations.containsValue(word)){
                System.out.print(word.substring(0,1)+". ");
            }else {
                System.out.print(word+" ");
            }

        }
        System.out.println();

        //printing results
        System.out.println(abreviations.size());
        for (Map.Entry<String, String> abreviationMap : abreviations.entrySet()) {
            System.out.println(abreviationMap.getKey() + ". = " + abreviationMap.getValue());
        }

    }
}
