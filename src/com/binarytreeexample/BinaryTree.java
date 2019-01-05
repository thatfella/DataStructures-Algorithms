package com.binarytreeexample;

/**
 * Class, which describes a tree
 */
public class BinaryTree {
    private Node root;

    private Node find(int key) {
        Node currentNode = root;
        while (currentNode.getKey() != key) {
            if (key < currentNode.getKey()) {
                currentNode = currentNode.getLeftChild();
            } else {
                currentNode = currentNode.getRightChild();
            }
            if (currentNode == null) {
                return null;
            }
        }
        return currentNode;
    }

    ;

    private void insert(int key, double iData) {
        Node newNode = new Node();
        newNode.setKey(key);
        newNode.setIdata(iData);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key < current.getKey()) {
                    current = parent.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(newNode);
                        return;
                    }
                } else {
                    current = parent.getRightChild();
                    if (current == null) {
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    private boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (current.getKey() != key) {
            parent = current;
            if (key < current.getKey()) {
                isLeftChild = true;
                current = current.getLeftChild();
            } else {
                isLeftChild = false;
                current = current.getRightChild();
            }

            if (current == null) {
                return false;
            }
            //the node, which we need to delete is  found
        }
        //now if the node doesn't have successors it's deleted
        if (current.getLeftChild() == null && current.getRightChild() == null) {
            if (current == root) {
                root = null;
            }
            else if (isLeftChild) {
                parent.setLeftChild(null);
            }
            else {
                parent.setRightChild(null);
            }
        }
        //now if there is no right child , node is replaced by left subtree
        else if (current.getRightChild() == null) {
            if (current == root) {
                root = current.getLeftChild();
            }
            else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            }

            else {
                parent.setRightChild(current.getLeftChild());
            }
        }
        //now if there is no left child , node is replaced by right subtree
        else if (current.getLeftChild() == null) {
            if (current == root) {
                root = current.getRightChild();
            }
            else if (isLeftChild) {
                parent.setRightChild(current.getRightChild());
            }
            else {
                parent.setRightChild((current.getLeftChild()));
            }
        }
        // if we have 2  child nodes we need to replace node by successor
        else {
            Node successor = nodeGetSuccessor(current);
            if (current == root) {
                root = successor;
            }
            else  if (isLeftChild) {
                parent.setLeftChild(successor);
            }
            else  {
                parent.setRightChild(successor);
            }
        }
            return true;
    }

    private Node nodeGetSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.getRightChild();
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();
        }
        if (successor != delNode.getRightChild()) {
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(delNode.getRightChild());
        }
        return successor;
    }

    private void traverseTreeInOrder(Node localRoot) {
        if (localRoot != null) {
            traverseTreeInOrder(localRoot.getLeftChild());
            System.out.println(localRoot.getKey());
            traverseTreeInOrder(localRoot.getRightChild());
        }
    }
}
