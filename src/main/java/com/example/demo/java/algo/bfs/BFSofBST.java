package com.example.demo.java.algo.bfs;

public class BFSofBST {
    //Level Order Tree Traversal of tree

    //Complexity -  O(n^2)
    public static void main(String[] args) {

        BinaryTree binaryTree=new BinaryTree();
        binaryTree.root=new Node(1);
        binaryTree.root.left=new Node(2);
        binaryTree.root.right=new Node(3);
        binaryTree.root.right.left=new Node(4);
        binaryTree.root.right.right=new Node(5);


        System.out.println("Level order traversal of binary tree is ");

        binaryTree.printLevelOrderTraversal();
    }

}
class Node {

    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}


class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    //Funtion to print level order traversal
    void printLevelOrderTraversal() {

        int h=heightOfTree(root);

        for (int i=1;i<=h;i++){
            printGivenOrderTraversal(root,i);
        }

    }

    int heightOfTree(Node root) {

        if (root == null) return 0;
        else {

            int lheight = heightOfTree(root.left);
            int rheight=  heightOfTree(root.right);

            if (lheight>rheight)return (lheight+1);
            else return  (rheight+1);

        }
    }


    void printGivenOrderTraversal(Node node,int level){

        if (node ==null){
            return;
        }

        if (level==1){
            System.out.println(node.data+"");
        }else if (level>1){

            printGivenOrderTraversal(node.left,level-1);
            printGivenOrderTraversal(node.right,level-1);
        }

    }
}
