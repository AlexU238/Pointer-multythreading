package com.thread;

import java.util.Scanner;

public class MyThread extends Thread {
    private Scanner in = new Scanner(System.in);

    @Override
    public void run() {
        System.out.println("Enter the number of fibonacci numbers you want to see in direct order");

        Fibonacci fibonacci = new Fibonacci(in.nextInt());

        System.out.print("Потік Thread : ");
        for (int i1 : fibonacci.getFibonacci()) {
            System.out.print(i1 + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getCause();
                e.printStackTrace();
                break;
            }
        }
        System.out.println('\n');
    }


}
