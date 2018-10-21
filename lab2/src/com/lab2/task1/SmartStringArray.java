package com.lab2.task1;

import java.util.*;

public class SmartStringArray {
    private String[] strings = null;
    private int capactiy = 0;
    private int size = 0;

    public SmartStringArray(int n){
        if(n <= 0) {
            throw new IndexOutOfBoundsException();
        } else {
            this.strings = new String[n];
            this.capactiy = n;
        }
    }

    public SmartStringArray(String [] array){
        this.strings = array;
    }


    /**
     * @return average size of strings in array
     */
    public int getAverageSize(){
        float len = 0;
        int size = this.strings.length;
        for(int i = 0; i < size; i++){
            len += this.strings[i].length();
        }

        return Math.round(len/this.strings.length);
    }

    /**
     * This method prints strings with length more than average
     */
    public void printMoreThanAverage(){
        int average = this.getAverageSize();
        int size = this.strings.length;
        System.out.printf("Average size: %d\n", average);
        for(int i = 0; i < size; i++){
            String current = this.strings[i];
            if(current.length() > average) {
                System.out.printf("%15s | %3d \n", current, current.length());
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < this.strings.length - 1; i++){
            str.append(this.strings[i] + "\n");
        }
        str.append(this.strings[this.strings.length - 1]);
        return str.toString();
    }

    public void Add(int index, String s){
        if(index < 0 || index > this.strings.length) {
            System.out.println("Wrong index");
        } else {
            this.strings[index] = s;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SmartStringArray self = (SmartStringArray) obj;
        return Arrays.equals(strings, self.strings);
    }
}
