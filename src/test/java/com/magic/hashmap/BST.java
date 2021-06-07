package com.magic.hashmap;

public class BST<E extends Comparable> {
   private BstNode<E> root=null;

    public BstNode<E> add(BstNode<E> node,E data) {
        if(root==null) {
            return new BstNode<>(data);
        }
        int compareResult = root.data.compareTo(data);
        if (compareResult == 0)
            return root;
        if (compareResult > 0)
            root.left = add(root.left, data);
        else
            root.right = add(root.right,data);
        return root;
    }
    public void addNodes(E data){
        this.root=add(root,data);
    }
    public int getSize() {
        return size(this.root);
    }

    public int size(BstNode<E> root) {
        if (root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);
    }

}
