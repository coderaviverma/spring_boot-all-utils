package com.example.demo.java.algo.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFSofBSTusingQueue {

    //Method 2
    //Complexity - O(n)
    public static void main(String[] args) {

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

    Node1 node1;

    void printOrderLevelTraversal(){

        Queue<Node1> queue=new LinkedList<>();
        queue.add(node1);

        while (!queue.isEmpty()){


        }
    }
}
