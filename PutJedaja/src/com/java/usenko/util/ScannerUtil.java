package com.java.usenko.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScannerUtil {
    private static final String DATE_FORMAT = "dd/MM/yyyy";

    private ScannerUtil () {
    }

    public static long readLong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID: ");
        String result = scanner.nextLine();
        scanner.close();
        try {
            return Long.parseLong(result);
        } catch (NumberFormatException e) {
            System.out.println("введен неверный формат числа");
            return readLong();
        }
    }

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
        String result = scanner.nextLine();
        scanner.close();
        try {
            return Double.parseDouble(result);
        } catch (NumberFormatException e) {
            System.out.println("введен неверный формат числа");
            return readDouble();
        }
    }

    public static Date readDate() {
        System.out.println("Формат даты: " + DATE_FORMAT);
        Scanner scanner = new Scanner(System.in);
        try {
            return new SimpleDateFormat(DATE_FORMAT).parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("введен неверный формат даты");
            return readDate();
        }
    }

}