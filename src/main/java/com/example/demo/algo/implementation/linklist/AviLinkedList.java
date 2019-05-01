package com.example.demo.algo.implementation.linklist;


public class AviLinkedList {
    private Node head;

    private class Node {
        int data;
        Node next;


        Node(int d) {
            data = d;
            next = null;
        }
    }


    public void insert(int data) {

        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {

            Node node1 = head;

            while (node1.next != null) {
                node1 = node1.next;
            }
            node1.next = node;

        }

    }

    public void insertAtFirst(int data) {

        Node insertAtfirst = new Node(data);
        insertAtfirst.next = null;
        insertAtfirst.next = head;
        head = insertAtfirst;

    }


    void insertAtPos(int pos, int data) {


        if (pos==0){
            insertAtFirst(data);
            return;
        }

        Node node = new Node(data);

        Node n=head;
        for (int i = 0; i < pos-1; i++) {

            n=n.next;
        }

        node.next=n.next;
        n.next=node;
    }


    void delete(int pos){

        if (pos==0){

            head=head.next;
        }else {

            Node node=head;
            Node node1=null;
            for (int i = 0; i < pos - 1; i++) {

                node=node.next;
            }

            node1=node.next;
            node.next=node1.next;

            node1=null;
        }


    }
    public void show() {

        Node da = head;
        while (da.next != null) {
            System.out.println("Data " + da.data);
            da = da.next;
        }

        System.out.println("Data " + da.data);

    }


}
