package com.dsa;

public class Queue {

    public void enqueue(int data)
    {
        mylist.insertBack(data);
    }
    public void dequeue()
    {
     mylist.deleteFront();
    }
    public void printQueue()
    {
        mylist.printList();
    }
    LinkedList mylist = new LinkedList();
}
