/*
 * Lab 15 part 1
 * 
 * Implement an infinite StackOfObjects class: the elements in the stack are stored in an array Object[] named elements.
 * When you create a stack, the array is also created. The no-arg constructor creates an array with the default capacity
 * of 2. The variable size counts the number of elements in the stack, and size - 1 is the index of the element at the
 * top of the stack. The size should be increased if there is a need of more space in the stack. 
 * 
 * Implement a push() method to push an object into the top of the stack and a pop method to return and remove the top
 * element from the stack.
 */
public class StackOfObjects {
	private int size = 2;
	private Object[] elements = new Object[size];
	private int index = size -1;
	
	public StackOfObjects(){
		this.size = 2;
	}
	
	public void push(Object o){
		this.size++;
		elements[index] = o;
	}
	
	public Object pop(){
		Object newObj = elements[index];
		this.size--;
		return newObj;
	}
}