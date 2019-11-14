package com.epam.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ModelImpl implements Model {

    public void addElements() {
        for (int i = 0; i < array.length; i++){
            array[i] = i+1;
        }
    }

    public void getArithmeticException(int a, int b) {
        double c;
        try {
            c = a/b;
            System.out.println("Your result is " + c);
        } catch (ArithmeticException e){
            System.out.println("You tried divide by zero");
        } finally {
            System.out.println("You was working with ArithmeticException");
        }
    }

    public void getNullPointerException(String line) {
        try {
            System.out.println(line.length());
        } catch (NullPointerException e){
            System.out.println("You entered 0.");
        } finally {
            System.out.println("You was working with NullPointerException");
        }
    }

    public void getFileNotFoundException(String file) {
        try {
            File file1 = new File(file+".txt");
            Scanner reader = new Scanner(file1);
            String line = reader.nextLine();
            System.out.println(line);
        } catch (NoSuchElementException e) {
            System.out.println("Your file is empty");
        } catch (FileNotFoundException e) {
            System.out.println("Your file doesn't exist");
        } finally {
            System.out.println("You was working with FileNotFound and NoSuchElement Exception");
        }
    }

    public void getIndexOutOfBondsException(int n, int element) {
        addElements();
        try {
            array[n] = element;
            System.out.println("Element is changed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Your index is invalid");
        } finally {
            System.out.println("You was working with IndexOutOfBondsException");
        }
    }

}
