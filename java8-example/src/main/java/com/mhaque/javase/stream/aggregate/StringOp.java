package com.mhaque.javase.stream.aggregate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Masud
 */
public class StringOp {

    public static void main(String[] args) {
        String str = "I live in Bangladesh.....".toLowerCase();
        List<Character> allChar = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            allChar.add(str.charAt(i));
        }

        Map<Character, Long> byVowel
                = allChar.stream().filter(e -> isVowel(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(byVowel);
        
        ArrayList<Hashtable<Integer,Integer>> DB_entry;
DB_entry = new ArrayList<Hashtable<Integer,Integer>>();
    for (int i = 0; i < 6; i++)
    {
        Hashtable temp = new Hashtable();
        DB_entry.add(temp);
    }
    }

    private static boolean isVowel(Character ch) {
        return "aeiou".indexOf(ch) != -1;
    }

}
