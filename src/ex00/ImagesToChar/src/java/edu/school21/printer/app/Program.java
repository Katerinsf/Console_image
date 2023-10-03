package edu.school21.printer.app;

import edu.school21.printer.logic.Logic;

public class Program {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("IllegalArgument - Number of the arguments");
            System.exit(-1);
        } else if (args[1].length() != 1 || args[2].length() != 1) {
            System.err.println("IllegalArgument - Number of the arguments");
            System.exit(-1);
        } else {
            Logic.printToConsole(args[0], args[1].charAt(0), args[2].charAt(0));
        }
    }
}
