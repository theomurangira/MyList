package com.dsa;

public class Main {

    public static void main(String[] args) {
	 int[]a={1,2,3,6,4,8};
     int[]b={2,4,6,7,8,9,3};
     int[]c=intersection(a,b);
     for(int i:c)
         System.out.println(i);
       LinkedList list =new LinkedList();
        list.insertFront(3);
        list.insertFront(5);
        list.insertFront(8);
        list.insertBack(4);
        list.insertBack(6);
        list.insertFront(9);
        list.printList();
        list.deleteFront();
        list.deleteFront();
        System.out.println("=========");
        list.printList();
        list.insertBack(7);
        list.insertBack(9);
        list.printList();
        System.out.println("=========");
        list.deleteBack();
        list.deleteBack();
        if(list.Find(5))
        System.out.println("=========");
        list.printList();
       /* LinkedStack s=new LinkedStack();
        s.push(56);
        s.push(39);
        s.push(59);
        s.pop();
        s.pop();s.printStack();
        s.push(23);
        s.printStack();*/
      Queue q=new Queue();
      q.enqueue(34);
      q.enqueue(54);
      q.enqueue(67);
      q.printQueue();
      System.out.println(insertBlanks("(1+34)*(25-7)"));
    }
    public static int[] intersection(int[]a, int[] b)
    {
        int size=Math.min(a.length,b.length);
        int[]result =new int[size];
        int j=0;
        for(int i:b)
        {
            if(isIn(a,i))
            {
                result[j++]=i;
            }
        }
        return result;
    }
    public static boolean isIn(int[]a, int x)
    {
        for(int i:a)
        {
            if(x==i)
                return true;
        }
        return false;
    }
    public static String insertBlanks(String s)
    {
        String result="";
        for(int i=0;i<s.length();++i)
        {
            if(s.charAt(i)=='('||s.charAt(i)==')'|| s.charAt(i)=='+' ||
                    s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
                result+=" "+s.charAt(i)+" ";
            else
                result=result+s.charAt(i);

        }
        return result;
    }


}
