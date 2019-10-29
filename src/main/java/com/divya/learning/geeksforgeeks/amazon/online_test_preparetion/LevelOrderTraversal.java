package com.divya.learning.geeksforgeeks.amazon.online_test_preparetion;

// Recursive Java program for level order traversal of Binary Tree

/* Class containing left and right child of current
node and key value*/
class LONode
{
    int data;
    LONode left, right;
    public LONode(int item)
    {
        data = item;
        left = right = null;
    }
}

class LevelOrderTraversal
{
    // Root of the Binary Tree
    LONode root;

    public LevelOrderTraversal()
    {
        root = null;
    }

    /* function to print level order traversal of tree*/
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(LONode root)
    {
        if (root == null)
            return 0;
        else
        {
            /* compute height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }

    /* Print nodes at the given level */
    void printGivenLevel (LONode root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {

        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root= new LONode(1);
        tree.root.left= new LONode(2);
        tree.root.right= new LONode(3);
        tree.root.left.left= new LONode(4);
        tree.root.left.right= new LONode(5);
        tree.root.left.left.left= new LONode(9);
        tree.root.left.left.right= new LONode(10);
        tree.root.left.right.left = new LONode(13);
        tree.root.left.right.right = new LONode(15);
        tree.root.left.right.left.left= new LONode(6);
        tree.root.left.right.left.right= new LONode(7);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
    }
}
