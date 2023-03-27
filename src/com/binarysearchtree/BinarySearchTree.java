package com.binarysearchtree;

public class BinarySearchTree {
    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void insert(int value){
        root = insert(root, value);
    }

    public TreeNode insert( TreeNode root, int value){
        if (root == null || root.data == value){
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data){
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    //Here we are using inorder method to traverse through the node and showing the data.
    public void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

        public static void main(String[] args) {
            System.out.println("Welcome to Binary Search Tree. ");
            BinarySearchTree tree = new BinarySearchTree();
            tree.insert(57);
            tree.insert(30);
            tree.insert(70);
            tree.inOrder(tree.root);

    }
}
