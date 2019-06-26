package com.divya.learning.geeksforgeeks.amazon.online_test_preparetion;

class NodeLV
{
    int data;
    NodeLV left, right;

    public NodeLV(int item)
    {
        data = item;
        left = right = null;
    }
}

/* Class to print the left view */
class _4_LeftViewOfBT
{
    NodeLV root;
    static int  max_level = 0;

    // recursive function to print left view
    void leftViewUtil(NodeLV node, int level)
    {
        // Base Case
        if (node==null) return;

        // If this is the first node of its level
        if (max_level < level)
        {
            System.out.print(" " + node.data);
            max_level = level;
        }

        // Recur for left and right subtrees
        leftViewUtil(node.left, level+1);
        leftViewUtil(node.right, level+1);
    }

    // A wrapper over leftViewUtil()
    void leftView()
    {
        leftViewUtil(root, 1);
    }

    /* testing for example nodes */
    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
        _4_LeftViewOfBT tree = new _4_LeftViewOfBT();
        tree.root = new NodeLV(12);
        tree.root.left = new NodeLV(10);
        tree.root.right = new NodeLV(30);
        tree.root.right.left = new NodeLV(25);
        tree.root.right.right = new NodeLV(40);

        tree.leftView();
    }
}