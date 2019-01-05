package com.recursionexample.binarysearch;


public class BinarySearchRecursive {

    static int[] arr = {1, 3, 5, 12, 45, 443, 555, 1234, 16635, 122342};

    public static void main(String[] args) {
        int val = findRecursively(arr, 16635, 0, arr.length - 1);
        System.out.println("index is " + val);
    }

    public static int findRecursively(int[] arr, int key, int lower, int upper) {
        int currentPos;
        currentPos = (lower + upper) / 2;
        if (arr[currentPos] == key) {
            return currentPos;
        } else if (lower > upper) {
            return arr.length;
        } else {
            if (arr[currentPos] < key) {
                return findRecursively(arr, key, currentPos + 1, upper);
            } else {
                return findRecursively(arr, key, lower, currentPos - 1);
            }
        }

    }

}
