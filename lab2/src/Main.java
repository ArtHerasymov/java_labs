import com.lab2.task1.SmartStringArray;
import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input quantity of strings: ");
        int n = sc.nextInt();
        SmartStringArray strs = new SmartStringArray(n);
        for(int i = 0; i < n; i++){
            System.out.print("Next string: ");
            strs.Add(i, sc.next());
        }
        System.out.println(strs.toString());

        strs.printMoreThanAverage();
    }
}
