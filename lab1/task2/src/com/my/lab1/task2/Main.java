package com.my.lab1.task2;

import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){
        System.out.print("Input array length: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if(size <= 0) System.out.println("wrong size");
        else{
            ConsoleInterface cui = new ConsoleInterface();
            cui.ReadArray(size);
            cui.PrintLuckyNumbersArray();
        }
    }
}