package algorytm.lesson3;

//Создать программу, которая переворачивает вводимые строки

import java.util.Scanner;

public class InvertString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Input string");
            input = scanner.nextLine();
            System.out.println("revert result: " + revert(input));
        }
    }

    public static String revert(String src) {
        char ch;
        StringBuilder builder = new StringBuilder();
        for (int i = src.length() - 1; i >= 0; i--) {
            ch = src.charAt(i);
            builder.append(ch);
        }
        return builder.toString();
    }
}
