/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.iiscastelli.tama.util;

import java.util.Random;
import java.util.Scanner;

public class Utility {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random rand = new Random();

    public static String readString(String message) {
        boolean validInput = false;
        String input;
        do {
            System.out.print(message);
            input = scanner.nextLine();
            if (input.isBlank()) {
                System.out.println("Valore non valido");
            } else {
                validInput = true;
            }
        } while (!validInput);
        return input;
    }

    public static int readInt(String message) {
        boolean validInput = false;
        int input = 0;
        do {
            String inputString = readString(message);
            try {
                input = Integer.parseInt(inputString);
                validInput = true;
            } catch (NumberFormatException ex) {
                System.out.println("Valore non valido");
            }
        } while (!validInput);
        return input;
    }

    public static int generateInt(int min, int max) {
        return rand.nextInt(min, max + 1);
    }
}
