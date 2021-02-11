package com.mefius.interBootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ConjuntosBonsOuRuins {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String,String> abreviations = new HashMap<String, String>();

        while(st.hasMoreTokens()) {
            String currentToken = st.nextToken().trim();
            if (currentToken.equals("0")) break;
        }
    }
}
