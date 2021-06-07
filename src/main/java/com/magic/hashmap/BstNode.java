package com.magic.hashmap;

public class BstNode<E> {
    BstNode<E> right;
    BstNode<E> left;
    E data;

    public BstNode(E data) {
        this.right = null;
        this.left = null;
        this.data = data;
    }
}
