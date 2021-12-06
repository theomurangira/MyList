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
    Node tail;
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
    public boolean Find(int a)
    {
        if (head==null)
            return false;
        Node current=head;
        while(current!=null&& current.item!=a)
            current=current.next;
        if(current==null)
            return false;
        else
            return true;
    }
    /*This method reverses the linked list it is called on
    For example if LinkedList l is 2->3->4->5
    After calling l.reverse(), the list becomes 5->4->3->2
     */
    public void reverse()
    {
        //Your code goes here
    }



}
