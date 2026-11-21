package org.example;

import org.example.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Додавання: " + calculator.add(5,3));
        System.out.println("Віднімання: " + calculator.subtract(5, 3));
        System.out.println("Ділення: " + calculator.divide(6, 3));
        System.out.println("Множення: " + calculator.multiply(3, 5));
    }
}