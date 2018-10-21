import com.lab2.task1.AuthorData;
import com.lab2.task1.SmartStringArray;
import com.lab2.task1.StringReader;

import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Num of strings: ");
            StringReader reader = new StringReader(sc.nextInt());
            reader.readStrings();
            SmartStringArray arr = new SmartStringArray(reader.getStrings());
            arr.printMoreThanAverage();
            AuthorData ad = new AuthorData("Default");
            System.out.println(ad.getAuthorSurname() + "\n" + ad.getCurDate());
        } catch (Exception e){
            System.err.println(e);
        }
    }
}
