/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frequency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * <code>11203 Can you decide it for ME?

As you should know, a formal system consists of a set of axioms and set of inference or production
rules. Theorems, in general, are results that can be obtained upon the axioms and the inference rules
of the system. Deciding if a statement is a theorem of a given formal system is not a trivial matter; in
fact, for some systems it is not even possible, as we know by Gödel’s incompleteness theorem.
ME is a formal system with an infinite number of axioms and just one production rule. There are
only three symbols that may appear in any axiom of ME: the capital letters M and E, and the symbol
?. In spite of the infinite number of axioms, there is an easy way of identifying them:
• Axiom definition: An axiom of ME is a string of the form xM?Ex? where x is a string of one
or more ? symbols.
Notice that the word xM?Ex? itself is not an axiom, because x is not a valid symbol of ME; it is
just a pattern to describe the axioms. But ??M?E??? is indeed an axiom, because it fits the pattern,
just replacing x with ??
There is another type of valid strings in the system ME: the theorems. Every axiom is a theorem
of ME. In addition, the following production rule gives rise to an infinite number of theorems:
• Production rule: If xMyEz is a theorem then xMy?Ez? is also a theorem, where x,y,z are strings
of one or more ? symbols.
For instance, the string ??M?E??? is a theorem, because it is an axiom, and the string ??M??E????
is also a theorem, since it can be obtained upon the theorem ??M?E??? and the production rule.
Can we decide if a given string is a theorem of ME? Sure!, there is a decision algorithm for the
system ME. But your goal is less general: just write a program that reads strings with at most 50
symbols and decides if they are theorem of ME.

Input
The input begins with a single positive integer N, on a line by itself, indicating the number of input
lines following. Each input line contains a string with 1 to 50 characters (without spaces), but not
necessarily restricted to the symbols of ME.

Output
For each input line, the program must print an output line with the word ‘theorem’ if the test line
contains a theorem, or the word ‘no-theorem’ in other case.

Sample Input
7
??M?E???
xM?Ex?
??M??E????
M?E?
??m?e???
?M?E??
12M12E????

Sample Output
theorem
no-theorem
theorem
no-theorem
no-theorem
theorem
no-theorem
</code>
 * @author haquem
 *
 */
public class Acm11203 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer("");
        int cases = Integer.parseInt(br.readLine());
        for (int i = 1; i < cases + 1; i++) {
            if (ax(br.readLine().trim())) {
                sb.append("theorem\n");
            } else {
                sb.append("no-theorem\n");
            }
        }
        System.out.print(sb);
    }

    static boolean ax(String x) {
        boolean flagM = false, flagE = false;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '?' || x.charAt(i) == 'M' || x.charAt(i) == 'E') {
                if (x.charAt(i) == 'M') {
                    if (flagE) {
                        return false;
                    }
                    if (flagM) {
                        return false;
                    }
                    flagM = true;
                }
                if (x.charAt(i) == 'E') {
                    if (flagE) {
                        return false;
                    }
                    flagE = true;
                }
            } else {
                return false;
            }
        }
        int count[] = new int[3];
        for (int i = 0, ind = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'M' || x.charAt(i) == 'E') {
                ind++;
                continue;
            }
            count[ind]++;
        }
        if (count[0] == 0 || count[1] == 0) {
            return false;
        }
        return (count[2] == count[1] + count[0]);
    }
}