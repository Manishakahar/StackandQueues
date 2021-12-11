package com.blz.Queuse;

import com.blz.stacks.LinkedList;
import com.blz.stacks.Node;

public class Queue {
    public Node top;
    LinkedList linkedList;

    public Queue() {
        this.linkedList = new LinkedList();
    }

    public void create() {
        top = linkedList.push(56);
        linkedList.push(30);
        linkedList.push(70);
        linkedList.print();
        System.out.println("Top -> " + top.data);
    }

}

