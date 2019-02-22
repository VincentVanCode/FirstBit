package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String bitConvertion = Integer.toBinaryString(number);
        int bitAtPosition1 =  bitConvertion.charAt(bitConvertion.length() - 2);
        int result = (char)bitAtPosition1;
        System.out.printf("%c", result);

    }
}
