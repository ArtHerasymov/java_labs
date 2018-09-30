package classes.my.mypackage1;

public class Hello{
    public String greet(String name){
        return "Hello, " + name;
    }

    // public static void main(String [] args){
    //     System.out.println(new Hello().greet("test"));
    // }
}

/* 
    javac -d %pacakge_dir first_package_src_file.java; to build
    java -cp %package_dir package.Class; to run
*/ 