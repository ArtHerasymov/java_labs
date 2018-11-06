import com.lab2.task1.AuthorData;
import com.lab2.task1.SmartStringArray;
import com.lab2.task1.StringReader;
import com.lab2.task2.*;

import java.util.Scanner;

public class UserInterface {

    private int currentUserInput;

    public UserInterface(String authors){
        AuthorData ad = new AuthorData(authors);
        currentUserInput = -1;
        printHeader();
        System.out.println(ad.getAuthorSurname());
        System.out.println(ad.getAssignmentDate());
        System.out.println(ad.getCurDate());
    }

    public void initializeMenuEventLoop(){
        printMenu();
        printFooter();
        readUserInput();
        triggerMenuFunctionality();
    }

    private void printHeader() {
        System.out.println("|**************************************************|");
        System.out.println("|----------------_Welcome to lab2_-----------------|");
        System.out.println("|**************************************************|");
    }

    private void printFooter() {
        System.out.println("|******************KPI FAM 2018********************|");
        System.out.println("|__________________________________________________|");
    }

    private void printMenu(){
        System.out.println("SELECT TASK TO EXECUTE");
        System.out.println("(1) Task1");
        System.out.println("(2) Task2");
    }

    private void printWarning(String message){
        System.out.println("|!!!!!!!!!!!!!!!!!!{"+message+"}!!!!!!!!!!!!!!!!!!!|");
    }

    private void readUserInput(){
        Scanner keyboard = new Scanner(System.in);
        this.currentUserInput = keyboard.nextInt();
    }

    private void triggerMenuFunctionality(){
        switch (currentUserInput) {
            case 1:
                triggerTask1();
                break;
            case 2:
                triggerTask2();
                break;
            default:
                printWarning("Wrong input");
                break;
        }
        initializeMenuEventLoop();
    }

    private String[] readStringInput(){
        Scanner sc = new Scanner(System.in);
        StringReader reader = new StringReader(sc.nextInt());
        try{
            System.out.print("Num of strings: ");
            reader.readStrings();
            return reader.getStrings();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return reader.getStrings();
    }

    private double[] readDoubleInput() throws NegativeArraySizeException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Specify array size : ");
        int arrsize = sc.nextInt();
        if(arrsize <= 0) {
            throw new NegativeArraySizeException();
        }
        double array[] = new double[arrsize];
        for(int i = 0; i < arrsize; i++){
            array[i] = sc.nextDouble();
        }

        return array;
    }

    private void triggerTask1(){
        SmartStringArray arr = new SmartStringArray(readStringInput());
        arr.printMoreThanAverage();
    }

    private void triggerTask2(){
        // Initializing visitors
        MinimumVisitor mv = new MinimumVisitor();
        SumBetweenVisitor sbtwv = new SumBetweenVisitor();
        NormalizerVisitor norm = new NormalizerVisitor();
        //Initializing array wrapper and reading user input
        SmartDoubleArray wrapper = new SmartDoubleArray(readDoubleInput());
        // Initiating visiting process
        System.out.println("Smallest element : ");
        wrapper.accept(mv);
        System.out.println("Sum between two positives : ");
        wrapper.accept(sbtwv);
        System.out.println("Normalized : ");
        wrapper.accept(norm);
    }

}
