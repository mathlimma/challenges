package com.mefius.interBootcamp.aritmentcchallenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ContagemRepetidaNumeros {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.ENGLISH);
            Locale.setDefault(new Locale("en", "US"));

            ArrayList<Integer> numbers  = new ArrayList<Integer>();

            var numbersQtd = sc.nextInt();
            while( numbersQtd>0){
                numbers.add(sc.nextInt());
                numbersQtd--;
            }

            SortedMap<Integer, Integer> qtdPerNumber = new TreeMap<>();
            numbers.forEach(id -> qtdPerNumber.compute(id, (key, value) -> ( value == null ? 1 : value + 1)));

            qtdPerNumber.forEach((key, value) -> System.out.printf("%d aparece %d vez(es)\n", key, value));

            sc.close();
        }
}
