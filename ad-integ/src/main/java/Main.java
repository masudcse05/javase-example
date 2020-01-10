import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	String input = sc.nextLine();
            String[] str = input.split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            System.out.println(Math.max(a, b));
        }

	}

}
