package com.magic.hashmap;

public class HashMap<K,V> {
    LinkedList<K,V> list;

    public HashMap() {
        this.list =new LinkedList<>();
    }

    public V get(K key) {
        Node<K,V> node=this.list.search(key);
        return (node==null)?null:node.getValue();
    }

    public void add(K key, V value) {
        Node<K,V> node= (Node<K, V>) this.list.search(key);
        if(node==null) {
            node = new Node<>(key, value);
            this.list.append(node);
        }
        else
            node.setValue(value);
    }
    public void deleteKey(K key){
        list.delete(key);
    }
    public void printMap(){
        list.printList();
    }
}
