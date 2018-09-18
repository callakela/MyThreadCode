package com;

public class ReverseLinkedListInPair {
	
	Node head;
	
	public static class Node {
		Node next;
		int data ;
		
		Node(int data){
			this.data=data;
			next=null;
		}
		
	}
	
	public void addToTheLast(Node node) {
		 
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
 
			temp.next = node;
		}
	}
 
 
	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static Node reverseLinkedListInPairs(Node head){
		
		Node current=head,temp=null,nextNode=null;
		
		while(current!=null){
			
			if (temp != null) {
				// This is important step
				temp.next.next = current.next;
			}
			
			temp=current.next;
			current.next=temp.next;
			temp.next=current;
			
			if (nextNode == null)
				nextNode = temp;
			current=current.next;
		}
		
		return nextNode;
	}
	
	public static Node reverseLinkedList(Node currentNode)
	{
		// For first node, previousNode will be null
		Node previousNode=null;
		Node nextNode;
		while(currentNode!=null)
		{
			nextNode=currentNode.next;
			// reversing the link
			currentNode.next=previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode=currentNode;
			currentNode=nextNode;
		}
		return previousNode;
	}
	
	
	public boolean ifLoopExists() {
		  Node fastPtr = head;
		  Node slowPtr = head;
		  while (fastPtr != null && fastPtr.next != null) {
		   fastPtr = fastPtr.next.next;
		   slowPtr = slowPtr.next;
		   if (slowPtr == fastPtr)
		    return true;
		 
		  }
		  return false;
		 }
	
	
 
	public static void main(String[] args) {
		ReverseLinkedListInPair list = new ReverseLinkedListInPair();
		// Creating a linked list
		Node head=new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));
		list.addToTheLast(new Node(8));
 
		list.printList(head);
		//Reversing LinkedList in pairs
		/*Node result=reverseLinkedListInPairs(head);
		System.out.println("After reversing in pair");
		list.printList(result);
		*/
		/*Node reverseHead=reverseLinkedList(head);
		System.out.println("After reversing");
		list.printList(reverseHead);*/
		
		//printAllPathsToLeaf(head,new int[100],0);
 
	}

}
