package com.DSALGO;

public class LL {

    Node head;
    int size;

    LL () {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst (String data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void addLast (String data) {
        Node currNode = new Node(data);
        if(head == null) {
            head = currNode;
            return;
        }

        Node lastNode = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = currNode;
    }

    public void printList () {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public int getSize() {
        return size;
    }

    public void removeFirst() {
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = this.head.next;
        size--;
    }

    public void removeLast() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

        currNode.next = null;
    }
    public static void main(String args[]){
        LL list = new LL();
        list.addFirst("1");
        list.addFirst("@");
        list.addFirst("#");
        list.printList();

        list.addLast("%");
        list.addLast("*");
        list.printList();

        int a = list.getSize();
        System.out.println(a);

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();
    }
}
