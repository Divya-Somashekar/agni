package com.divya.learning.geeksforgeeks.amazon.online_test_preparetion;

class KthNode
{
    int data;
    KthNode left, right;

    KthNode(int item)
    {
        data = item;
        left = right = null;
    }
}

class NodesFromKthDistanceFromRoot
{
    KthNode root;

    void printKDistant(KthNode node, int k)
    {
        if (node == null)
            return;
        if (k == 0)
        {
            System.out.print(node.data + " ");
            return;
        }
        else
        {
            printKDistant(node.left, k - 1);
            printKDistant(node.right, k - 1);
        }
    }

    /* Driver program to test above functions */
    public static void main(String args[]) {
        NodesFromKthDistanceFromRoot tree = new NodesFromKthDistanceFromRoot();

        /* Constructed binary tree is
                1
              /   \
             2     3
            /  \   /
           4    5 8
        */
        tree.root = new KthNode(1);
        tree.root.left = new KthNode(2);
        tree.root.right = new KthNode(3);
        tree.root.left.left = new KthNode(4);
        tree.root.left.right = new KthNode(5);
        tree.root.right.left = new KthNode(8);

        tree.printKDistant(tree.root, 0);
    }
}