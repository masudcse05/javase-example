/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frequency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *<code>895 Word Problem
In a popular puzzle often found in newspapers, a set of letters is provided, and the challenge is to find
how many different words can be made from these letters. This problem is designed to take all the fun
out of it by automating the process.
Input
Input will be in two parts. The first part will be a dictionary of less than 1000 lines, containing words
to be searched for. Each line will contain one word of up to 10 characters. Each word will be in lower
case. The words will be in alphabetical order. The end of the dictionary will be indicated by a line
consisting of a single ‘#’ character.
After the dictionary there will be data for several word puzzles, each on a separate line. Each puzzle
line will have from one to 7 lower case letters, separated by one or more spaces. Your task is to arrange
some or all of these letters to form words in the dictionary. The list of puzzles will be terminated by a
line consisting of a single ‘#’.
Output
For each puzzle line in the input, a single line of output should be produced, containing the number of
different words in the dictionary that can be formed using the letters in the puzzle line.
Note that each letter may be used only as many times as it appears in the puzzle line. For instance,
the puzzle line ‘u l l’ may produce the word ‘lul’ but not the word ‘lull’.
Sample Input
ant
bee
cat
dog
ewe
fly
gnu
#
b e w
b b e e w w
t a n c u g d
#
Sample Output
0
2
3
</code>
 * @author Masudul Haque
 */
public class Acm895 {

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader buff = new BufferedReader(new FileReader(new File("895.txt")));
        List<String> dic = new ArrayList<String>();
        ArrayList<Character> arr;
        String input;
        while (!(input = buff.readLine()).equals("#")) {
            dic.add(input);
        }
        while (!(input = buff.readLine()).equals("#")) {
            arr = new ArrayList<Character>();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                    arr.add(input.charAt(i));
                }
            }
            int counter = 0;
            for (int i = 0; i < dic.size(); i++) {
                String temp = dic.get(i);
                boolean flag = true;
                ArrayList<Character> arr2 = new ArrayList<Character>();
                for (int j = 0; j < arr.size(); j++) {
                    arr2.add(arr.get(j));
                }
                for (int j = 0; j < temp.length(); j++) {
                    if (!arr2.contains(temp.charAt(j))) {
                        flag = false;
                        break;
                    } else {
                        arr2.remove(arr2.indexOf(temp.charAt(j)));
                    }
                }
                if (flag) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
