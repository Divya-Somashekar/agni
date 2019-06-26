package com.divya.learning.geeksforgeeks.amazon.online_test_preparetion;


import java.util.Stack;

class ZigZagNode
{
    int data;
    ZigZagNode leftChild;
    ZigZagNode rightChild;
    ZigZagNode(int data)
    {
        this.data = data;
    }
}

class ZigZagTraversal {
    ZigZagNode rootZigZagNode;

    // function to print the 
// zigzag traversal 
    void printZigZagTraversal() {

        // if null then return 
        if (rootZigZagNode == null) {
            return;
        }

        // declare two stacks 
        Stack<ZigZagNode> currentLevel = new Stack<>();
        Stack<ZigZagNode> nextLevel = new Stack<>();

        // push the root 
        currentLevel.push(rootZigZagNode);
        boolean leftToRight = true;

        // check if stack is empty 
        while (!currentLevel.isEmpty()) {

            // pop out of stack 
            ZigZagNode ZigZagNode = currentLevel.pop();

            // print the data in it 
            System.out.print(ZigZagNode.data + " ");

            // store data according to current 
            // order. 
            if (leftToRight) {
                if (ZigZagNode.leftChild != null) {
                    nextLevel.push(ZigZagNode.leftChild);
                }

                if (ZigZagNode.rightChild != null) {
                    nextLevel.push(ZigZagNode.rightChild);
                }
            }
            else {
                if (ZigZagNode.rightChild != null) {
                    nextLevel.push(ZigZagNode.rightChild);
                }

                if (ZigZagNode.leftChild != null) {
                    nextLevel.push(ZigZagNode.leftChild);
                }
            }

            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<ZigZagNode> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }
}

public class ZigZagTraversalOfBT {

    // driver program to test the above function 
    public static void main(String[] args)
    {
        ZigZagTraversal tree = new ZigZagTraversal();
        tree.rootZigZagNode = new ZigZagNode(1);
        tree.rootZigZagNode.leftChild = new ZigZagNode(2);
        tree.rootZigZagNode.rightChild = new ZigZagNode(3);
        tree.rootZigZagNode.leftChild.leftChild = new ZigZagNode(7);
        tree.rootZigZagNode.leftChild.rightChild = new ZigZagNode(6);
        tree.rootZigZagNode.rightChild.leftChild = new ZigZagNode(5);
        tree.rootZigZagNode.rightChild.rightChild = new ZigZagNode(4);

        System.out.println("ZigZag Order traversal of binary tree is");
        tree.printZigZagTraversal();
    }
} 