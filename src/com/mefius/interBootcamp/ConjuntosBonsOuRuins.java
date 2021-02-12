package com.mefius.interBootcamp;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConjuntosBonsOuRuins {

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in, StandardCharsets.ISO_8859_1);
        List<String> set = new ArrayList<String>();

        while (sc.hasNextLine()) {
            int numberOfLines = Integer.parseInt(sc.nextLine().trim());

            if (numberOfLines != 0) {
                for (int i = 0; i < numberOfLines; i++) {
                    String currentToken = sc.nextLine().trim();
                    set.add(currentToken);
                }
                boolean isBad = false;
                for (String word : set) {
                    Stream<String> stringStream = set.stream().filter((el) -> el.contains(word));
                    List<String> stList = stringStream.collect(Collectors.toList());

                    if (stList.size()>1) isBad = true;
                }
                set.clear();
                if (isBad) {
                    System.out.println("Conjunto Ruim");
                } else {
                    System.out.println("Conjunto Bom");
                }
            }else{
                break;
            }
        }
    }
}
