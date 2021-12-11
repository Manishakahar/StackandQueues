package com.blz.Queuse;
import java.util.Scanner;
//Main Class
public class Main {
    //Main Method
    public static void main(String[] args) {
        //Queue Method
        Queue queue = new Queue();
        // Get Input from the User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to push the Queue");
        System.out.println("Enter 2 to pop from Queue");
        // case for Queues Operations
        switch (sc.nextInt()) {
            case 1:
                queue.createQueueOperation();
                break;
            case 2:
                queue.dequeueOperation();
            default:
                System.out.println("Please enter correct option");
        }
    }
}
