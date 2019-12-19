package com.mhaque.javase13.newfeatures;

public class SwitchExpression {

	public static void main(String[] args) {
		System.out.println(getText(5));
		System.out.println(getText2(5));
		System.out.println(getText3(5));

	}
	
	private static String getText(int number) {
        String result = "";
        switch (number) {
            case 1, 2:
                result = "one or two";
                break;
            case 3:
                result = "three";
                break;
            case 4, 5, 6:
                result = "four or five or six";
                break;
            default:
                result = "unknown";
                break;
        };
        return result;
    }
	
	private static String getText2(int number) {
        return switch (number) {
            case 1, 2 -> "one or two";
            case 3 -> "three";
            case 4, 5, 6 -> "four or five or six";
            default -> "unknown";
        };
    }
	
	private static String getText3(int number) {
        return switch (number) {
            case 1, 2:
                yield "one or two";
            case 3:
                yield "three";
            case 4, 5, 6:
                yield "four or five or six";
            default:
                yield "unknown";
        };
    }

}
