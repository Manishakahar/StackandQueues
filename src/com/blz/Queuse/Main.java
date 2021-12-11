package com.blz.Queuse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to push the Queue");
        switch (sc.nextInt()) {
            case 1:
                queue.create();
                break;
            default:
                System.out.println("Please enter correct option");
        }
    }
}
