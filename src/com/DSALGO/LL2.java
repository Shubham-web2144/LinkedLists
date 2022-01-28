package com.DSALGO;

public class LL2 {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    void printlList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    public static void main(String args[]) {
        LL2 list = new LL2();
        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("3");
        list.printlList();

        list.addLast("4");
        list.printlList();
    }
}
