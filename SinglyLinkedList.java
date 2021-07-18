package com.DhivyaRenuka;

import java.util.LinkedList;
import java.util.List;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private ListNode head;
        private int data; // generic type
        private ListNode next;


        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
             current = current.next;
        }
        System.out.println("Null");
    }

    public int length_SLL() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;

        }
        return count;
    }

    public void InsertionAtBegining(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }

    public void InsertionAtEnd(int value) {
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        if (head == null) {
            head = newNode;
            return;
        }

        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void InsertionAtGivenPosition(int value, int pos) {
        ListNode newNode = new ListNode(value);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        }else{
            ListNode previous = head;
            int count =1;
            while (count<= pos-1){
                previous =previous.next;
                count++;

            }
            ListNode current = previous.next;
            previous.next= newNode;
            // newNode.next=previous.next.next;
            newNode.next=current;
        }

    }
    public ListNode deleteFirstNode()
    {
        if(head == null) {
            return null;
        }
            ListNode temp= head;
            head= head.next;
            temp.next= null;
            return temp;


    }

    public ListNode DeleteLast(){
        if(head ==null || head.next== null){
            return head;

        }
        ListNode current =head;
        ListNode previous = null;
        while( current.next != null){
            previous=current;
            current=current.next;

        }
        previous.next= null;
        return current;
    }
public void deleteAtGivenPosition(int pos){
 if(pos==1){
     head=head.next;
 }
 else {
     ListNode previous =head;
     int count =1;
     while(count < pos -1){
         previous=previous.next;
         count++;

     }
     ListNode current =previous.next;
     previous.next = current.next;
 }
}

public boolean searchElement(int searchKey){
        ListNode current =head;
        while(current != null){
            if(current.data== searchKey){
                return true;
            }
          current=  current.next;

        }
        return false;

}
public ListNode reversenodeSLL(){
    if(head ==null || head.next== null){
        return head;

    }
    List<Integer> rev_sll = new LinkedList<>();
        ListNode current =head;
        ListNode previous = null;
        ListNode next=null;
        while (current!= null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
            rev_sll.add(previous.data);
        }

      return previous;
}
public ListNode returnMiddleNode(){
        if(head== null){
            System.out.println("Null");
        }
        ListNode slowPtr =head;
        ListNode fastPtr =head;
        while(fastPtr != null && fastPtr.next!= null ){
            slowPtr =slowPtr.next;
            fastPtr=fastPtr.next.next;
        }
        return slowPtr;
}
public void removeDuplicaresFrmsortedLinkedList(){
    if(head== null){
        System.out.println("Null");
    }
        ListNode current=head;
        while (current != null && current.next != null){
            if(current.next == current.next.next){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }

}

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode(18);
        ListNode fourth = new ListNode(19);

        // connect and form a chain Linked list
        sll.head.next = second; // 10-> 1
        second.next = third;// 10-> 1-> 8
        third.next = fourth;// 10 -> 1-> 8 ->11 ->null

        // insertion at beginning in linked list
        sll.InsertionAtBegining(1);
        sll.InsertionAtBegining(1);

        // insertion at the end
        sll.InsertionAtEnd(25);
        sll.InsertionAtEnd(25);

        // insertion at given position
//        sll.InsertionAtGivenPosition(3,4);
//        sll.InsertionAtGivenPosition(1,1);
//        sll.InsertionAtGivenPosition(2,2);
//        sll.InsertionAtGivenPosition(3,3);


        // Print the linkedlist
        sll.display();

        // delete from begining
        //sll.deleteFirstNode();

        // Print the linkedlist
        //sll.display();


        // delete the last node
        //sll.DeleteLast();

        // Print the linkedlist
        //sll.display();

        // Delete the element from the given position
        //sll.deleteAtGivenPosition(3);

        // Print the linkedlist
        //sll.display();


// search element in linked list
//        sll.searchElement(3);
//        System.out.println(sll.searchElement(45));
//
//        // Reverse the linked list
//        ListNode rns=sll.reversenodeSLL();
//        System.out.println(rns.data);

        // give middle node of linked list
      //  System.out.println(sll.returnMiddleNode());
        
        // remove duplicates from linked list
        // sll.removeDuplicaresFrmsortedLinkedList();


        // Print the linked list
        sll.display();

        // length of Linked List
//        int len = sll.length_SLL();
//        System.out.println(len);
    }

}




