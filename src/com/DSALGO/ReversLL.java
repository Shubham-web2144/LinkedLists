package com.DSALGO;

public class ReversLL {
    Node head;

    void addNode(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    Node reversLL(Node head){
        Node currNode = head;
        Node prevNode = null;
        Node nextNode = null;

        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
        return head;
    }

    public static void main(String args[]){
        ReversLL ll = new ReversLL();
        ll.addNode("1");
        ll.addNode("2");
        ll.addNode("3");
        ll.printList();

        Node aa = ll.reversLL(ll.head);
        System.out.println(aa.data);
        ll.printList();

    }
}
