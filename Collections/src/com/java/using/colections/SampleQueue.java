package com.java.using.colections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//collection code is hacker rank codes :
//	1.stack - ValidParantheses
//	2.linkedList - ReversedLinkedList
//	3.hashmap - romanToInt

class Book {  
int id;  
String name,author;  

public Book(int id, String name, String author) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
}  
public int compareTo(Book book) {  
    if(id>book.id){  
        return 1;  
    }else if(id<book.id){  
        return -1;  
    }else{  
    return 0;  
    }  
}  
}  
public class SampleQueue {  
public static void main(String[] args) {  
    Queue<Book> queue = new LinkedList<Book>();  
    Book b1=new Book(121,"Let us Live","manoj");  
    Book b2=new Book(233,"Mind Blower","thiru");  
    Book b3=new Book(101,"Blinding lights","kishor");  
    queue.add(b1);  
    queue.add(b2);  
    queue.add(b3);  
    System.out.println("Traversing the queue elements:");  
    for(Book b:queue){  
    System.out.println(b.id+" "+b.name+" "+b.author);  
    }  
    queue.remove();
    queue.peek();
    queue.poll();
    System.out.println("After removing one book record:");  
    for(Book b:queue){  
        System.out.println(b.id+" "+b.name+" "+b.author);  
        }  
}  
}  
