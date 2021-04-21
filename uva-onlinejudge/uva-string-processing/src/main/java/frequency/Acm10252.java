/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frequency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/**
 *<code>
 *10252 Common Permutation
Given two strings of lowercase letters, a and b, print the longest string x of lowercase letters such
that there is a permutation of x that is a subsequence of a and there is a permutation of x that is a
subsequence of b.
Input
Input file contains several lines of input. Consecutive two lines make a set of input. That means in the
input file line 1 and 2 is a set of input, line 3 and 4 is a set of input and so on. The first line of a pair
contains a and the second contains b. Each string is on a separate line and consists of at most 1000
lowercase letters.
Output
For each set of input, output a line containing x. If several x satisfy the criteria above, choose the first
one in alphabetical order.
Sample Input
pretty
women
walking
down
the
street
Sample Output
e
nw
et
 *</code>
 * @author Masudul Haque
 */
public class Acm10252 {

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader buff = new BufferedReader(new FileReader(new File("10252.txt")));
        StringBuilder output=new StringBuilder("");
        Set<Character> res=new TreeSet<Character>();
        String first,second;
        while((first=buff.readLine())!=null && (second=buff.readLine())!=null){
            res.clear();
            for (int i = 0; i < first.length(); i++) {
                for (int j = 0; j < second.length(); j++) {
                    char firstChar=first.charAt(i);
                    char secondChar=second.charAt(j);
                    if(Character.isLowerCase(firstChar) && Character.isLowerCase(secondChar) && 
                       firstChar==secondChar){
                      res.add(firstChar);       
                    }
                }                
            }
            for (Character character : res) {
                output.append(character);
            }
            output.append("\n");
        }
        System.out.print(output);
    }
}
