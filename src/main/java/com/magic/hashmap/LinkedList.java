package com.magic.hashmap;

public class LinkedList<K,V> {
    Node<K,V> head=null;
    Node<K,V> tail=null;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public Node<K,V> search(K key) {
       Node<K,V> temp=this.head;
       while(temp!=null){
           if(temp.key.equals(key))
               return temp;
           temp=temp.next;
       }
       return null;
    }
    public void append(Node<K,V>node) {
        if(this.head==null)
            this.head=node;
        if(this.tail==null)
            this.tail=node;
        else{
            this.tail.setNext(node);
            this.tail=node;
        }
    }
    public void delete(K key){
        if(head.key.equals(key))
            head=head.next;
        Node<K,V> temp=head;
        if(tail.key.equals(key)){
            while(temp.next!=tail) {
                temp=temp.next;
            }
            tail=temp;
            temp.next=null;
        }else{
            while(temp!=null){
                if(temp.next.key.equals(key)){
                    Node<K,V> result=temp.next;
                    temp.next=result.next;
                }
                temp=temp.next;
            }
        }
    }
    public void printList(){
        Node<K,V> temp=this.head;
        while(temp!=null){
            System.out.println(temp.key+" "+temp.value);
            temp=temp.next;
        }
    }
}
