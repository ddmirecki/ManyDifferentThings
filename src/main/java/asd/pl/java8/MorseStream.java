package asd.pl.java8;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

/**
 * Created by RENT on 2017-01-17.
 */
public class MorseStream {
    public static String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0", " "};
    public static String[] dottie = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----", "|"};

    public static BiMap<String, String> biMap = HashBiMap.create();

    static {
        for (int i = 0; i < alpha.length; i++) {
            biMap.put(alpha[i], dottie[i]); // obie tablice tej samej wielkosci wiec przeleci po obu jednakowo
        }
    }


    public static String translateToMorse(String text) {
        String[] split = text.split("");
//       return Arrays.stream(split).map(literka -> convertChar(literka)).collect(joining(" "));
        return Arrays.stream(split).map(literka -> biMap.get(literka.toLowerCase())).collect(joining(" ")); // mapa zawsze po kluczu zwraca wartosc dlatego mozna pominac metode



    }

    public static String convertChar(String charToConvert) {
        charToConvert = charToConvert.toLowerCase();


            return biMap.inverse().get(charToConvert);


    }

    public static void main(String[] args) {
        String translated = translateToMorse("Ala ma kota");
        System.out.println(translated);
    }
}


