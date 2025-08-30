package queue;

import java.util.*;

public class Queue<E> implements QueueInterface<E> {
	
	private List<E> data = new ArrayList<>();
	
	public void enqueue(E x) {
		data.add(x);	 
	}
	
	// data.size() - data.size() is index 0 or the first element in the ArrayList, FIFO
	public E dequeue() {
		return data.remove(data.size() - data.size());
	}
		
	public E peek() {
		return data.get(data.size() - data.size());
	}
		
	public boolean isEmpty() {
		return data.size() == 0;
	}
		
	//Method check size
	public int size() {
		return data.size();
	}
	
	@Override
	public String toString() { // shows entire queue as a string
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < data.size(); i++) {
	        sb.append(data.get(i));
	        if (i < data.size() - 1) { // puts comma in the string
	            sb.append(", ");
	        }
	    }
	    return sb.toString();
	}


	
}


