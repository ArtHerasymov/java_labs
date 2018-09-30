package classes.my.mypackage2;

import classes.my.mypackage1.Hello;

class Main{
    public static void main(String[] args){
        System.out.println(new Hello().greet("test"));
    }
}

/*  
    javac -cp %package_dir -d %bin_dir %src_file 
    java -cp %pacakge_dir package.Class
*/