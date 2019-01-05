package com.binarytreeexample;

/**
 * This class describes a node of binary tree
 */
public class Node {
    private int key;
    private double idata; // rest data
    private Node leftChild;
    private Node rightChild;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public double getIdata() {
        return idata;
    }

    public void setIdata(double idata) {
        this.idata = idata;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
