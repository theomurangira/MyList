package com.dsa;

public class LinkedStack {
    LinkedList list;
    public LinkedStack()
    {
        list=new LinkedList();
    }
    public void pop()
    {
        list.deleteFront();
    }
    public void push(int data)
    {
        list.insertFront(data);
    }
    public void printStack()
    {
        list.printList();
    }
    public boolean isEmpty()
    {
        return list==null;
    }

}
