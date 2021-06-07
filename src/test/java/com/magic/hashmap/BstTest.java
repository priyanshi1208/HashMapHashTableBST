package com.magic.hashmap;

import org.junit.Assert;
import org.junit.Test;

public class BstTest {
    @Test
    public void given3Numbers_WhenAddedToBST_ShouldReturnSizeThree() {
        BST<Integer> BST = new BST<>();
        BST.addNodes(55);
        BST.addNodes(70);
        BST.addNodes(50);
        int size = BST.getSize();
        Assert.assertEquals(3, size);
    }
    @Test
    public void given13Numbers_WhenAddedToBST_ShouldReturnSizeThirteen() {
        BST<Integer> BST = new BST<>();
        BST.addNodes(56);
        BST.addNodes(30);
        BST.addNodes(70);
        BST.addNodes(40);
        BST.addNodes(22);
        BST.addNodes(11);
        BST.addNodes(3);

        int size = BST.getSize();
        Assert.assertEquals(7, size);
    }

}