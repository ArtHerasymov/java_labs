import java.io.*;
import java.util.*;

/**
 * Interface defines the behavior for builder custom array structures
 * Needed or Builder Pattern
 */
interface ArrayBuilder{
    void readDimension();
    void readArrayAsString();
    void stringArrayToInt();
    int[] getArray();
}

/**
 * Abstract class that defines basic operations for custom data structures
 */
abstract class CustomDataStructure{
    public abstract boolean operation(int currentNumber);
    public abstract int getHash();
    public abstract String toString();
    public abstract int getSize();
}

/**
 * Custom array that is required by the task
 */
class CustomArray extends CustomDataStructure{
    private int dimension;
    private int array[];
    private ArrayBuilder builder;

    /**
     * Constructor that allows to set up custom array with integer array
     * @param array - non-empty integer array
     */
    CustomArray(int[]array){
        this.array = array;
    }

    /**
     * Constructor that allows to set up custom array with custom builder
     * @param builder - Component of Builder pattern that reads input and returns array
     */
    CustomArray(ArrayBuilder builder){
        this.builder = builder;
    }

    /**
     * Method that invokes custom builder
     */
    public void buildArray(){
        builder.readDimension();
        builder.readArrayAsString();
        builder.stringArrayToInt();
        this.array = builder.getArray();
    }

    /**
     * Converts integer array to string
     * @return String-converted array
     */
    @Override
    public String toString(){
        return Arrays.toString(array);
    }

    /**
     * Invokes custom operation on the data structure
     * @param currentNumber - Given element of array
     * @return - Whether number is "lucky" or not
     */
    @Override
    public boolean operation(int currentNumber) {
        System.out.println("CustomDataStructure.operation()");
        return false;
    }

    /**
     * Returns the size of array
     * @return - Size of the data structure
     */
    @Override
    public int getSize() {
        return array.length;
    }

    /**
     * Returns array's element by index
     * @param index - Index of the element to extract
     * @return - Element at given position
     */
    public int getAt(int index){
        return array[index];
    }

    /**
     * Returns hash for the current instance of custom array
     * @return - Integer representation of hash code
     */
    @Override
    public int getHash() {
        return Arrays.hashCode(this.array);
    }
}

/**
 * Abstract decorator that allows user to execute user-defined operations
 * on custom data structures
 */
abstract class NumberDecorator extends CustomDataStructure{
    private CustomDataStructure ds;

    /**
     * Setting structure to execute operation on
     * @param dataStructure - Data structure to get elements from
     */
    public void setStructure(CustomDataStructure dataStructure){
        this.ds = dataStructure;
    }

    /**
     * Executing the operation on data structure's element
     * @param currentNumber - Element to execute operation on
     * @return - Boolean value to represent method's output
     */
    @Override
    public boolean operation(int currentNumber) {
        return ds != null && ds.operation(currentNumber);
    }
}

/**
 * Concrete decorater that allows to extract "Lucky numbers"
 * from custom array data structure
 */
class LuckyNumberDecorator extends NumberDecorator{
    private int counter = 2;

    /**
     * Calculates whether given number is "lucky" or not
     * @param currentNumber - Given number
     * @return - Boolean value that indicates whether given number is "lucky"
     */
    @Override
    public boolean operation(int currentNumber){
        if(currentNumber % counter == 0) return false;
        if(currentNumber < counter) return true;
        currentNumber -= currentNumber/counter;
        counter++;
        return operation(currentNumber);
    }

    @Override
    public int getHash() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }
}

/**
 * Concrete builder that allows to set up custom array from
 * console's input
 */
class ConsoleBuilder implements ArrayBuilder{

    private int dimension;
    private String[] line;
    private int array[];

    private BufferedReader bis;
    private UserInterface ui;

    /**
     * Constructor that sets up initial objects to work with console in the future
     */
    ConsoleBuilder() {
        InputStreamReader is = new InputStreamReader(System.in);
        bis = new BufferedReader(is);
        ui = new UserInterface();
    }

    /**
     * Reads the dimension of the future array
     */
    public void readDimension() {
        try{
            ui.printMessage("Enter the length of array : ");
            this.dimension = Integer.parseInt(bis.readLine());
            ui.printMessage("You've selected <" + dimension+ "> as array length");
        } catch (Exception e){
            ui.printMessage("Input error : " + e);
            System.exit(1);
        }
        array = new int[dimension];
    }

    /**
     * Reads a line that consists of array elements, separated by whitespaces
     */
    public void readArrayAsString(){
        try{
            ui.printMessage("Now, fill it up : ");
            ui.printWarning("Make sure you separate them with a singe whitespace!");
            line = bis.readLine().split(" ");
        } catch(IOException e){
            ui.printMessage("Input error : " + e);
            System.exit(1);
        }
    }

    /**
     * Converts the line into array of integers
     */
    public void stringArrayToInt(){
        if(line.length > dimension) ui.printMessage("You arrray would be chopped down to " + dimension + " elements");
        for(int i = 0; i < dimension; i++){
            try{
                array[i] = Integer.parseInt(line[i]);
            } catch (Exception e){
                ui.printMessage("Wrong input");
                System.exit(1);
            }
        }
    }

    /**
     * Returns final array
     * @return - Integer array, read from the console
     */
    public int[] getArray(){
        return this.array;
    }
}

class UserInterface{
    public void printHeader(){
        System.out.println("***********************************************");
        System.out.println("\t Console Reader 1.0");
        System.out.println("_______________________________________________");
    }

    public void printFooter() {
        System.out.println("***********************************************");
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printWarning(String message){
        System.out.println("/////" + message+ "/////");
    }
}

class Main{
    public static void main(String[]args) {
        UserInterface ui = new UserInterface();
        ui.printHeader();
        ConsoleBuilder builder = new ConsoleBuilder();
        CustomArray array = new CustomArray(builder);
        array.buildArray();

        LuckyNumberDecorator ld = new LuckyNumberDecorator();
        ld.setStructure(array);
        for(int i = 0, j = 1 ; i < array.getSize(); i++) {
            if(ld.operation(array.getAt(i))) {
                ui.printMessage("Lucker number["+j+"] " + array.getAt(i));
                j++;
            }
        }
        ui.printFooter();
    }
}