package sample;

import java.util.Scanner;

public class capitalize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            result.append(i % 2 == 0 ? Character.toUpperCase(input.charAt(i)) : Character.toLowerCase(input.charAt(i)));
        }
        System.out.println(result);

	}

}
