package com.thread;

import java.util.Scanner;

public class RunnableThread implements Runnable {
    private Scanner in = new Scanner(System.in);

    @Override
    public void run() {
        System.out.println("Enter the number of fibonacci numbers you want to see in reverse order");

        Fibonacci fibonacci = new Fibonacci(in.nextInt());

        System.out.print("Потік Runnable : ");
        for (int i = fibonacci.getFibonacci().length - 1; i >= 0; i--) {
            System.out.print(fibonacci.getFibonacci()[i] + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getCause();
                e.printStackTrace();
                break;
            }
        }
    }
}
