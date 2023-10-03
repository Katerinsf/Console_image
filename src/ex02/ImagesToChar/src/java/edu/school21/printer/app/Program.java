package edu.school21.printer.app;

import edu.school21.printer.logic.*;
import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

public class Program {
    public static void main(String[] args) {
        String fileName = "src/resources/it.bmp";
        Arguments argList = new Arguments();
        JCommander commander = JCommander.newBuilder().addObject(argList).build();
        try {
            commander.parse(args);
        } catch (ParameterException exception) {
            System.out.println("You need enter two parametres: --white=ColorBack --black=ColorFont");
            System.exit(-1);
        }
        Logic.printToConsole(fileName, argList.getWhite(), argList.getBlack());
    }
}