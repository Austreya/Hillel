package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        long number;// введенное число

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Введите целое число в диапазоне 0 до 9999, для выхода введите -1: ");
            number = (long) in.nextDouble();
            System.out.println(NumberToText.WordsRus(number));

        } while ( number != -1);

        System.out.println("Работа программы завершена");
    }
}