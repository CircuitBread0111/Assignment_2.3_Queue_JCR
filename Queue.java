/**
 * Queue.java
 * @author Jerrin C. Redmon
 * @param <T>
 */

public class Queue<T> implements QueueInterface<T> {

	private GenericLinkedList<T> waitingLine;
	
	public Queue() {//Constructor
		waitingLine = new GenericLinkedList<T>();
	}
	
	@Override
	public void enqueue(T entry) {//adds elements to the rear of queue
		waitingLine.addToRear(entry);
		
	}

	@Override
	public T dequeue() {//removes elements from front of queue
		return waitingLine.removeFirst();
	}

	@Override
	public T getFront() {//checks the front element of the queue
		return waitingLine.first();
	}

	@Override
	public boolean isEmpty() {//checks if queue is empty
		return waitingLine.isEmpty();
	}

	@Override
	public void clear() {//removes all items from queue
		while (!waitingLine.isEmpty()) { 
			waitingLine.removeFirst();
		}
	}

	@Override
	public int getSize() {//gets number of elements in queue
		return waitingLine.size();
	}
	

}
