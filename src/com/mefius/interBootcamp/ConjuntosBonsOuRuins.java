package com.mefius.interBootcamp;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

// not accepted - case teste 4 with error
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
                AtomicBoolean isBad = new AtomicBoolean(false);

                set.stream().forEach(word ->{
                    Object[] list = set.stream().filter((el) -> el.contains(word)).toArray();

                    if (list.length > 1) isBad.set(true);
                });

                set.clear();
                if (isBad.get()) {
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
