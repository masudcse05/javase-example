/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frequency;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * <h1>10008 What’s Cryptanalysis? </h1>
 *  <code>
Cryptanalysis is the process of breaking someone else’s cryptographic writing. This sometimes involves
some kind of statistical analysis of a passage of (encrypted) text. Your task is to write a program which
performs a simple analysis of a given text.
Input
The first line of input contains a single positive decimal integer n. This is the number of lines which
follow in the input. The next n lines will contain zero or more characters (possibly including whitespace).
This is the text which must be analyzed.
Output
Each line of output contains a single uppercase letter, followed by a single space, then followed by a
positive decimal integer. The integer indicates how many times the corresponding letter appears in the
input text. Upper and lower case letters in the input are to be considered the same. No other characters
must be counted. The output must be sorted in descending count order; that is, the most frequent
letter is on the first output line, and the last line of output indicates the least frequent letter. If two
letters have the same frequency, then the letter which comes first in the alphabet must appear first in
the output. If a letter does not appear in the text, then that letter must not appear in the output.

Sample Input
3
This is a test.
Count me 1 2 3 4 5.
Wow!!!! Is this question easy?
Sample Output
S 7
T 6
I 5
E 4
O 3
A 2
H 2
N 2
U 2
W 2
C 1
M 1
Q 1
Y 1
</code>
 *
 * @author Masudul Haque
 */
public class Acm10008_2 {
	public static void main(String[] args) throws IOException {
//        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader buff = new BufferedReader(new FileReader(new File("10008.txt")));
		int T = Integer.parseInt(buff.readLine());
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for (int t = 0; t < T; t++) {
			String input = buff.readLine().toUpperCase();
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				if (Character.isLetter(ch)) {
					if (map.containsKey(ch)) {
						int count = map.get(ch);
						map.put(ch, count + 1);
					} else {
						map.put(ch, 1);
					}
				}
			}
		}
		List<Map.Entry> list = new LinkedList<Map.Entry>(map.entrySet());
		Collections.sort(list, reverse());
		for (Map.Entry entry : list) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	private static Comparator<Map.Entry> reverse() {
		return new Comparator<Map.Entry>() {
			@Override
			public int compare(Map.Entry o1, Map.Entry o2) {
				int comp = ((Comparable) o2.getValue()).compareTo(o1.getValue());
				return comp;
			}
		};
	}
}
