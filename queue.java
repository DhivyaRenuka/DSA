package com.DhivyaRenuka;

public class queue {
    private link_node front;
    private link_node rear;
    private int length;
    public class link_node{

        private int data;
        private link_node next;
        private link_node front;


        public link_node(int data){
            this.data =data;
         this.next=null;
        }
    }
    public void display() {
         link_node current = front;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length ==0;

    }
    public void enqueue(int data){
link_node temp= new link_node(data);
if(isEmpty()){
    front=temp;
}else {
    rear.next=temp;
}
rear=temp;
length++;
    }
    public void dequque(){
        int temp = front.data;
       if(isEmpty()){
           return ;
       }else{
           front=front.next;
           length--;
       }

    }
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.display();

        q.dequque();
        q.display();

    }
}
