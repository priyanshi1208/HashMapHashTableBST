package com.magic.hashmap;

import java.util.ArrayList;

public class HashTable<K,V> {
    public int bucketSize;
    ArrayList<LinkedList<K, V>> bucket;

    public HashTable() {
        bucketSize = 10;
        this.bucket = new ArrayList<>();
        for (int i = 0; i < bucketSize; i++) {
            this.bucket.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hashcode = Math.abs(key.hashCode());
        return hashcode % bucketSize;

    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        LinkedList<K, V> myLinkedList = this.bucket.get(index);
        if (myLinkedList == null) {
            myLinkedList = new LinkedList<>();
            bucket.set(index, myLinkedList);
        }
       Node<K, V> node = myLinkedList.search(key);
        if (node == null) {
            node = new Node<>(key, value);
            myLinkedList.append(node);

        } else
            node.setValue(value);
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        LinkedList<K, V> myLinkedList = this.bucket.get(index);
        if (myLinkedList == null)
            return null;
       Node<K, V> myMapNode = myLinkedList.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    public void remove(K key) {
        int index = this.getBucketIndex(key);
       LinkedList<K, V> myLinkedList = this.bucket.get(index);
        if (myLinkedList == null)
            System.out.println("Key not Found");
        else
            myLinkedList.delete(key);
    }

    public void print() {
        for (int i = 0; i < bucketSize; i++) {
            LinkedList<K, V> myLinkedList = this.bucket.get(i);
            if (myLinkedList != null) {
                myLinkedList.printList();
            }
        }
    }

}
