package edu.school21.printer.logic;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;
import com.diogonunes.jcdp.color.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Logic {
    private static byte[] bytesImage;


    public static void printToConsole(String fileName, String white, String black) {
        getByteArray(fileName);
        printImage(white, black);
    }

    private static void getByteArray(String fileName) {
        try {
            File inputFile = new File(fileName);
            BufferedImage bImage = ImageIO.read(inputFile);
            if (bImage.getWidth() != 16 || bImage.getHeight() != 16) {
                throw new Exception();
            }
            bytesImage = (byte[]) bImage.getRaster().getDataElements(0, 0, 16, 16, null);
        } catch (Exception ex) {
            System.err.println("IllegalArgument - Path to the image");
            System.exit(-1);
        }
    }

    public static void printImage(String white, String black) {
        ColoredPrinter color = new ColoredPrinter();
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                if (bytesImage[i * 16 + j] == 1) {
                    color.print(" ", Ansi.Attribute.NONE, Ansi.FColor.NONE, Ansi.BColor.valueOf(white));
                } else {
                    color.print(" ", Ansi.Attribute.NONE, Ansi.FColor.NONE, Ansi.BColor.valueOf(black));
                }
            }
            System.out.print("\n");
        }
    }
}