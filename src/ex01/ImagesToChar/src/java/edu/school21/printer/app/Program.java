package edu.school21.printer.app;

import edu.school21.printer.logic.Logic;

public class Program {
    public static void main(String[] args) {
        String fileName = "src/resources/it.bmp";
        if (args.length != 2) {
            System.err.println("IllegalArgument - Number of the arguments");
            System.exit(-1);
        } else if (args[1].length() != 1 || args[0].length() != 1) {
            System.err.println("IllegalArgument - Type of the arguments");
            System.exit(-1);
        } else {
            Logic.printToConsole(fileName, args[0].charAt(0), args[1].charAt(0));
        }
    }
}