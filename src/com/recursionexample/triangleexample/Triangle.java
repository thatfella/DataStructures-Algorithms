package com.recursionexample.triangleexample;


public class Triangle {

    public static void main(String[] args) {
        int z = triangle(4);
        System.out.println(z);
    }



    public static int triangle(int n) {
        System.out.println("Entering n = "+ n);
        if (n == 1) {
            System.out.println("n is 1");
            return 1;
        }
        int temp = (n+triangle(n-1));
        System.out.println("returning " + temp );
        return temp;
    }
}
