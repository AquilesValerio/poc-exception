package com.sweetHome.pocexception;

import com.sun.istack.NotNull;

import java.util.Scanner;

public class Client {
    @NotNull
    private String name;
    private int age;
    private double balance;
    private double withdraw;

    Scanner sc = new Scanner(System.in);

    public void save(){
        System.out.println("Type your name: ");
        name = sc.nextLine();
        System.out.println("Type your age: ");
        age = sc.nextInt();
        System.out.println("how much money do you have? ");
        balance = sc.nextDouble();

    }
}
