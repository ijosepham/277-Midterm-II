import java.util.NoSuchElementException;

/** creates a queue object with first-in, first-out removal order **/
public class GenQueue < T > {
	
	private Node head;   private Node tail;
	
	/** initializes an empty queue **/
	public GenQueue ( ) {	this.head = null;   this.tail = null;	}
	
	
	/**
	 * adds an element to the tail of the queue
	 * @param data - the new element
	 * **/
	public void add ( T data ) {
		Node newNode = new Node ( );
		newNode.data = data;
		if ( tail == null ) { head = newNode; }
		else { tail.next = newNode; }
		tail = newNode;
	}
	
	/**
	 * removes an element from the head of the queue
	 * @return the head of the queue
	 * @throws NoSuchElementException if the queue is empty
	 * **/
	public T remove ( ) {
		if( head == null ) { throw new NoSuchElementException ( ); }
		T temp = head.data;
		head  = head.next;
		return temp;
	}
	
	/**
	 * gets the first element of the queue
	 * @return the data at the head of the queue
	 * **/
	public T peek ( ) {
		if ( head == null ) { throw new NoSuchElementException ( ); }
		return head.data;
	}
	
	/**
	 * determines if the queue is empty
	 * @return true if the queue is empty, false otherwise
	 * **/
	public boolean isEmpty ( ) {	return head == null; 	}
	
	
	class Node {
		T data;
		Node next;
	}
}
