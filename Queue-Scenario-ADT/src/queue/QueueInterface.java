package queue;

public interface QueueInterface<E> {
	
	void enqueue(E x);
	
	E dequeue();
	
	E peek();
	
	boolean isEmpty();
	
	//Method check size
	int size();
	
}


