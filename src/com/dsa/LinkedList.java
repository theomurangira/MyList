package com.dsa;

public class LinkedList {
    class Node
    {
        int item;
        Node next;
        public Node(int data)
        {
            item=data;
        }
    }
    Node head;
    public LinkedList()
    {
        head=null;
    }
    public void insertFront( int data)
    {
        Node newNode=new Node(data);
        if (head != null) {
            newNode.next = head;
        }
        head=newNode;
    }
    public void deleteFront()
    {
        if(head==null)
            return;
        else
        {
            head=head.next;
        }

    }
    public void printList()
    {
        Node current=head;
        while(current!=null) {
            System.out.println(current.item);
            current=current.next;
        }
    }
    public void insertBack(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
            head=newNode;
        else
        {
            Node current =head;
            while(current.next!=null)
                current=current.next;
            current.next=newNode;
        }
    }
    public void deleteBack()
    {
       if(head==null)
           return;
       Node previous=head;
       Node last=head.next;

       while(last.next!=null) {
           previous = last;
           last = last.next;
       }
       previous.next=null;
    }
}
