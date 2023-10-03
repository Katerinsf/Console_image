package edu.school21.printer.logic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;

public class Logic {
    private static byte[] bytesImage;
    public static void printToConsole(String fileName, char symbWhite, char symbBlack) {
        getByteArray(fileName);
        printImage(symbWhite, symbBlack);
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
    public static void printImage(char symbWhite, char symbBlack) {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                if (bytesImage[i * 16 + j] == 1) {
                    System.out.print(symbWhite);
                } else {
                    System.out.print(symbBlack);
                }
            }
            System.out.print("\n");
        }
    }
}
