package lab1.task2;
import lab1.task2.Number;
import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array length: ");
        int size = sc.nextInt();
        if(size <= 0) System.out.println("wrong size");
        else{
            System.out.println("fill an array");
            int [] numbers = new int[size];
            for(int i = 0; i < size; i++){
                numbers[i] = sc.nextInt();
            }
            for(int i = 0; i < size; i++){
                if(numbers[i] > 0)
                    if(new Number().isLucky(numbers[i])) System.out.printf("array[%d] which is %d is lucky\n", i, numbers[i]);
            }
        }
    }
}