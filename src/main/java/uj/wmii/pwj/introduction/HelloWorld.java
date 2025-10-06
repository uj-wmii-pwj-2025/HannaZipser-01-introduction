package uj.wmii.pwj.introduction;

import static uj.wmii.pwj.introduction.QuadraticEquation.findRoots;
import static uj.wmii.pwj.introduction.Reverser.reverse;
import static uj.wmii.pwj.introduction.Reverser.reverseWords;

public class HelloWorld {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No input parameters provided");
            return;
        }

        for (String arg : args){
            System.out.println(arg);
        }
    }
}
