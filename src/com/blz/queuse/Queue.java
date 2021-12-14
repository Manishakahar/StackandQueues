package com.blz.queuse;

import com.blz.stacks.LinkedList;
import com.blz.stacks.Node;

public class Queue {
    public Node top;
    LinkedList linkedList;

    public Queue() {
        this.linkedList = new LinkedList();
    }
       //  push to Queue
    public void createQueueOperation() {
        top = linkedList.push(56);
        linkedList.push(30);
        linkedList.push(70);
        linkedList.print();
        System.out.println("Top -> " + top.data);
    }
      // pop to Queue
    public void dequeueOperation() {
        top=linkedList.push(56);
        linkedList.push(30);
        linkedList.push(70);
        System.out.println("Before Queue");linkedList.print();
        top =linkedList.dequeue();
        System.out.println("After Queue -->");
        linkedList.print();
        System.out.println("Top - > " + top.data);
    }
}

