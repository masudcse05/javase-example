/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frequency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <code>
 * 10062 Tell me the frequencies!
Given a line of text you will have to find out the frequencies of the ASCII characters present in it. The
given lines will contain none of the first 32 or last 128 ASCII characters. Of course lines may end with
\n and \r but always keep those out of consideration.
Input
Several lines of text are given as input. Each line of text is considered as a single input. Maximum
length of each line is 1000.
Output
Print the ASCII value of the ASCII characters which are present and their frequency according to the
given format below. A blank line should separate each set of output. Print the ASCII characters in the
ascending order of their frequencies. If two characters are present the same time print the information
of the ASCII character with higher ASCII value first. Input is terminated by end of file.
Sample Input
AAABBC
122333
Sample Output
67 1
66 2
65 3
49 1
50 2
51 3
 * </code>
 * @author haquem
 *
 */
public class Acm10062 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringBuffer sb = new StringBuffer("");
        String m = "";
        StringBuilder temp = new StringBuilder("");
        boolean flag = false;
        while ((m = br.readLine()) != null) {
            if (flag) {
                sb.append("\n");
            }
            Freq[] arr = new Freq[97];
            for (int i = 0; i < 97; i++) {
                arr[i] = new Freq(0, (char) (i + 31));
            }
            for (int i = 0; i < m.length(); i++) {
                arr[m.charAt(i) - 31].inc();
            }
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].getX() > 0) {
                    sb.append(arr[i].getC()).append(" ").append(arr[i].getX()).append("\n");
                }
            }
            flag = true;
        }
        System.out.print(sb);
    }
}

class Freq implements Comparable<Freq> {

    int x = 0;
    char c = 0;

    public Freq(int num, char temp) {
        x = num;
        c = temp;
    }

    public void inc() {
        x++;
    }

    public int getC() {
        return c;
    }

    public int getX() {
        return x;
    }

    @Override
    public int compareTo(Freq o) {
        if (x > o.getX()) {
            return 1;
        } else if (x == o.getX()) {
            if (c > o.getC()) {
                return -1;
            } else {
                return 1;
            }
        }
        return -1;
    }
}