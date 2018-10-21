package com.lab2.task1;
import java.util.*;

public class StringReader {
    private int quantity;
    private String[] strings = null;
    public StringReader(int quantity){
        if(quantity > 0) {
            this.quantity = quantity;
            this.strings = new String[quantity];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void readStrings(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < this.quantity; i++){
            System.out.print("Next string: ");
            this.strings[i] = sc.next();
        }
    }

    public String[] getStrings(){
        String[] array = new String[this.quantity];
        System.arraycopy(this.strings, 0, array, 0, this.quantity);
        return array;
    }
}
