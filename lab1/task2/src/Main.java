package com.my.lab1.task2;

import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array length: ");
        int size = sc.nextInt();
        if(size <= 0) System.out.println("wrong size");
        else{
            int[] numbers = new int[size];
            for(int i = 0; i < size; i++){
                numbers[i] = sc.nextInt();
            }
            try{
                System.out.println("Lucky numbers: " + new Array(numbers).getLuckyNumbers().toString());
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}