package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your date of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next enter key

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2018 - yearOfBirth;

        System.out.println("Your name is " + name + ",and you are " + age + " years old");

        scanner.close();
    }
}
