package com.divya.learning.geeksforgeeks.amazon;

import java.util.LinkedList;

/**
 * Created by: Divya Somashekar
 * Date:  6/4/2019
 * Time: 2:10 PM
 **/
/*Print the Middle of a given linked list

Given a singly linked list, find middle of the linked list. For example, if given linked list is 1->2->3->4->5 then output should be 3.

If there are even nodes, then there would be two middle nodes, we need to print second middle element. For example, if given linked list is 1->2->3->4->5->6 then output should be 4.

Method 1:
    Traverse the whole linked list and count the no. of nodes. Now traverse the list again till count/2 and return the node at count/2.
Method 2:
    Traverse linked list using two pointers. Move one pointer by one and other pointer by two. When the fast pointer reaches end slow pointer will reach middle of the linked list.
Method 3:
    Initialize mid element as head and initialize a counter as 0. Traverse the list from head, while traversing increment the counter and change mid to mid->next whenever the counter is odd. So the mid will move only half of the total length of the list.
 */

public class MiddleOfLinkedList {
    Node head; // head of linked list

    /* Linked list node */
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Function to print middle of linked list */
    private void printMiddle() {
        Node slowPointer = head;
        Node fastPointer = head;
        if (head != null) {
            while (fastPointer != null && fastPointer.next != null) {
                fastPointer = fastPointer.next.next;
                slowPointer = slowPointer.next;
            }
            System.out.println("The middle element is [" +
                    slowPointer.data + "] \n");
        }
    }

    /* Inserts a new Node at front of the list. */
    private void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* This function prints contents of linked list
       starting from  the given node */
    private void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + "->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        MiddleOfLinkedList llist = new MiddleOfLinkedList();
        for (int i = 5; i > 0; --i) {
            llist.push(i);
            llist.printList();
            llist.printMiddle();
        }
    }
}
