package com.dsa;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList list =new LinkedList();
        list.insertFront(3);
        list.insertFront(5);
        list.insertFront(8);
        list.printList();
        list.deleteFront();
        list.deleteFront();
        list.printList();
        LinkedStack s=new LinkedStack();
        s.push(56);
        s.push(39);
        s.push(59);
        s.pop();
        s.pop();s.printStack();
        s.push(23);
        s.printStack();

    }
}
