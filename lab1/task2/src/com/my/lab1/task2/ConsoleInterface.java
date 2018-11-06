package com.my.lab1.task2;
import java.util.*;

public class ConsoleInterface {
    private Numbers numbers = new Numbers();
    // public ConsoleInterface(){}

    public void ReadArray(int size){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            this.numbers.Add(sc.nextInt());
        }
    }

    public void PrintLuckyNumbersArray(){       
        try{ 
            System.out.println(this.numbers.getLuckyNumbers().toString());
        } catch (Exception e){
            System.out.println(e);
        }
    }
}