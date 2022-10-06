/**
 * QueueInterface.java
 * @author Jerrin C. Redmon
 *
 */

public interface QueueInterface<T> {

	/**
	 * @param entry to be added to the queue
	 */
	public void enqueue(T entry);
	
	/**
	 * @return an entry from the front of the queue
	 * @throws empty exception
	 */
	public T dequeue();
	
	/**
	 * @return the front entry in the queue
	 */
	public T getFront();
	
	/**
	 * @return true if the queue is empty, false if not
	 */
	public boolean isEmpty();
	
	/**
	 * Removes all entries in queue
	 */
	public void clear();
	
	/**
	 * @return integer for current size of the queue
	 */
	public int getSize();
	
}
