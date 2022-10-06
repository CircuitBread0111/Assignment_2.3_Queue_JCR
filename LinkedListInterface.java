/**
 * LinkedListInterface.java
 * @author Jerrin C. Redmon
 *
 * @param <T>
 */


public interface LinkedListInterface <T>{
	
	/**
	 * 
	 * @return
	 */
	public T removeFirst();
	
	/**
	 * 
	 * @return
	 */
	public T removeLast();
	
	/**
	 * 
	 * @param targetElement
	 * @return
	 */
	public T remove(T targetElement);
	
	/**
	 * 
	 * @return
	 */
	public T first();
	
	/**
	 * 
	 * @return
	 */
	public T last();
	
	/**
	 * 
	 * @param targetElement
	 * @return
	 */
	public boolean contains(T targetElement);
	
	/**
	 * 
	 * @return
	 */
	public int size();
	
	/**
	 * 
	 * @return
	 */
	public String toString();
	
	/**
	 * 
	 * @param element
	 */
	public void addToFront(T element);
	
	/**
	 * 
	 * @param element
	 */
	public void addToRear(T element);
	
	/**
	 * 
	 * @param element
	 * @param target
	 */
	public void addAfter(T element, T target);
}