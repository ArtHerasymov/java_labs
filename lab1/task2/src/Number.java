package lab1.task2;

public class Number{
    private int counter = 2;

    public boolean isLucky(int n){
        if(n % counter == 0) return false;
        if(n < counter) return true;
        n -= n/counter;
        counter++;
        return isLucky(n);   
    }
}