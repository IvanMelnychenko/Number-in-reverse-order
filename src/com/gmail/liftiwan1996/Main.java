package com.gmail.liftiwan1996;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Service service = new Service();
       service.inputNumber();
       service.printNumber(service.getList());
    }
}
