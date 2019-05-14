package com.example.demo.java.algo.implementation.linklist;

public class LinkListMain {


    public static void main(String[] args) {


//        LinkedList

        AviLinkedList linkedList=new AviLinkedList();
        linkedList.insert(10);
        linkedList.insert(11);
        linkedList.insert(12);
        linkedList.insert(9);
        linkedList.insertAtFirst(1234);

        linkedList.insertAtPos(0,244);
        linkedList.insertAtPos(4,244);

        linkedList.delete(3);
        linkedList.show();

    }
}
