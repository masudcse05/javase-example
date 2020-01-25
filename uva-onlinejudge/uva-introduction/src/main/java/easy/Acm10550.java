/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import java.util.Scanner;

/**
 *
 * @author Masudul Haque
 */
public class Acm10550 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int i = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (i == 0 && b == 0 && b == 0 && c == 0) {
				break;
			}
			int deg = solution(i, a, b, c);
			System.out.println(deg);
		}
	}

	/**
	 * To open the lock, the following steps are taken:
	 * <ul>
	 * <li>turn the dial clockwise 2 full turns
	 * <li>• stop at the first number of the combination
	 * <li>• turn the dial counter-clockwise 1 full turn
	 * <li>• continue turning counter-clockwise until the 2nd number is reached
	 * <li>• turn the dial clockwise again until the 3rd number is reached
	 * <li>• pull the shank and the lock will open
	 * </ul>
	 * 
	 * @param i
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	protected static int solution(int i, int a, int b, int c) {
		return 720 + 360 + (((a > i ? (40 - a) + i : (i - a)) + (b < a ? (40 - a) + b : (b - a))
				+ (c > b ? (40 - c) + b : (b - c)))) * 9;
	}
}
