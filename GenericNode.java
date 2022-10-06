/**
 * GenericNode.java
 * @author Jerrin C. Redmon
 *
 * @param <T>
 */

public class GenericNode<T> {
	private GenericNode<T> next;
	private T element;
	
	public GenericNode() {
		next = null;
		element = null;
	}
	
	/**
	 * 
	 * @param elemt
	 */
	public GenericNode(T elemt) {
		next = null;
		element = elemt;
	}
	
	/**
	 * 
	 * @return
	 */
	public GenericNode<T>getNext(){
		return next;
	}
	
	/**
	 * 
	 * @param node
	 */
	public void setNext(GenericNode<T> node) {
		next = node;
	}
	
	/**
	 * 
	 * @return
	 */
	public T getElement() {
		return element;
	}
	
	/**
	 * 
	 * @param elemt
	 */
	public void setElement(T elemt) {
		element = elemt;
	}
	
}