package day18.task3;

import java.util.Stack;

public class Tree {
    private Node root;

    public Tree(){
    }

    public void insertNode(int value, Node root){
        Node newNode = new Node();
        newNode.setValue(value);

        if(root == null){
            root = newNode;
        }
        else {
            Node currentNode = root;
            Node parentNode;
            while (true)
            {
                parentNode = currentNode;
                if(value == currentNode.getValue()){
                    return;
                } else if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeftChild();
                    if(currentNode == null){
                        parentNode.setLeftChild(newNode);
                        return;
                    }
                }
                else {
                    currentNode = currentNode.getRightChild();
                    if(currentNode == null){
                        parentNode.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    public void dfs(Node root){
        if(root.getLeftChild() != null){
            System.out.print(root.getLeftChild().getValue() + " ");
            dfs(root.getLeftChild());
        }
        if(root.getValue() == 20){
            System.out.print(root.getValue() + " ");
        }
        if (root.getRightChild() != null){
            System.out.print(root.getRightChild().getValue() + " ");
            dfs(root.getRightChild());
        }
    }
}

