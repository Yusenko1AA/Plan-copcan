package com.java.usenko.util;

import java.util.Scanner;

public class ScannerUtil {

    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String result = scanner.nextLine();
        scanner.close();
        try {
            return Integer.parseInt(result);
        } catch (NumberFormatException e) {
            System.out.println("введен неверный формат числа");
            return readInt();
        }
    }

    public static double readDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стоимость: ");
        String result = scanner.nextLine();
        scanner.close();
        try {
            return Double.parseDouble(result);
        } catch (NumberFormatException e) {
            System.out.println("введен неверный формат числа");
            return readDouble();
        }
    }
}
