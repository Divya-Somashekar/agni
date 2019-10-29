package com.divya.learning.geeksforgeeks.amazon.online_test_preparetion;

import java.util.ArrayDeque;
import java.util.Deque;

class IdenticalNode
{
    int key;
    IdenticalNode left = null, right = null;

    IdenticalNode(int key) {
        this.key = key;
    }
}
/*
class CheckTwoBTareIdenticalOrNot {

    // Recursive function to check if two given binary trees are identical or not
    public static boolean isIdentical(IdenticalNode x, IdenticalNode y)
    {
        // if both trees are empty, return true
        if (x == null && y == null) {
            return true;
        }

        // if both trees are non-empty and value of their root node matches,
        // recur for their left and right sub-tree
        return (x != null && y != null) && (x.key == y.key) &&
                isIdentical(x.left, y.left) &&
                isIdentical(x.right, y.right);
    }

    // main function
    public static void main(String[] args) {
        // construct first tree
        IdenticalNode x = new IdenticalNode(15);
        x.left = new IdenticalNode(10);
        x.right = new IdenticalNode(20);
        x.left.left = new IdenticalNode(8);
        x.left.right = new IdenticalNode(12);
        x.right.left = new IdenticalNode(16);
        x.right.right = new IdenticalNode(25);

        // construct second tree
        IdenticalNode y = new IdenticalNode(15);
        y.left = new IdenticalNode(10);
        y.right = new IdenticalNode(20);
        y.left.left = new IdenticalNode(8);
        y.left.right = new IdenticalNode(12);
        y.right.left = new IdenticalNode(16);
        y.right.right = new IdenticalNode(25);

        if (isIdentical(x, y)) {
            System.out.print("Given binary Trees are identical");
        } else {
            System.out.print("Given binary Trees are not identical");
        }
    }
}*/

// Pair class
class Pair<U, V>
{
    public final U first;   	// first field of a Pair
    public final V second;  	// second field of a Pair

    // Constructs a new Pair with specified values
    private Pair(U first, V second)
    {
        this.first = first;
        this.second = second;
    }

    // Factory method for creating a Typed Pair immutable instance
    public static <U, V> Pair <U, V> of(U a, V b)
    {
        // calls private constructor
        return new Pair<>(a, b);
    }
}

class Main {

    // Iterative function to check if two given binary trees are identical or not
    public static boolean isIdentical(IdenticalNode x, IdenticalNode y)
    {
        // if both trees are empty, return true
        if (x == null && y == null) {
            return true;
        }

        // if first tree is empty (& second tree is non-empty), return false
        if (x == null) {
            return false;
        }

        // if second tree is empty (& first tree is non-empty), return false
        if (y == null) {
            return false;
        }

        // create a stack to hold Node pairs
        Deque<Pair<IdenticalNode, IdenticalNode>> stack = new ArrayDeque<>();
        stack.add(Pair.of(x, y));

        // do till stack is not empty
        while (!stack.isEmpty())
        {
            // pop top pair from the stack and process it
            x = stack.peek().first;
            y = stack.peek().second;
            stack.poll();

            // if value of their root node don't match, return false
            if (x.key != y.key) {
                return false;
            }

            // if left subtree of both x and y exists, push their addresses
            // to stack else return false if only one left child exists
            if (x.left != null && y.left != null) {
                stack.add(Pair.of(x.left, y.left));
            }
            else if (x.left != null || y.left != null) {
                return false;
            }

            // if right subtree of both x and y exists, push their addresses
            // to stack else return false if only one right child exists
            if (x.right != null && y.right != null) {
                stack.add(Pair.of(x.right, y.right));
            }
            else if (x.right != null || y.right != null) {
                return false;
            }
        }

        // if we reach here, both binary trees are identical
        return true;
    }

    // main function
    public static void main(String[] args) {
        // construct first tree
        IdenticalNode x = new IdenticalNode(15);
        x.left = new IdenticalNode(10);
        x.right = new IdenticalNode(20);
        x.left.left = new IdenticalNode(8);
        x.left.right = new IdenticalNode(12);
        x.right.left = new IdenticalNode(16);
        x.right.right = new IdenticalNode(25);

        // construct second tree
        IdenticalNode y = new IdenticalNode(15);
        y.left = new IdenticalNode(10);
        y.right = new IdenticalNode(20);
        y.left.left = new IdenticalNode(8);
        y.left.right = new IdenticalNode(12);
        y.right.left = new IdenticalNode(16);
        y.right.right = new IdenticalNode(25);

        if (isIdentical(x, y)) {
            System.out.print("Given binary Trees are identical");
        } else {
            System.out.print("Given binary Trees are not identical");
        }
    }
}