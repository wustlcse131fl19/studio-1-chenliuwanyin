package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        double x = ap.nextInt("Value for x?");
        double y = ap.nextInt("Value for y?");


        double average;
        average  = (x + y)/2 ;
        System.out.println(average);
    }
}
