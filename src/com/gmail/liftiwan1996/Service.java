package com.gmail.liftiwan1996;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    private ArrayList<Integer> list = new ArrayList<>();

    public Service() {
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public ArrayList<Integer> inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько чисел вы хотите ввести");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Введите число");
            int arr = sc.nextInt();
            list.add(arr);
        }
        return list;
    }

    public void printNumber(ArrayList<Integer> list) {
        System.out.println();
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        System.out.println();
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
