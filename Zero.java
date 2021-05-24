package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zero {

    public static void main(String[] args) {
        long number; // введенное число
        List< Integer > myNumber = new ArrayList< Integer >();
        Scanner in = new Scanner(System.in);
        int zeroCount1, i;
        int zeroCount2;

        do {
            System.out.print("Введите целое число для выхода введите -1: ");
            number = (long) in .nextDouble();
            myNumber = DigitsInNumber(number);
            // проверка цифр
            zeroCount1 = 0;
            zeroCount2 = 0;
            i = 0;
            for (long digit: myNumber) {
                //System.out.println(digit);
                if (myNumber.get(i) == 0)
                    zeroCount1 = zeroCount1 + 1;
                i++;
            }
            i = myNumber.size() - 1;
            while (myNumber.get(i) == 0) {
                //System.out.println(myNumber.get(i));
                zeroCount2++;
                i--;
            }
            System.out.printf("Число нулей всего %d, в том числе в конце %d\n", zeroCount1, zeroCount2);
        } while (number != -1);

        System.out.println("Работа программы завершена");
    }

    public static List < Integer > DigitsInNumber(long number) {
        String n = Long.toString(number);
        char[] charArray = n.toCharArray();
        List < Integer > cia = new ArrayList < Integer > ();
        for (int i = 0; i < charArray.length; i++) {
            int c = Character.getNumericValue(charArray[i]);
            cia.add(c);
        }
        return cia;
    }
}