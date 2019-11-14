package com.epam.controller;

import com.epam.model.*;

import java.io.FileNotFoundException;

public class ControllerImpl implements Controller{
    Model model = new ModelImpl();

    @Override
    public void getArithmeticException(int a, int b) {
        model.getArithmeticException(a, b);
    }

    @Override
    public void getNullPointerException(String line) {
        model.getNullPointerException(line);
    }

    @Override
    public void getFileNotFoundException(String file) {
        model.getFileNotFoundException(file);
    }

    @Override
    public void getIndexOutOfBondsException(int n, int element) {
        model.getIndexOutOfBondsException(n, element);

    }

    @Override
    public void getArray() {
        System.out.println("Your array: ");
        for (int i = 0; i < model.array.length; i++){
            System.out.println(i+1 + ". " + model.array[i]);
        }
    }

}
