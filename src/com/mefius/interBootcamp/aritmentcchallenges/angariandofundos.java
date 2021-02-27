package com.mefius.interBootcamp.aritmentcchallenges;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.IntStream;

public class angariandofundos {
    public static void main(String[] args) {
        /*
           situations people ALWAYS argue:
           1. finds someone prettier but not necessary richer
           2. finds someone richer but not necessary prettier
         */
        /*
           situations people NEVER argue:
           1. finds someone prettier and richer
           2. finds someone equally richer and prettier
         */
        Scanner sc = new Scanner(System.in, StandardCharsets.ISO_8859_1);
        List <Integer[]> guests = new ArrayList<Integer[]>();

        var numberGuests = Integer.parseInt(sc.nextLine().trim());

        IntStream.range(0,numberGuests).forEach(i->{ // getting data
            Integer[] guest = new Integer[3];

            var beauty = sc.nextInt();
            var fortune = sc.nextInt();
            var donation = sc.nextInt();

            guest[0] = beauty;
            guest[1] = fortune;
            guest[2] = donation;
            guests.add(guest);
        });

        var maxDonation = guests.stream().mapToInt( currentGuest ->{
             System.out.println("currentguest: " + currentGuest[2]);

            var donation =  guests.stream().mapToInt(possibleGuest -> {
             if(currentGuest[0]>possibleGuest[0] && currentGuest[1]>possibleGuest[1]){
                 System.out.println("bigger: "+currentGuest[0] +" " + possibleGuest[0]+" e "+currentGuest[1]+" "+possibleGuest[1]);
                 return possibleGuest[2];
             }else if(currentGuest[0].equals(possibleGuest[0]) && currentGuest[1].equals(possibleGuest[1])){
                 System.out.println("equals: "+currentGuest[0] +" " + possibleGuest[0]+" e "+currentGuest[1]+" "+possibleGuest[1]);
                 return possibleGuest[2];
             }
             return 0;
             }
             ).sum();
            System.out.println("donation: "+donation);
                    System.out.println();
            return donation;
        }
        ).max();

        System.out.println(maxDonation.orElse(0));
        guests.clear();

    }
}
