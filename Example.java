package com.mainacademy;

import java.util.Scanner;

public class Example {
         
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        String age = scanner.nextLine();

        System.out.print(name);
        System.out.print(age);
        
        
}
}