package com.my.lab1.task2;
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

    public void clear(){
        this.numbers.clear();
    }

    public void remove(int index){
        this.numbers.remove(index);
    }

    public String toString(){ return numbers.toString(); }

    public int getHash(){ return numbers.hashCode(); }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Numbers numbers1 = (Numbers) object;
        return java.util.Objects.equals(numbers, numbers1.numbers);
    }
}