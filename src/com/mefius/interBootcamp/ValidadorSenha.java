package com.mefius.interBootcamp;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class ValidadorSenha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, StandardCharsets.ISO_8859_1);
        boolean upperCase, lowercase, containsDigit, letterOrDigit;
        boolean[] casesArr = new boolean[4];
        casesArr[3] = true;
        /*
            0. there is an upper case letter
            1. there is an lower case letter
            2. there is a digit
            3. has only letters or digits
         */
        while (sc.hasNextLine()) {
            String password = sc.nextLine();
            if(password.length()>=6 && password.length()<=32 && !password.contains(" ")){
                char[] chars = password.toCharArray();

                for (char ch : chars) {
                    upperCase = Character.isUpperCase(ch);
                    if(upperCase) casesArr[0]= true;

                    lowercase = Character.isLowerCase(ch);
                    if(lowercase) casesArr[1]= true;

                    containsDigit = Character.isDigit(ch);
                    if(containsDigit) casesArr[2]= true;

                    letterOrDigit = Character.isLetterOrDigit(ch);
                    if(!letterOrDigit) casesArr[3]= false;
                }

                if(casesArr[0] && casesArr[1] && casesArr[2] && casesArr[3]){
                    System.out.println("Senha valida.");
                }else{
                    System.out.println("Senha invalida.");
                }

            }else{
                System.out.println("Senha invalida.");
            }

        }
    }
}
