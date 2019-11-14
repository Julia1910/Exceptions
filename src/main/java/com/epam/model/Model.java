package com.epam.model;

import java.io.FileNotFoundException;

public interface Model {
    int[] array = new int[5];
    void getArithmeticException(int a, int b);
    void getNullPointerException(String line);
    void getFileNotFoundException(String file);
    void getIndexOutOfBondsException(int n, int element);
}
