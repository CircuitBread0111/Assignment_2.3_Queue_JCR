/**
 * GenericLinkedList.java
 * @author Jerrin C. Redmon
 *
 * @param <T>
 */


public class GenericLinkedList<T> implements LinkedListInterface<T> {

	protected GenericNode<T> head; 
	protected GenericNode<T> tail; 
	protected int count; 
	protected int modCount;
	
	
	public GenericLinkedList()
	{
		head=null;
		count=0;
		tail=head;
	}
	
	@Override
	public T removeFirst() { 
		if (isEmpty()) {
			throw new EmptyCollectionException ("LinkedLists");
		}
		
		count--;
		T ret = head.getElement();
		head = head.getNext();
		return ret;
	}

	@Override
	public T removeLast() {
		if (isEmpty()) {
			throw new EmptyCollectionException ("LinkedLists");
		}
		GenericNode<T> temp = head;
		while(temp.getNext()!= tail) {
			temp = temp.getNext();
		}
		
		count--;
		T last = tail.getElement();
		tail = temp;
		tail.setNext(null);
		return last;
	}

	@Override
	public T remove(T targetElement) {
		if (isEmpty()) { 
			throw new EmptyCollectionException ("LinkedLists");
		}
		boolean found = false;
		GenericNode<T> previous = null;
		GenericNode<T> current = head;
		
		while (current != null && !found) {
			if (targetElement.equals(current.getElement())) {
				found = true;
			} else {
				previous = current;
				current = current.getNext();
			}
		}
		
		if (!found) {
			throw new ElementNotFoundException("LinkedList");
		}
		
		if (size() == 1) {
			head = tail = null;
		} else if (current.equals(head)) {
			head = current.getNext();
		} else if (current.equals(tail)) {
			tail = previous;
			tail.setNext(null);
		} else {
			previous.setNext(current.getNext());
			count--;
			modCount++;
			return current.getElement();
		}
		
		return current.getElement();
	}

	@Override
	public T first() {
		if (isEmpty()) {
			throw new EmptyCollectionException ("LinkedLists");
		}
		return head.getElement();
	}

	@Override
	public T last() {
		if (isEmpty()) {
			throw new EmptyCollectionException ("LinkedLists");
		}
		return tail.getElement();
	}

	@Override
	public boolean contains(T targetElement) {
		if (isEmpty()) {
			throw new EmptyCollectionException ("LinkedLists");
		}
		
		GenericNode<T> temp = head;
		while(!temp.getElement().equals(targetElement)) {
			if (temp.getNext() == null) {
				return false;
			} else {
				temp = temp.getNext();
			}
		}
		
		return true;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public void addToFront(T element) {
		GenericNode<T> newNode = new GenericNode<T>(element);
		newNode.setNext(head);
		head = newNode;
		count++;
	}

	@Override
	public void addToRear(T element) {
		GenericNode<T> newNode = new GenericNode<T>(element);
		if (tail != null) {
			tail.setNext(newNode);
			tail = newNode;
		} else {
			head = tail = newNode;
		}
		count++;
	}

	@Override
	public void addAfter(T element, T target) {
		GenericNode<T> newNode = new GenericNode<T>(element);
		
		GenericNode<T> temp = head;
		while(!temp.getElement().equals(target)) {
			if (temp.getNext() == null) {
				throw new ElementNotFoundException("LinkedList");
			} else {
				temp = temp.getNext();
			}
		}
		
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
	}
		
	
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public GenericNode<T> getList()
	{
		return head;
	}//end getList

}