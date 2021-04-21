/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frequency;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 *<code>11577 Letter Frequency
In this problem we are interested in
the frequency of letters in a given line
of text. Specifically, we want to know
the most frequently occurring letter(s)
in the text, ignoring case (to be clear,
“letters” refers precisely to the 26 letters of the alphabet).
Input
Input begins with the number of test cases on its own line. Each test case consists of a single line of
text. The line may contain non-letter characters, but is guaranteed to contain at least one letter and
less than 200 characters in total.
Output
For each test case, output a line containing the most frequently occurring letter(s) from the text in
lowercase (if there are ties, output all such letters in alphabetical order).
Sample Input
1
Computers account for only 5% of the country's commercial electricity consumption.
Sample Output
co
</code>
 * @author Masudul Haque
 */
public class Acm11577 {

    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader buff = new BufferedReader(new FileReader(new File("11577.txt")));
        int L = Integer.parseInt(buff.readLine());
        for (int t = 0; t < L; t++) {
            map.clear();
            String line = buff.readLine().toLowerCase();
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (Character.isLetter(ch)) {
                    if (map.containsKey(ch)) {
                        map.put(ch, map.get(ch) + 1);
                    } else {
                        map.put(ch, 1);
                    }
                }
            }
            int max=Collections.max(map.values());
            for (Map.Entry<Character,Integer>  entry: map.entrySet()) {
                if(entry.getValue()==max){
                    System.out.print(entry.getKey());
                }
            }
            System.out.println();
        }
    }
}
