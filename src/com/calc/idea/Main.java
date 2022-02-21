package com.calc.idea;

import java.util.Scanner;  //подключаем библиотеку

public class Main {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = calculator.nextInt();
        System.out.println("Введите второе число");
        int b = calculator.nextInt();
        System.out.println("Введите операцию");
        char op = calculator.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
        }
    }
}
