package com.example.demo.java.algo.bfs;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BFSofBSTusingQueue {

    //Method 2
    //Complexity - O(n)
    public static void main(String[] args) {
        BinaryTree2 binaryTree=new BinaryTree2();
        binaryTree.root=new Node1(1);
        binaryTree.root.left=new Node1(2);
        binaryTree.root.right=new Node1(3);
        binaryTree.root.right.left=new Node1(4);
        binaryTree.root.right.right=new Node1(5);

        System.out.println("Level order traversal of binary tree is ");

        binaryTree.printOrderLevelTraversal();
    }
}


class Node1{
    int data;
    Node1 left,right;

    public Node1(int data) {
        this.data = data;
        left=null;
        right=null;
    }

}

class BinaryTree2{

    Node1 root;

    public BinaryTree2() {
        root = null;
    }


    void printOrderLevelTraversal(){

//        Queue<Node1> queue=new ArrayDeque<>();
        Queue<Node1> queue=new LinkedList<>();
        queue.add(root);


        while (!queue.isEmpty()){
            Node1 node2=queue.remove();
            if (node2.left!=null)
            queue.add(node2.left);
            if (node2.right!=null)
            queue.add(node2.right);

            System.out.println(node2.data);
        }
    }
}
