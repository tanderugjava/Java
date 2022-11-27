package day18.task3;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public void setRightChild(Node rightChild){
        this.rightChild = rightChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public  void setLeftChild(Node leftChild){
        this.leftChild = leftChild;
    }

 }
