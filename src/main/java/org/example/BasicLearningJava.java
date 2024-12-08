package org.example;

public class BasicLearningJava {
    public static void main(String[] args) {

        //  Применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int aInt = 10;
        byte aByte = 20;
        short aShort = 10;
        double aDouble = 13.4;

        System.out.println(aByte + aInt);
        System.out.println(aByte - aShort);
        System.out.println(aDouble * aByte);
        System.out.println(aByte / aInt);

        // Применить несколько арифметических операций над int и double в одном выражении
        System.out.println(aByte - aInt * aDouble);
        System.out.println(aByte - aDouble);

        // Применить несколько логических операций ( < , >, >=, <= )
        System.out.println(aInt > aByte);
        System.out.println(aDouble < aShort);
        System.out.println(aDouble >= aByte);
        System.out.println(aInt <= aDouble);

        //  Получить переполнение при арифметической операции
        int maxInt = Integer.MAX_VALUE;
        int total = maxInt + 1;
        System.out.println(total);
    }
}
