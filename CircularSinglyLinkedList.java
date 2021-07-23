package com.DhivyaRenuka;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;
    public class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
        }
    }
    public CircularSinglyLinkedList(){
        last=null;
        length=0;
    }

    public int length(){
        return length;
    }
public void CreateCSLL()
{
    ListNode fst = new ListNode(1);
    ListNode snd = new ListNode(2);
    ListNode trd = new ListNode(3);
    ListNode fth = new ListNode(4);
    ListNode fith = new ListNode(5);

    fst.next=snd;
    snd.next=trd;
    trd.next=fth;
    fth.next=fith;
    fith.next=fst;

    last=fith;
    length +=5;
}
public void display(){
if(last== null){
    return;
}
ListNode first = last.next;
while(first != last){
        System.out.print(first.data +"-->");
        first=first.next;
    }
    System.out.println(first.data+"-->");
}


public void InsertAtBeginning(int value){
        ListNode newNode =new ListNode(value);
        if(isEmpty()){
            newNode = last;
        }
        else{
            newNode.next = last.next;
        }
         last.next =newNode;
        length++;

}
    public boolean isEmpty(){
        return length ==0; // head-> null
    }

    public void insertatLast(int value){
ListNode newNode =new ListNode(value);
    if(last == null){
        last.next=newNode;
    }
    else{
        newNode.next=last.next;
        last.next= newNode;
        last=newNode;
    }
    length++;

    }
public ListNode deletElement(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp =last.next;
        if(last.next == last){
            last= null;
        }
        else{
            last.next= temp.next;

        }
        temp.next=null;
        length--;
        return temp;
}
    public static void main(String[] args) {
        CircularSinglyLinkedList csll =new CircularSinglyLinkedList();

        // create node and its length
        csll.CreateCSLL();
        csll.length();
        System.out.println(csll.length());

        // display the list
        csll.display();

        // insert at beginning
        csll.InsertAtBeginning(0);
        csll.display();

        // insert at the end
        csll.insertatLast(6);
        csll.display();


        // delete the lement from the list
        csll.deletElement();
        csll.display();


    }
}

