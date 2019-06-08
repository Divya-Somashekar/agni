package com.divya.learning.interviewbit.linkedlist;


import java.util.LinkedList;

/**
 * Given a singly linked list, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively.
 * <p>
 * Notes:
 * <p>
 * Expected solution is linear in time and constant in space.
 * For example,
 * <p>
 * List 1-->2-->1 is a palindrome.
 * List 1-->2-->3 is not a palindrome.
 * NOTE: You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details.
 **/

import java.io.*;

// Java program to implement
// a Singly Linked List
// Data Structure to store a linked list node
class Node {
    char data;
    Node next;

    Node(char ch) {
        this.data = ch;
        this.next = null;
    }
};

class PalindromList {

    // Construct String s1 and s2 out of given linked list with consecutive
    // elements of the list in forward and backward direction respectively
    public static void construct(Node head, StringBuilder s1, StringBuilder s2) {
        // Base case
        if (head == null) {
            return;
        }

        s1.append(head.data);
        construct(head.next, s1, s2);
        s2.append(head.data);
    }

    // Function to check if a given linked list of characters is palindrome
    public static boolean isPalindrome(Node head) {
        // construct String s1 and s2 with consecutive elements of the linked list
        // starting from the beginning and the end respectively

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        construct(head, s1, s2);

        // check if linked list is palindrome
        return s1.toString().equals(s2.toString());
    }

    public static void main(String[] args) {
        Node head = new Node('A');
        head.next = new Node('B');
        head.next.next = new Node('C');
        head.next.next.next = new Node('B');
        head.next.next.next.next = new Node('A');

        if (isPalindrome(head)) {
            System.out.print("Linked List is a palindrome.");
        } else {
            System.out.print("Linked List is not a palindrome.");
        }
    }
}
