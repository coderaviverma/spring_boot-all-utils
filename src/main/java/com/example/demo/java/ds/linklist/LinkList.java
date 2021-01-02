package com.example.demo.java.ds.linklist;


import java.util.LinkedList;

public class LinkList {
    Node head; //Head of linkedlist


    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }



    public static LinkList insert(LinkList list,int data){
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        }else {
            Node last=list.head;
            while (last.next!=null){
                last=last.next;
            }
            last.next=new_node;
        }
        return list;
    }

    public static void printList(LinkList list){
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode!=null){
            System.out.println(currNode.data+" ");

            currNode=currNode.next;
        }

    }


    // Driver code
    public static void main(String[] args)
    {

        LinkedList linkedList=new LinkedList();
        /* Start with the empty list. */
        LinkList list = new LinkList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList
        printList(list);
    }
}
