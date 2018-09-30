package com.my.lab1.task2;
// import com.my.lab1.task2.Number;
import java.util.*;

public class Numbers{
    private List<Integer> numbers = new ArrayList<Integer>();

    public Numbers(){}
    public Numbers(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            this.numbers.add(numbers[i]);
        }
    }
    
    public List<Integer> getLuckyNumbers() throws Exception{
        if(this.numbers.size() != 0){
            List<Integer> lucky = new ArrayList<Integer>();
            int size = numbers.size();
            for(int i = 0; i < size; i++){
                if(new SmartNumber().isLucky(numbers.get(i))) lucky.add(numbers.get(i));
            }
            return lucky;
        }
        throw new Exception("array not initialized");
    }

    public void Add(int number){
        this.numbers.add(number);
    }

    public String toString(){ return numbers.toString(); }
    public int getHash(){ return numbers.hashCode(); }
}