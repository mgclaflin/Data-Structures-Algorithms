package org.example;

public class BinaryTree {
    BTNode root;

    public void insert(int data){
        root = insertRecursion(root, data);

    }

    public BTNode insertRecursion(BTNode root, int data){
        if(root==null){
            root = new BTNode(data);
        }
        else if(data<root.data){
            root.left = insertRecursion(root.left,data);
        }
        else if(data>root.data){
            root.right = insertRecursion(root.right, data);
        }
        return root;
    }

    public void inOrder(){
        inOrderRecursion(root);
    }

    public void inOrderRecursion(BTNode root){
        if(root != null){
            inOrderRecursion(root.left);
            System.out.print(root.data+" ");
            inOrderRecursion(root.right);
        }
    }

    public void preOrder(){
        preOrderRecursion(root);
    }

    public void preOrderRecursion(BTNode root){
        if(root != null){
            System.out.print(root.data+" ");
            preOrderRecursion(root.left);
            preOrderRecursion(root.right);
        }
    }


    public void postOrder(){
        postOrderRecursion(root);
    }

    public void postOrderRecursion(BTNode root){
        if(root != null){
            postOrderRecursion(root.left);
            postOrderRecursion(root.right);
            System.out.print(root.data+" ");
        }
    }
}
