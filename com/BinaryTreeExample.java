package com;

import java.util.Stack;


public class BinaryTreeExample {

	public static class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int data)
		{
			this.data=data;
		}
	}
	
	public static void  printArray(int[] path,int len)
	{
		for (int i = 0; i < len; i++) {
			System.out.print(" "+path[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		// Creating a binary tree
		TreeNode rootNode=createBinaryTree();
		System.out.println("Printing all paths from root to leaf :");
		printAllPathsToLeaf(rootNode,new int[1000],0);
		
		printLeafNode(rootNode);
	}
	
	public static TreeNode createBinaryTree()
	{
 
		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
		TreeNode node5=new TreeNode(5);
		TreeNode node55=new TreeNode(55);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
		node10.left=node5;
		node50.right=node55;
 
		return rootNode;
	}
	
public static void printAllPathsToLeaf(TreeNode root,int[] p,int leng){
		
		if(root==null)
			return;
		p[leng++] = root.data;
		
		if(root.left == null && root.right==null){
			
			printArray(p,leng);
			
			return;
		}
		
		printAllPathsToLeaf(root.left,p,leng);
		
		printAllPathsToLeaf(root.right,p,leng);
	}

public static void printLeafNode(TreeNode root){
	
	if(root==null)
		return;
	
	if(root.left == null && root.right==null){
		System.out.println("leaf node "+root.data);
	}
	
	printLeafNode(root.left);
	printLeafNode(root.right);
  }

public void inOrder(TreeNode root) {
	if(root !=  null) {
		inOrder(root.left);
		//Visit the node by Printing the node data  
		System.out.printf("%d ",root.data);
		inOrder(root.right);
	}
  }


public void postOrder(TreeNode root) {
	if(root !=  null) {
		postOrder(root.left);
		postOrder(root.right);
		//Visit the node by Printing the node data  
		System.out.printf("%d ",root.data);
	}
}
public void inOrderIter(TreeNode root) {
	 
	if(root == null)
		return;

	Stack<TreeNode> s = new Stack<TreeNode>();
	TreeNode currentNode=root;

	while(!s.empty() || currentNode!=null){

		if(currentNode!=null)
		{
			s.push(currentNode);
			currentNode=currentNode.left;
		}
		else
		{
			TreeNode n=s.pop();
			System.out.printf("%d ",n.data);
			currentNode=n.right;
		}
	}
 }

public void postorderIter( TreeNode root) {
	if( root == null ) return;

	Stack<TreeNode> s = new Stack<TreeNode>( );
	TreeNode current = root;

	while( true ) {

		if( current != null ) {
			if( current.right != null ) 
				s.push( current.right );
			s.push( current );
			current = current.left;
			continue;
		}

		if( s.isEmpty( ) ) 
			return;
		current = s.pop( );

		if( current.right != null && ! s.isEmpty( ) && current.right == s.peek( ) ) {
			s.pop( );
			s.push( current );
			current = current.right;
		} else {
			System.out.print( current.data + " " );
			current = null;
		}
	}
  }

public void preorder(TreeNode root) {
    if(root !=  null) {
   //Visit the node by Printing the node data  
      System.out.printf("%d ",root.data);
      preorder(root.left);
      preorder(root.right);
    }
  }

public void preorderIter(TreeNode root) {
	   
    if(root == null)
        return;

    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root);

    while(!stack.empty()){
     
        TreeNode n = stack.pop();
        System.out.printf("%d ",n.data);

      
        if(n.right != null){
            stack.push(n.right);
        }
        if(n.left != null){
            stack.push(n.left);
        }

    }
    
}


}
