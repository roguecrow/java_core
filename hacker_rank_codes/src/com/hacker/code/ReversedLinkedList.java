package com.hacker.code;

import java.util.Scanner;


 class Node {  
    int data;  
    Node next;  
    public Node(int d) {  
        data = d;  
    }  
    
}  

public class ReversedLinkedList {
	
	static void displayList(Node head) {
		while(head!= null) {
			System.out.print(head.data+" ");
			head = head.next;
		}  
	}
	
	static void reverseEvenNo(Node head) {
		
		Node previous = null;
		Node current = head;
		Node next;
		
		while(current != null) {
			if(current.data % 2 == 0) {
				next = current.next;
				current.next = previous;
				previous = current;
				current = next;
			}
			else {
				displayList(previous);
				previous=null;
				System.out.print(current.data+" ");

				current = current.next;
			}
		}
		displayList(previous);
		
	}
	
 
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();
		
		System.out.println("Enter the list :");
		Node head = new Node(sc.nextInt());
		Node current = head;
		
		for(int i = 0;i<size -1 ;i++) {
			current.next = new Node(sc.nextInt());
			current = current.next;
		}
		//displayList(head);
		reverseEvenNo(head);

	}

}



