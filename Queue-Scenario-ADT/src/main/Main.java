package main;

import queue.*;


public class Main {

	public static void main(String[] args) {
		// using the interface as the type
		QueueInterface<String> q = new Queue<String>();
				
		// adding customers in the queue
		q.enqueue("Danielle Louise");
		q.enqueue("Claire Louisse");
		q.enqueue("Kelsa Armanda");
		q.enqueue("Kristine Joy");
		q.enqueue("Kristine Hyacinth");
		q.enqueue("Christylle Mari");
		
		// shows customer in queue as a string from the ArrayList
		System.out.println("Customer Queueing: " + q);
		System.out.println("...");
		// shows the customer being currently served (q.peek()) then removes their name from the queue (q.dequeue())
		System.out.println("Now Serving: " + q.peek());
		q.dequeue();
		System.out.println("...");

		System.out.println("Now Serving: " + q.peek());
		q.dequeue();
		System.out.println("...");
		
		System.out.println("Now Serving: " + q.peek());
		q.dequeue();
		System.out.println("...");

		System.out.println("Now Serving: " + q.peek());
		q.dequeue();
		System.out.println("...");
		
		System.out.println("Remaining Customer Queueing: " + q);
		System.out.println("...");
		
	}

}
