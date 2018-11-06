package com.lab2.task2;

import java.util.Arrays;

public class SmartDoubleArray implements AbstractWrapper{
    private double[] doubles = null;

    public SmartDoubleArray(int n) throws IndexOutOfBoundsException{
        if(n <= 0) throw new IndexOutOfBoundsException();
        else this.doubles = new double[n];
    }

    public SmartDoubleArray(double [] array){
        this.doubles = array;
    }

    public void add(int index, double value) throws IndexOutOfBoundsException {
        if(index < 0 || index >= doubles.length)
            throw new IndexOutOfBoundsException();
        else
            this.doubles[index] = value;
    }

    public double getAt(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= this.doubles.length)
            throw new IndexOutOfBoundsException();
        else
            return this.doubles[index];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartDoubleArray that = (SmartDoubleArray) o;
        return Arrays.equals(doubles, that.doubles);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(doubles);
    }

    public int getSize(){
        return this.doubles.length;
    }

    @Override
    public String toString() {
        return "SmartDoubleArray{" +
                "doubles=" + Arrays.toString(doubles) +
                '}';
    }

    @Override
    public void accept(Operation visitor) {
        System.out.println(visitor.visit(this));
    }
}
