package com.DhivyaRenuka;

import java.util.NoSuchElementException;

public class DoublelylinkedList {
    private Listnode head;
    private Listnode tail;
    private int length;

    // inner class
    public class Listnode{
        int data;
      private   Listnode next;
        private  Listnode previous;
        public Listnode(int data){
            this.data=data;
        }
    }
    public DoublelylinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;

    }
    public boolean isEmpty(){
        return length ==0; // head-> null
    }

    public int length(){
        return length;
    }
    public void DisplayForward(){
        if(head== null){
            return;
        }
        Listnode temp= head;
        while(temp != null){
            System.out.print(temp.data +"-->");
            temp =temp.next;
        }
        System.out.println("null");
    }
public void reverseDirection(){
        if(tail == null){
            return;
    }
        Listnode temp=tail;
        while(temp != null){
            System.out.print(temp.data +"-->");
            temp =temp.previous;
        } System.out.println("null");

}
public void insertLast(int value){
        Listnode newNode =new Listnode(value);
        if(isEmpty()){
            head=newNode;
        }else{
            tail.next =newNode;
        }
        newNode.previous =tail;
        tail =newNode;
        length++;

}
public void insertAtBeginning(int value){
        Listnode newNode =new Listnode(value);
        if(isEmpty()){
            tail= newNode;
        }
        else{
            head.previous=newNode;

        }
        newNode.next =head;
    head= newNode;
    length++;
}
public Listnode DeleteNodeAtBeginning(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Listnode temp= head;
        if(head == tail){
            tail = null;
        }
        else{
            head.next.previous =null;
        }
        head = head.next;
        temp.next=null;
        length--;
        return temp;
}
public Listnode deleteAtLast(){
    if(isEmpty()){
        throw new NoSuchElementException();
    }
    Listnode temp= tail;
    if(head == tail){
        head = null;
    }
    else{
        tail.next.previous =null;
    }
    tail =tail.previous;
    temp.previous=null;
    length--;
    return temp;

}
    public static void main(String[] args) {
        DoublelylinkedList dll =new DoublelylinkedList();

        // insertion at end in doubely linked list
        dll.insertLast(1);
        dll.insertLast(5);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(20);

        // display the doublely linked list
        dll.DisplayForward();
        dll.reverseDirection();

        // insert new node at begining
        dll.insertAtBeginning(45);
        dll.insertAtBeginning(34);

        //display the doublely linked list
        dll.DisplayForward();
        dll.reverseDirection();

        // deleting node at beginning of list
        dll.DeleteNodeAtBeginning();
        dll.DisplayForward();

        // deleting node at the end of the list
        dll.deleteAtLast();
        dll.DisplayForward();

    }
}

