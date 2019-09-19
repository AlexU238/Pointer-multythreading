package com.thread;

public class Fibonacci {
    private int number;

    public Fibonacci(int number) {
        this.number = number;
    }

    int[] getFibonacci() {
        if (number < 0) {
            System.out.println("0");
        }
        int[] fibonacci = new int[number];
        int n0 = 1;
        int n1 = 1;
        int n2;
        fibonacci[0] = n0;
        fibonacci[1] = n1;
        for (int i = 2; i < number; i++) {
            n2 = n0 + n1;
            fibonacci[i] = n2;
            n0 = n1;
            n1 = n2;
        }
        return fibonacci;
    }
}
