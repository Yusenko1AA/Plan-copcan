package com.java.usenko.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScannerUtil {
    private Date startDate;
    private Date endDate;
    // нужен ли тут конструктор?
    public ScannerUtil (){

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
    // моя попытка сделать сканеры дат
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void readStartDate() throws Exception {
        String dateFormat = "dd/MM/yyyy";
        Scanner scanner = new Scanner(System.in);
        setStartDate(new SimpleDateFormat(dateFormat).parse(scanner.nextLine()));
    }

    public void readEndDate() throws Exception {
        String dateFormat = "dd/MM/yyyy";
        Scanner scanner = new Scanner(System.in);
        setEndDate(new SimpleDateFormat(dateFormat).parse(scanner.nextLine()));
    }
}