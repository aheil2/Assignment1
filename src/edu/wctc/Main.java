package edu.wctc;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // 'psvm' + tab (hotkey for main method)
    public static void main(String[] args) {
        String message = testMessage();

        int count = 0;
        boolean found = false;

        final int SIZE = 25;
        char letters[] = new char[SIZE];

        letters = message.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'o') {
                count++;
            }

        }

        // comment shortcut for highlighted code: ctrl + '/'
//        for (int i = 0; i < message.length(); i++) {
//            if (message.charAt(i) == 'o') {
//                count++;
//            }
//
//        }

        if (count > 0) {
            found = true;
        }


        if (found)
            System.out.printf("You found %d letter Os.\n", count);

        else
            System.out.println("You found none.");

        //this line also works since 'count > 0' returns a boolean
        //found = count > 0;



        //System.in takes the user's input from 'keyboard.nextLine()'
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Sorry, what was your name?\n>");
        String name = keyboard.nextLine();
        System.out.println(String.format("Hello %s", name));

        double number;

        System.out.println("Enter a value>");
        number = Double.parseDouble(keyboard.nextLine());
        System.out.printf("The number is: %,-20.2f\n", number);

        System.out.println(count);
        System.out.println(found);
        System.out.printf("%s - %s", message, name);

        Rectangle box = new Rectangle(5, 12);

    }
    public static String testMessage() {
        return "Hello, World!";
    }
}

// shift + f10 (run program in terminal)