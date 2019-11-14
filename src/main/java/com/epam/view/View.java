package com.epam.view;

import com.epam.controller.*;

import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class View {
    private Controller controller;
    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;
    private Scanner input = new Scanner(System.in);

    public View() {
        controller = new ControllerImpl();
        menu = new LinkedHashMap<>();
        menu.put("1", "1 - Work with Arithmetic Exception");
        menu.put("2", "2 - Work with NullPointer Exception");
        menu.put("3", "3 - Work with FileNotFound and NoSuchElement Exception");
        menu.put("4", "4 - Work with IndexOutOfBonds Exception");
        menu.put("Q", "Q - Exit");

        methodsMenu = new LinkedHashMap<>();
        methodsMenu.put("1", this::pressButton1);
        methodsMenu.put("2", this::pressButton2);
        methodsMenu.put("3", this::pressButton3);
        methodsMenu.put("4", this::pressButton4);

    }


    public void pressButton1() {
        System.out.println("Enter 2 numbers and you get division");
        System.out.println("Input first number: ");
        int a = input.nextInt();
        System.out.println("\n");
        System.out.println("Input second number: ");
        int b = input.nextInt();
        controller.getArithmeticException(a, b);
    }

    public void pressButton2() {
        System.out.println("Enter a string and you get a length");
        System.out.println("Input a string:");
        String line;
        String text = input.nextLine();
        if (text.equals("0")) {
            line = null;
        } else {
            line = text;
        }
        controller.getNullPointerException(line);
    }

    public void pressButton3() {
        System.out.println("Enter a name of file and you get it first line");
        System.out.println("Input name: ");
        String file = input.nextLine();
        controller.getFileNotFoundException(file);
    }

    public void pressButton4() {
        System.out.println("Enter an index and element and you will change this element");
        System.out.println("Input an index: ");
        int index = input.nextInt();
        System.out.println("Input an element: ");
        int element = input.nextInt();
        controller.getIndexOutOfBondsException(index, element);
        controller.getArray();
    }


    private void outputMenu() {
        System.out.println("\nMENU:");
        for (String str : menu.values()) {
            System.out.println(str);
        }
    }

    public void show() {
        String keyMenu;
        do {
            outputMenu();
            System.out.println("Please, select menu point.");
            keyMenu = input.nextLine().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception e) {
            }
        } while (!keyMenu.equals("Q"));
    }

}
