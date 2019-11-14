package com.epam.controller;

import java.io.FileNotFoundException;

public interface Controller {
    void getArithmeticException(int a, int b);

    void getNullPointerException(String line);

    void getFileNotFoundException(String file);

    void getIndexOutOfBondsException(int n, int element);

    void getArray();

}
