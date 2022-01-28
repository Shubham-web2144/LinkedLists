package com.DSALGO;

public class FloydAlgo {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    void addNode(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void printList(){
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    boolean detectCycle(Node head){
        Node slow_ptr = head;
        Node fast_ptr = head;
        boolean flag = false;

        while (slow_ptr != null && fast_ptr != null && fast_ptr.next != null) {
            slow_ptr  = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;

            if(slow_ptr == fast_ptr) {
                flag = true;
                break;
            }
        }
        return flag;
    }

//    Node detctLoopPt(Node head){
//        Node starting_pt = head;
////        Node ending_pt = detectCycle(head);
//        Node ans = null;
//        while (starting_pt != ending_pt) {
//            starting_pt = starting_pt.next;
//            ending_pt = ending_pt.next;
//
//            if(starting_pt == ending_pt) {
//                 ans = starting_pt;
//            }
//        }
//        return ans;
//    }

    public static void main(String args[]){
        FloydAlgo list = new FloydAlgo();
        list.addNode("1");
        list.addNode("2");
        list.addNode("3");
        list.addNode("4");
        list.addNode("5");
        list.addNode("6");

        list.head.next.next.next.next = list.head;
        boolean dc = list.detectCycle(list.head);
        System.out.println(dc);
//        list.printList();
    }
}
