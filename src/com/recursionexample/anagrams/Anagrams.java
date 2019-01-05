package com.recursionexample.anagrams;


import java.util.Scanner;

public class Anagrams {
    static int size;
    static int count;
    static char[] arrChar = new char[100];

    public static void main(String[] args) {
        System.out.println("Your word:");
        String input = getString();
        size= input.length();
        count = 0;
        for (int i = 0; i < size; i ++) {
            arrChar[i] = input.charAt(i);
        }
        createAnagram(size);
    }

    public static void createAnagram(int newSize) {
        if (newSize == 1) {
            return;
        }
        for (int i = 0; i < newSize; i++) {
            createAnagram(newSize - 1);
            if (newSize == 2) {
                displayWord();
            }
            rotate(newSize);
        }

    }

    public static void rotate(int newSize) {
        int j;
        int position = size - newSize;
        char temp = arrChar[position];
        for (j = position + 1; j < size; j++) {
            arrChar[j - 1] = arrChar[j];
        }
        arrChar[j - 1] = temp;
    }

    public static  void displayWord() {
        if (count < 99) {
            System.out.print(" ");
        }
        if (count < 9) {
            System.out.print(" ");
        }
        System.out.print(++count + " ");
        for (int i = 0; i <size; i ++) {
            System.out.print(arrChar[i]);
        }
        System.out.print(" ");
        System.out.flush();
        if (count%6 ==0) {
            System.out.println("");
        }
    }

    public  static String getString() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        return s;
    }

}
