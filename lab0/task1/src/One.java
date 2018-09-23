import java.util.*;

public class One{
    public String getHello(){
        return "Hello";
    }
    public void printHello(){
        System.out.println(new One().getHello());
    }

    public static void main(String [] args){
        One o = new One();
        o.printHello();
    }
}