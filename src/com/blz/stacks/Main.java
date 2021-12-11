package com.blz.stacks;
import java.util.Scanner;

public class Main {
    // Main Method
    public static void main(String[] args) {
        // Stack Method
        Stack newStack=new Stack();
        // Get the input from the User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to push the Element");
        System.out.println("Enter 2 to Peak the Element");
        System.out.println("Enter 3 to Pop the Element");
        // case for Stack Elements
        switch (sc.nextInt()) {
            case 1:
                newStack.pushElement();
                break;
            case 2:
                newStack.peakElement();
                break;
            case 3:
                newStack.popElement();
                break;
            default: System.out.println("please enter correct option");
        }

    }
}

