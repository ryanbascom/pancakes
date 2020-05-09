package com.rb.weave;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTestCases = Integer.parseInt(scanner.nextLine().trim());

        String[] pancakes = new String[numberOfTestCases];
        for (int i = 0; i < numberOfTestCases; i++) {
            pancakes[i] = scanner.nextLine();
        }

        scanner.close();

        PancakeStacker pancakeStacker = new PancakeStacker();

        for (int i = 0; i < pancakes.length; i++) {
            int result = pancakeStacker.calculateNumberOfFlips(Pancake.fromString(pancakes[i]));
            System.out.println("Case #" + (i + 1) + ": " + result);
        }

    }
}
