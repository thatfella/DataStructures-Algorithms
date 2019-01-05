package com.recursionexample.hanoitowers;

public class HanoiTowers {

    static int numberOfDisks = 3;

    public static void main(String[] args) {
        doTowers(numberOfDisks,'A','B','C');
    }

    private static void doTowers(int numberOfDisks, char from, char inter, char to) {
        if (numberOfDisks ==1) {
            System.out.println("Disk 1 from " + from +" to  "+ to);
        }
        else {
            doTowers(numberOfDisks-1,from,to,inter); //taking from 'from' to 'inter'
            System.out.println("Disk " + numberOfDisks + "  from " + from+" to " + to);
            doTowers(numberOfDisks-1,inter,from,to);//taking from 'inter' to 'to'
        }
    }
}
